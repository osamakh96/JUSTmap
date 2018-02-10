package justmap.just.com.justmap.Onboarding;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import justmap.just.com.justmap.Log_in_activity;
import justmap.just.com.justmap.R;

public class Onboarding_activity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private Slider_Adapter slider_adapter;
    private TextView[] dots;
    private Button backBTN, nextBTN,skipBTN;
    private int current_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        dotsLayout = findViewById(R.id.dotsLayout);
        backBTN = findViewById(R.id.backBTN);
        nextBTN = findViewById(R.id.nextBTN);
        skipBTN = findViewById(R.id.skipBTN);

        slider_adapter = new Slider_Adapter(this);

        viewPager.setAdapter(slider_adapter);

        addDotsIndicator(0);

        viewPager.addOnPageChangeListener(viewListener);

        skipBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Log_in_activity.class));
            }
        });

        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(current_page-1);
            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(current_page==dots.length-1)
                {
                    startActivity(new Intent(getApplicationContext(),Log_in_activity.class));
                }
                else
                viewPager.setCurrentItem(current_page+1);
            }
        });

    }//end onCreate

    public void addDotsIndicator(int position) {

        dots = new TextView[9];
        dotsLayout.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.colorPrimary));

            dotsLayout.addView(dots[i]);
        }//end for

        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.colorWhite));
            dots[position].setTextSize(40);
        }

    }//end addDotsIndicator

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
            current_page = position;

            if (position == 0) {
                nextBTN.setEnabled(true);
                backBTN.setEnabled(false);
                backBTN.setVisibility(View.INVISIBLE);
                nextBTN.setText("Next");
                backBTN.setText("");
            }
            else if (position == dots.length-1) {
                nextBTN.setEnabled(true);
                backBTN.setEnabled(true);
                backBTN.setVisibility(View.VISIBLE);
                nextBTN.setText("Finish");
                backBTN.setText("Back");
            }
            else{
                nextBTN.setEnabled(true);
                backBTN.setEnabled(true);
                backBTN.setVisibility(View.VISIBLE);
                nextBTN.setText("Next");
                backBTN.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}//end class

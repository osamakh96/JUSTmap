package justmap.just.com.justmap;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import justmap.just.com.justmap.Onboarding.Onboarding_activity;

public class Splash_activity extends AppCompatActivity {

    // Splash screen timer
    Boolean i = true;
    private static int SPLASH_TIME_OUT = 3000;
    TextView title,vision;
    LinearLayout appName_layout;
    ImageView logoIV,map_with_pins_IV;
    Animation alpha_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        title = findViewById(R.id.appName);
        vision = findViewById(R.id.visionTV);
        appName_layout = findViewById(R.id.appName_layout);
        logoIV = findViewById(R.id.logoIV);
        map_with_pins_IV = findViewById(R.id.map_with_pins_IV);
        Typeface title_font = Typeface.createFromAsset(getAssets(), "android.ttf");
        title.setTypeface(title_font);
        Typeface visio_font = Typeface.createFromAsset(getAssets(), "dancing.otf");
        vision.setTypeface(visio_font);

        //animation
        alpha_anim = AnimationUtils.loadAnimation(this,R.anim.alpha);
        appName_layout.setAnimation(alpha_anim);
        logoIV.setAnimation(alpha_anim);
        map_with_pins_IV.setAnimation(alpha_anim);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if(i)
                {
                    // This method will be executed , once the timer is over
                    // Start your app main activity
                    Intent i = new Intent(Splash_activity.this , Onboarding_activity.class);
                    startActivity(i);

                    // close ActivitySplash
                    finish();
                }

            }
        }, SPLASH_TIME_OUT);

    }//end onCreate
}//end Class

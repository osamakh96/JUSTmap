package justmap.just.com.justmap;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Log_in_activity extends AppCompatActivity {

    TextView loginTV,studentTV,instructorTV,guestTV;
    LinearLayout student_layout,instructor_layout,guest_layout;
    EditText userID,password;
    Button login_BTN;
    ImageView studentIV,instructorIV,guestIV;
    LinearLayout id_pass_layout,users_layout;
    Animation up_down_anim,down_up_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_layout);

        loginTV = findViewById(R.id.login_in_TV);
        student_layout = findViewById(R.id.studentLL);
        instructor_layout = findViewById(R.id.instructorLL);
        guest_layout = findViewById(R.id.guestLL);
        userID = findViewById(R.id.userID_ET);
        password = findViewById(R.id.passwordET);
        login_BTN = findViewById(R.id.log_in_BTN);
        studentIV = findViewById(R.id.studentIV);
        instructorIV = findViewById(R.id.instructorIV);
        guestIV = findViewById(R.id.guestIV);
        id_pass_layout = findViewById(R.id.id_pass_layout);
        users_layout = findViewById(R.id.users_layout);

        //font
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "android.ttf");
        loginTV.setTypeface(custom_font);

        //animation
        up_down_anim = AnimationUtils.loadAnimation(this,R.anim.up_down);
        loginTV.setAnimation(up_down_anim);
        id_pass_layout.setAnimation(up_down_anim);

        down_up_anim = AnimationUtils.loadAnimation(this,R.anim.down_up);
        users_layout.setAnimation(down_up_anim);
        login_BTN.setAnimation(down_up_anim);

//        studentTV.setTypeface(studentTV.getTypeface(), Typeface.BOLD);

        student_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userID.setHint(" Student ID");
                studentIV.getLayoutParams().height = 160;
                instructorIV.getLayoutParams().height = 130;
                guestIV.getLayoutParams().height = 130;
                studentIV.requestLayout();
                instructorIV.requestLayout();
                guestIV.requestLayout();
//                studentTV.setTypeface(studentTV.getTypeface(),Typeface.BOLD);
//                instructorTV.setTypeface(instructorTV.getTypeface(), Typeface.NORMAL);
//                guestTV.setTypeface(guestTV.getTypeface(), Typeface.NORMAL);
            }
        });

        instructor_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userID.setHint(" Instructor ID");
                studentIV.getLayoutParams().height = 130;
                instructorIV.getLayoutParams().height = 160;
                guestIV.getLayoutParams().height = 130;
                studentIV.requestLayout();
                instructorIV.requestLayout();
                guestIV.requestLayout();
//                studentTV.setTypeface(studentTV.getTypeface(), Typeface.NORMAL);
//                instructorTV.setTypeface(instructorTV.getTypeface(), Typeface.BOLD);
//                guestTV.setTypeface(guestTV.getTypeface(), Typeface.NORMAL);
            }
        });

        guest_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentIV.getLayoutParams().height = 130;
                instructorIV.getLayoutParams().height = 130;
                guestIV.getLayoutParams().height = 160;
                studentIV.requestLayout();
                instructorIV.requestLayout();
                guestIV.requestLayout();
//                studentTV.setTypeface(studentTV.getTypeface(), Typeface.NORMAL);
//                instructorTV.setTypeface(instructorTV.getTypeface(), Typeface.NORMAL);
//                guestTV.setTypeface(guestTV.getTypeface(), Typeface.BOLD);
            }
        });

        login_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MapsActivity_Test.class));
            }
        });

    }//end onCreate
}//end class
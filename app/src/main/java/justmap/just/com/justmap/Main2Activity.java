package justmap.just.com.justmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button login;
    TextView user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        login = findViewById(R.id.loginBTN);
        user = findViewById(R.id.userET);
        pass = findViewById(R.id.passET);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(user.getText().toString()=="")
                    user.setError("isert username");
                else if(pass.getText().toString()=="")
                    pass.setError("isert password");
                else{



                }
            }
        });

    }//end onCreate
}//end class

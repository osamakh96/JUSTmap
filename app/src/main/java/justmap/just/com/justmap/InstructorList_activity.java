package justmap.just.com.justmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InstructorList_activity extends AppCompatActivity {

    ListView instructorsLV;
    String[] instructorsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructor_list_layout);

        instructorsLV = findViewById(R.id.instructorsLV);
        instructorsArray = getResources().getStringArray(R.array.instructors);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, instructorsArray);
        instructorsLV.setAdapter(adapter);

    }//end onCreate
}//end class

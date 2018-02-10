package justmap.just.com.justmap.Onboarding;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import justmap.just.com.justmap.R;

public class Slider_Adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Slider_Adapter(Context context) {
        this.context = context;
    }

    //Arrays
    public int[] slides_imagse={
      R.drawable.search_icon, R.drawable.navigation_icon, R.drawable.schedule_icon,R.drawable.alarm_clock,
      R.drawable.events_icon, R.drawable.gallery_icon, R.drawable.instructor_icon ,R.drawable.secure_icon,R.drawable.favorite_icon
    };

    public String[] slides_headings={
            "Easily search" ,"Navigation","Course Schedule","Alert",
            "Events" ,"Gallery","Instructors","Privacy","Favorite List"
    };

    public String[] slides_descriptions={
            "Make an easily search for any place you want in the university with highly qualified system." ,
            "Navigation service will provide a guiding to arrive you to wherever you want to go.",
            "The app will import your Schedule if you are a student or instructor to give u many great features.",
            "The app will alert you about your lectures and the events which you joined to it on its specific time.",
            "You can show the events of the university and make join to get involved and get alert at the event time.",
            "You can explore the most popular places in the university, and make a navigation whenever you want.",
            "You can search for any instructor you want and see its office hours and place.",
            "The system ensures the privacy of your personal information.",
            "You can save a specific site to your favorite list and you can return to it later."
    };

    @Override
    public int getCount() {
        return slides_headings.length;
    }//end getCount

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }//end isViewFromObject

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slides_layout,container,false);

        ImageView slideIV = view.findViewById(R.id.slideIV);
        TextView slideHeadingTV = view.findViewById(R.id.headingTV);
        TextView slideDescriptionTV = view.findViewById(R.id.descriptionTV);

        slideIV.setImageResource(slides_imagse[position]);
        slideHeadingTV.setText(slides_headings[position]);
        slideDescriptionTV.setText(slides_descriptions[position]);

        container.addView(view);

        return view;
    }//end instantiateItem

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);

    }//end destroyItem

}//end class

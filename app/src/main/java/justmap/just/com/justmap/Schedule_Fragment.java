package justmap.just.com.justmap;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Schedule_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    //    private RecyclerView recyclerView;
//    private RecyclerView.Adapter adapter;
//    private List<LauncherActivity.ListItem> listItems;
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private String mParam2;
//
//
//    public Schedule_Fragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Schedule_Fragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static Schedule_Fragment newInstance(String param1, String param2) {
//        Schedule_Fragment fragment = new Schedule_Fragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            String mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
////        View view;
////        view = inflater.inflate(R.layout.fragment_store, container, false);
////        String[] carName = {"Camaro","Pugatti","Audi"};
////        String[] description = {"2017 zl1","2018 Chiron","2018 Audi R8"};
////        String[] price = {"$61,140","€2,400,000","£120,000"};
////        int[] image = {R.drawable.camaro_zl1,R.drawable.bugatti_chiron,R.drawable.audi_2018};
////
////        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
////        recyclerView.setHasFixedSize(true);
////        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
////        listItems = new ArrayList<>();
////
////        for(int i=0 ; i<3 ; i++)
////        {
////            ListItem items = new ListItem(carName[i],description[i],price[i],image[i]);
////            listItems.add(items);
////        }//end for
////
////        adapter = new Adapter(listItems,getActivity());
////
////        recyclerView.setAdapter(adapter);
//
////        return view;
//
//    }

}
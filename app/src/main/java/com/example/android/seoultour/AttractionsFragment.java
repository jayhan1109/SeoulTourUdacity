package com.example.android.seoultour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_tour, container, false);


        ArrayList<Tour> tours=new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.gwanghwamoon,"GwangHwa Moon","JONG_RO-GU","9 AM ~ 5 PM"));
        tours.add(new Tour(R.drawable.lotteworld,"Lotte World","SONG_PA-GU","9:30 AM ~ 10 PM"));
        tours.add(new Tour(R.drawable.seoultower,"Seoul Tower","YONG_SAN-GU","10 AM ~ 11 PM"));
        tours.add(new Tour(R.drawable.gyeongbokpalace,"GyeongBok Palace","JONG_RO-GU","9 AM ~ 6 PM"));
        tours.add(new Tour(R.drawable.jongmyo,"JongMyo","JONG_RO-GU","RESERVATION"));
        tours.add(new Tour(R.drawable.myeongdong,"MyeongDong","JOONG-GU","9 AM ~ 11 PM"));
        tours.add(new Tour(R.drawable.hongdae,"HongDae","MA_PO-GU","24 HOURS"));
        tours.add(new Tour(R.drawable.cheonggyecheon,"CyeongGyeCheon","JONG_RO-GU","24 HOURS"));
        tours.add(new Tour(R.drawable.insadong,"InsaDong","JONG_RO-GU","9 AM ~ 23 PM"));
        tours.add(new Tour(R.drawable.noryangjinmarket,"Noryangjin Market","DONG_JAK-GU","24 HOURS"));
        tours.add(new Tour(R.drawable.bukhanmountain,"Bukhan Mountain","SEONG_BUK-GU","24 HOURS"));


        TourAdapter tourAdapter=new TourAdapter(getActivity(),tours);

        GridView gridView=(GridView) rootView.findViewById(R.id.tour_activity);

        gridView.setNumColumns(2);

        gridView.setAdapter(tourAdapter);

        return rootView;
    }

}

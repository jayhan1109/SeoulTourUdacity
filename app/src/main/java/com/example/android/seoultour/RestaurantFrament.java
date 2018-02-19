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
public class RestaurantFrament extends Fragment {


    public RestaurantFrament() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_tour, container, false);


        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.drawable.gusto_taco,"Gusto Taco","MA_PO-GU","24 HOURS"));
        tours.add(new Tour(R.drawable.jeong_restaurant,"Jeong Restaurant","GANG_NAM-GU","12 PM ~ 3 PM"));
        tours.add(new Tour(R.drawable.vatos,"VATOS","YONG_SAN-GU","11:30 AM ~ 11 PM"));
        tours.add(new Tour(R.drawable.issac_toast,"Issac Toast","JOONG-GU","24 HOURS"));
        tours.add(new Tour(R.drawable.tabolo_24,"Tabolo 24","JONG_RO-GU","6:30 AM ~ 10 PM"));
        tours.add(new Tour(R.drawable.cafe_mamas,"Cafe Mamas","JOONG-GU","9 AM ~ 10 PM"));
        tours.add(new Tour(R.drawable.aria,"Aria","JOONG-GU","7 AM ~ 10 PM"));
        tours.add(new Tour(R.drawable.plant,"Plant","YONG_SAN-GU","10 AM ~ 10 PM"));
        tours.add(new Tour(R.drawable.kyochon,"Kyochon Chicken","MA_PO-GU","12 PM ~ 2 AM"));
        tours.add(new Tour(R.drawable.myeongdong_gyoja,"MyeongDong Gyoja","JOONG-GU","10:30 AM ~ 9:30 AM"));

        TourAdapter tourAdapter=new TourAdapter(getActivity(),tours);

        GridView gridView=(GridView) rootView.findViewById(R.id.tour_activity);

        gridView.setNumColumns(2);

        gridView.setAdapter(tourAdapter);

        return rootView;
    }

}

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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_tour, container, false);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.drawable.katy_perry,"Katy Perry","Gocheok Sky Dome","April 6 (FRI) 7 PM"));
        tours.add(new Tour(R.drawable.lany,"LANY","YES24 LIVE Hall","April 7 (SAT) 7 PM"));
        tours.add(new Tour(R.drawable.phoenix,"PHOENIX","Blue Square","April 21 (SAT) 6 PM"));
        tours.add(new Tour(R.drawable.dua_lipa,"Dua Lipa","YES24 LIVE Hall","May 6 (SUN) 7 PM"));
        tours.add(new Tour(R.drawable.world_dj_festival,"World DJ Festival","Seoul Stadium"," May 26 (SAT) 12 PM"));
        tours.add(new Tour(R.drawable.ultra_korea,"Ultra Music Festival","Seoul Stadium","June 8 (FRI) 12 PM"));
        tours.add(new Tour(R.drawable.water_bomb,"Water Bomb","Seoul Stadium","July 21 (SAT) 1 PM"));
        tours.add(new Tour(R.drawable.world_club_dome,"World Club Dome","Gocheok Sky Dome","September 14 (FRI) 6 PM"));

        TourAdapter tourAdapter=new TourAdapter(getActivity(),tours);

        GridView gridView=(GridView) rootView.findViewById(R.id.tour_activity);

        gridView.setNumColumns(2);

        gridView.setAdapter(tourAdapter);

        return rootView;
    }

}

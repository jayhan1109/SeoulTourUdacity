package com.example.android.seoultour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

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


        TourAdapter tourAdapter=new TourAdapter(this,tours);

        GridView listView=(GridView) findViewById(R.id.tour_activity);

        listView.setNumColumns(2);

        listView.setAdapter(tourAdapter);
    }
}

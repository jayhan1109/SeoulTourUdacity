package com.example.android.seoultour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jungh on 2/19/2018.
 */

public class TourAdapter extends ArrayAdapter<Tour>{

    public TourAdapter(@NonNull Context context,ArrayList<Tour> arrayAdapter) {
        super(context, 0,arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.tour_list,parent,false);
        }

        Tour tours=getItem(position);

        ImageView tourImage=(ImageView) listItemView.findViewById(R.id.list_image);
        tourImage.setImageResource(tours.getmImage());

        TextView tourName=(TextView) listItemView.findViewById(R.id.list_name);
        tourName.setText(tours.getmName());

        TextView tourLocation=(TextView) listItemView.findViewById(R.id.list_location);
        tourLocation.setText(tours.getmLocation());

        TextView tourTime=(TextView) listItemView.findViewById(R.id.list_time);
        tourTime.setText(tours.getmTime());

        return listItemView;
    }
}

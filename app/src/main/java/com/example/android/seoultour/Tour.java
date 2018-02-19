package com.example.android.seoultour;

/**
 * Created by jungh on 2/19/2018.
 */

public class Tour {


    private int mImage;
    private String mName;
    private String mLocation;
    private String mTime;

    public Tour(int image,String name,String location,String time){
        this.mImage=image;
        this.mName=name;
        this.mLocation=location;
        this.mTime=time;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTime() {
        return mTime;
    }

}

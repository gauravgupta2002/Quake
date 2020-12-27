package com.example.quake;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    String mUrl;

    public Earthquake(double magnitude,String Location,long TimeInMilliseconds,String url){
        mMagnitude=magnitude;
        mLocation=Location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude(){ return mMagnitude; }

    public String getlocation(){ return mLocation; }

    public long getTimeInMilliseconds(){ return mTimeInMilliseconds; }

    public String getUrl(){ return mUrl; }
}

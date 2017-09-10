package com.example.android.quakereport;

/**
 * Created by Selim Reza on 8/23/2017.
 */

public class EarthquackData {
    private Double magnitude;
    private String loacation;
    private Long time;
    private String url;

    public EarthquackData(Double magnitude, String loacation, Long time,String url) {
        this.magnitude = magnitude;
        this.loacation = loacation;
        this.time = time;
        this.url =url;
    }

    public Double getMagnitude() {
     return magnitude;
    }

    public String getLoacation() {
        return loacation;
    }

    public Long getTime() {
        return time;
    }

    public String getUrl(){
        return url;
    }
}

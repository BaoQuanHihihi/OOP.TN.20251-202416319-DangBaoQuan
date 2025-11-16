package com.hust.kstn.models;

public class Track {
    // attributes
    private String title;
    private int length;

    // constructors
    public Track() {
        this.title = "None";
        this.length = 100;
    }

    public Track(String title, int lenth) {
        this.title = title;
        this.length = lenth;
    }

    //methods
    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public String toString() {
        return "(" + this.title + ", " + this.length + ")";
    }


    public void playDemoTrack() {
        if(this.length <= 0) System.out.println("Error, cannot play this track");
        else System.out.println("Playing track: " + this.title + " (" + this.length + ")");
    }
}

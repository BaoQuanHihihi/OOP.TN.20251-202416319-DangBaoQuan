package com.hust.kstn.models;

public class Disc extends Media {
    protected int length = 0;

    // constructors
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    // methods
    public int getLength() {
        return this.length;
    }
}

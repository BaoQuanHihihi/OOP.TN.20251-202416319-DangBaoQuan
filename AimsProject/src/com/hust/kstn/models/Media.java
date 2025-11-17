package com.hust.kstn.models;

public class Media {
    protected static int nbMedias = 0;
    protected int id;
    protected String title;
    protected float cost;
    protected String category;


    // constructors
    public Media() {
        this.id = ++nbMedias;
    }

    public Media(String title, String category, float cost) {
        this.id = ++nbMedias;
        this.title = title;
        this.cost = cost;
        this.category = category;
    }


    // methods
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public float getCost() {
        return this.cost;
    }
    
    @Override
    public String toString() {
        return "Media" + "[" + this.id + "]"
                        + "[" + this.title + "]"
                        + "[" + this.cost + "]"
                        + "[" + this.category + "]";
    }
}

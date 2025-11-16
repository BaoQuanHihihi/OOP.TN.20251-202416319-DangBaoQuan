package com.hust.kstn.models;

public class DigitalVideoDisc {
    //attributes
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //constructors
    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    
    //methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void viewDVDInfo() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + cost);
        System.out.println("==================");
    }

    public void previewDemoDVD() {
        // TODO
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DigitalVideoDisc other = (DigitalVideoDisc) obj;

        return id == other.id &&
            length == other.length &&
            Float.compare(other.cost, cost) == 0 &&
            title.equalsIgnoreCase(other.title) &&
            category.equalsIgnoreCase(other.category) &&
            director.equalsIgnoreCase(other.director);
    }
}

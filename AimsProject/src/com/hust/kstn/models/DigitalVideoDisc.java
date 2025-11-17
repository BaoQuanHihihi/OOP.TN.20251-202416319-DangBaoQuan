package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    protected String director;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
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
        if(this.length <= 0) System.out.println("Error, cannot play this DVD");
        else {
            System.out.println("DVD title: " + this.title);
            System.out.println("DVD length: " + this.length);
        }
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

    @Override
    public String toString() {
        return super.toString()
                + "[" + this.director + "]"
                + "[" + this.length + "]";
    }
}

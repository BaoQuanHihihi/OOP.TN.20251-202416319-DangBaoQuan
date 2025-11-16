package com.hust.kstn.models;

public class BookAuthor {
    // attributes
    private String fullName;
    private int yearOfBirth;
    private String shortBiography;

    // constructors
    public BookAuthor() {
        this.fullName = "Bao Quan dep trai";
        this.yearOfBirth = 2006;
        this.shortBiography = "Nothing";
    }

    public BookAuthor(String fullName, int yearOfBirth, String shortBiography) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.shortBiography = shortBiography;
    }


    // methods
    @Override
    public String toString() {
        return this.fullName + " ("
                + this.yearOfBirth + ", "
                + this.shortBiography + ")\n";
    }
}

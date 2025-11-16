package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    // attributes
    private static int nbBooks = 0;

    private int id;
    private String title;
    private String category;
    private float cost;
    private List<BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;

    // constructors
    public Book() {
        nbBooks++;
        this.id = nbBooks;
    }

    public Book(String title, String category, float cost, int numOfTokens, List<BookAuthor> authors) {
        nbBooks++;
        this.id = nbBooks;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }




    //methods
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

    public List<BookAuthor> getAuthors() {
        return this.authors;
    }

    public int getNumOfTokens() {
        return this.numOfTokens;
    }


    @Override
    public String toString() {
        return "Book[" + this.id + "]["
                        + this.title + "]["
                        + this.cost + "]["
                        + this.category + "]["
                        + this.numOfTokens + "]"
                        + "\nAuthors: " + this.authors;
    }
}

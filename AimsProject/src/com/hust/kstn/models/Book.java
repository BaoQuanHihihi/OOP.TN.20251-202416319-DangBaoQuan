package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    protected List<BookAuthor> authors = new ArrayList<>();
    protected int numOfTokens;

    public Book(String title, String category, float cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[" + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }

    public List<BookAuthor> getAuthors() {
        return this.authors;
    }

    public int getNumOfTokens() {
        return this.numOfTokens;
    }
}
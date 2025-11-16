package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    // attributes
    private static int nbBooks = 0;
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<BookAuthor> artists = new ArrayList<>();
    private List<BookAuthor> directors = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();

    // constructors
    public CompactDisc() {
        nbBooks++;
        this.id = nbBooks;
    }

    public CompactDisc(String title, String category, float cost, List<BookAuthor> artists, List<BookAuthor> directors, List<Track> tracks) {
        nbBooks++;
        this.id = nbBooks;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artists = artists;
        this.directors = directors;
        this.tracks = tracks;
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

    public List<BookAuthor> getArtists() {
        return this.artists;
    }

    public List<BookAuthor> getDirectors() {
        return this.directors;
    }

    public List<Track> getTracks() {
        return this.tracks;
    }


    @Override
    public String toString() {
        return "CompactDisc[" + this.id + "]["
                        + this.title + "]["
                        + this.cost + "]["
                        + this.category + "]"
                        + "\nArtists: " + this.artists
                        + "\nDirectors: " + this.directors
                        + "\nTrack: " + this.tracks;
    }

    public int totalLength() {
        int sum  = 0;
        for(Track temp : tracks) sum += temp.getLength();
        return sum;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public void removeTrack(Track track) {
        this.tracks.remove(track);
    }

    public void playDemoCD() {
        System.out.println("Playing CD: " + this.title);
        System.out.println("Total length: " + this.totalLength() + " seconds");
        for(Track temp : this.tracks) temp.playDemoTrack();
        System.out.println("");
    }
}

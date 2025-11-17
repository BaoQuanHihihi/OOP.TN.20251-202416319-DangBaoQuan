package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    protected List<BookAuthor> artists = new ArrayList<>();
    protected List<BookAuthor> directors = new ArrayList<>();
    protected List<Track> tracks = new ArrayList<>();


    public CompactDisc(String title, String category, float cost, List<BookAuthor> artists, List<BookAuthor> directors, List<Track> tracks) {
        super(title, category, cost);
        this.artists = artists;
        this.directors = directors;
        this.tracks = tracks;
        for(Track temp : tracks) length += temp.getLength();
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
        return super.toString()
                + "\nArtists: " + this.artists
                + "\nDirectors: " + this.directors
                + "\nTrack: " + this.tracks;
    }

    public void addTrack(Track track) {
        this.length += track.getLength();
        this.tracks.add(track);
    }

    public void removeTrack(Track track) {
        this.length -= track.getLength();
        this.tracks.remove(track);
    }

    public void playDemoCD() {
        System.out.println("Playing CD: " + this.title);
        System.out.println("Total length: " + this.length + " seconds");
        for(Track temp : this.tracks) temp.playDemoTrack();
        System.out.println("");
    }
}
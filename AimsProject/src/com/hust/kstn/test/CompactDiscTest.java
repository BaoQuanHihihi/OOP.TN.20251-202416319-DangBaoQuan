package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;


public class CompactDiscTest {
    public static void main(String[] args) {
        BookAuthor artist1 = new BookAuthor("Taylor Swift", 1989, "American singer-songwriter");
        BookAuthor artist2 = new BookAuthor("Ariana Grande", 1993, "American pop star");

        BookAuthor director1 = new BookAuthor("John Cena", 1977, "Famous director");
        BookAuthor director2 = new BookAuthor("Michael Bay", 1965, "Action movie director");

        List<BookAuthor> artists = new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);

        List<BookAuthor> directors = new ArrayList<>();
        directors.add(director1);
        directors.add(director2);

        Track t1 = new Track("Intro", 30);
        Track t2 = new Track("Love Story", 240);
        Track t3 = new Track("Dangerous Woman", 215);

        List<Track> tracks = new ArrayList<>();
        tracks.add(t1);
        tracks.add(t2);
        tracks.add(t3);

        CompactDisc cd = new CompactDisc("Best Hits Collection", "Pop Music", 19.99f, artists, directors, tracks);

        System.out.println("=== CD INFORMATION ===");
        System.out.println(cd);

        System.out.println("=== PLAY CD ===");
        cd.playDemoCD();

        Track newTrack = new Track("New Release", 200);
        cd.addTrack(newTrack);

        System.out.println("\nAfter adding new track:");
        System.out.println("Total length: " + cd.totalLength());

        cd.removeTrack(t2);
        System.out.println("Total length: " + cd.totalLength());
    }
}

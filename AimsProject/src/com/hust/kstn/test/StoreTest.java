package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc bao = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc quan = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dep = new DigitalVideoDisc("The Godfather", "Crime", "Francis Coppola", 175, 22.5f);
        DigitalVideoDisc trai = new DigitalVideoDisc("Inception", "Action", "Christopher Nolan", 148, 21.0f);

        // Add items
        store.addDVD(bao);
        store.addDVD(quan);
        store.addDVD(dep);
        store.addDVD(trai);
        
        // Cannot add existing items
        store.addDVD(bao);
        store.addDVD(dep);
    }
}

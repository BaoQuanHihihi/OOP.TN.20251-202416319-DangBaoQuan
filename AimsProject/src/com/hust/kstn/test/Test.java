package com.hust.kstn.test;

import com.hust.kstn.models.*;


public class Test {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "The Godfather", "Crime", "Francis Coppola", 175, 22.5f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5, "Inception", "Action", "Christopher Nolan", 148, 21.0f);

        DigitalVideoDisc[] myArray = {dvd3, dvd4, dvd5};

        cart.addDVD(dvd3, dvd4, dvd1);
        cart.viewShoppingCart();
    }
}

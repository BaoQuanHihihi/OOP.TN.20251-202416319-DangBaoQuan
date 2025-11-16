package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "The Godfather", "Crime", "Francis Coppola", 175, 22.5f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5, "Inception", "Action", "Christopher Nolan", 148, 21.0f);

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
        cart.addDVD(dvd4);
        cart.addDVD(dvd5);
        cart.print();

        cart.removeDVD(dvd3);
        cart.removeDVD(new DigitalVideoDisc(99, "Unknown", "Test", "No One", 0, 0));
        cart.print();

        cart.filterByTitle("The Godfather");
        cart.filterByTitle("Non-existent");
        cart.filterById(2);
        cart.filterById(999);

        cart.sortByTitle();
        cart.print();
        cart.sortByPrice();
        cart.print();

        System.out.println("Total cost: " + cart.calculateTotalCost());

        for (int i = 6; i <= 22; i++) {
            cart.addDVD(new DigitalVideoDisc(i, "Sample " + i, "Category", "Director", 100, i * 2f));
        }

        cart.viewShoppingCart();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd2);
        cart.removeDVD(dvd4);
        cart.removeDVD(dvd5);
        for (int i = 6; i <= 22; i++) {
            cart.removeDVD(new DigitalVideoDisc(i, "Sample " + i, "Category", "Director", 100, i * 2f));
        }

        cart.removeDVD(dvd1);

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.receiveRandomFreeDVD();
    }
}

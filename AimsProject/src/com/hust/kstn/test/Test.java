package com.hust.kstn.test;

import com.hust.kstn.models.*;


public class Test {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dang = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc bao = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc quan = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dep = new DigitalVideoDisc("The Godfather", "Crime", "Francis Coppola", 175, 22.5f);
        DigitalVideoDisc trai = new DigitalVideoDisc("Inception", "Action", "Christopher Nolan", 148, 21.0f);

        cart.addDVD(bao, quan, dep, dang);
        cart.viewShoppingCart();
    }
}

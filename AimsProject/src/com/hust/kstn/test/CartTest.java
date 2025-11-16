package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc[] myArray = new DigitalVideoDisc[16];
        for(int i = 0; i < 16; i++) {
            myArray[i] = new DigitalVideoDisc("DangBaoQuan_" + i, "None", "BaoQuanHihihi_" + i, (32 + i), (float)50.0);
        }

        DigitalVideoDisc dang = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc bao = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc quan = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dep = new DigitalVideoDisc("The Godfather", "Crime", "Francis Coppola", 175, 22.5f);
        DigitalVideoDisc trai = new DigitalVideoDisc("Inception", "Action", "Christopher Nolan", 148, 21.0f);

        // Add items
        cart.addDVD(bao, quan);
        cart.print();

        // Don't remove items that aren't in the cart.
        cart.removeDVD(trai);
        cart.print();
        
        cart.removeDVD(quan);
        cart.print();

        cart.addDVD(myArray);
        cart.print();

        cart.addDVD(trai, quan);
        cart.print();

        cart.addDVD(dang, dep);
        cart.print();
    }
}

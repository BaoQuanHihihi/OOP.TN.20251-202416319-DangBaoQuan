package com.hust.kstn.models;

import java.util.*;

public class Cart {
    //attributes
    private static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    //methods
    public void addDVD(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added sucessfully");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
            itemsInCart[qtyOrdered] = disc1;
            itemsInCart[qtyOrdered + 1] = disc2;
            qtyOrdered += 2;
            System.out.println("Two discs has been added sucessfully");
        } else System.out.println("Cannot add DVD: quantity = " + qtyOrdered);
    }

    // public void addDVD(DigitalVideoDisc[] discs) {
    //     if(qtyOrdered + discs.length < MAX_NUMBERS_ORDERED + 1) {
    //         for(int i = 0; i < discs.length; i++) {
    //             itemsInCart[qtyOrdered + i] = discs[i];
    //         }
    //         qtyOrdered += discs.length;
    //         System.out.println("Discs has been added sucessfully");
    //     } else System.out.println("Cannot add DVD, only " + (MAX_NUMBERS_ORDERED - qtyOrdered) + " discs can be added");
    // }

    public void addDVD(DigitalVideoDisc... discs) {
        if(qtyOrdered + discs.length < MAX_NUMBERS_ORDERED + 1) {
            for(int i = 0; i < discs.length; i++) {
                itemsInCart[qtyOrdered + i] = discs[i];
            }
            qtyOrdered += discs.length;
            System.out.println("Discs has been added sucessfully");
        } else System.out.println("Cannot add DVD, only " + (MAX_NUMBERS_ORDERED - qtyOrdered) + " discs can be added");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(qtyOrdered > 0) {
            boolean isExist = false;
            int index = -1;
            for(int i = 0; i < qtyOrdered; i++) {
                if(itemsInCart[i].equals(disc)) {
                    isExist = true;
                    index = i;
                    break;
                }
            }
            if(!isExist) {
                System.out.println("The disc does not exist");
            } else {
                for(int i = index; i < qtyOrdered - 1; i++) {
                    itemsInCart[i] = itemsInCart[i + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed sucessfully");
            }
        } else {
            System.out.println("The cart is empty");
        }
    }

    public float calculateTotalCost() {
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemsInCart[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println("Title: " + itemsInCart[i].getTitle());
            System.out.println("Cost: " + itemsInCart[i].getCost());
        }
    }

    public void viewShoppingCart() {
        for(int i = 0; i < qtyOrdered; i++) {
            itemsInCart[i].viewDVDInfo();
        }
        System.out.println("Total cost: " + calculateTotalCost());
    }

    public void sortByTitle() {
        for (int i = 0; i < qtyOrdered - 1; i++) {
            for (int j = i + 1; j < qtyOrdered; j++) {
                DigitalVideoDisc disc1 = itemsInCart[i];
                DigitalVideoDisc disc2 = itemsInCart[j];

                int titleComparison = disc1.getTitle().compareToIgnoreCase(disc2.getTitle());

                if (titleComparison > 0) {
                    DigitalVideoDisc temp = itemsInCart[i];
                    itemsInCart[i] = itemsInCart[j];
                    itemsInCart[j] = temp;
                } else if (titleComparison == 0) {
                    if (disc1.getCost() < disc2.getCost()) {
                        DigitalVideoDisc temp = itemsInCart[i];
                        itemsInCart[i] = itemsInCart[j];
                        itemsInCart[j] = temp;
                    }
                }
            }
        }
        System.out.println("Cart has been sorted by title");
    }

    public void sortByPrice() {
        for (int i = 0; i < qtyOrdered - 1; i++) {
            for (int j = i + 1; j < qtyOrdered; j++) {
                DigitalVideoDisc disc1 = itemsInCart[i];
                DigitalVideoDisc disc2 = itemsInCart[j];

                if (disc1.getCost() < disc2.getCost()) {
                    DigitalVideoDisc temp = itemsInCart[i];
                    itemsInCart[i] = itemsInCart[j];
                    itemsInCart[j] = temp;
                } else if (disc1.getCost() == disc2.getCost()) {
                    if (disc1.getTitle().compareToIgnoreCase(disc2.getTitle()) > 0) {
                        DigitalVideoDisc temp = itemsInCart[i];
                        itemsInCart[i] = itemsInCart[j];
                        itemsInCart[j] = temp;
                    }
                }
            }
        }
        System.out.println("Cart has been sorted by price");
    }

    public void filterByTitle(String title) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsInCart[i].getTitle().equalsIgnoreCase(title)) {
                itemsInCart[i].viewDVDInfo();
                break;
            } else {
                System.out.println("No products found");
            }
        }
    }

    public void filterById(int id) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsInCart[i].getId() == id) {
                itemsInCart[i].viewDVDInfo();
                break;
            } else {
                System.out.println("No products found");
            }
        }
    }

    public void receiveRandomFreeDVD() {
        Random random = new Random();
        int number = random.nextInt(qtyOrdered);
        DigitalVideoDisc ramdomDisc = itemsInCart[number];

        // TODO
    }
}

package com.hust.kstn.models;

public class Store {
    // attributes
    private static final int MAX_NUMBERS = 100;
    private int currentQuantity = 0;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS];

    // methods
    public void addDVD(DigitalVideoDisc disc) {
        if(currentQuantity < MAX_NUMBERS) {
            boolean isExist = false;
            for(int i = 0; i < currentQuantity; i++) {
                if(itemsInStore[i].equals(disc)) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                itemsInStore[currentQuantity] = disc;
                currentQuantity++;
                System.out.println("The disc " + disc.getTitle() + " has been added sucessfully to store");
            } else {
                System.out.println("The disc " + disc.getTitle() + " already exist");
            }
        } else {
            System.out.println("The store is almost full");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(currentQuantity > 0) {
            boolean isExist = false;
            int index = -1;
            for(int i = 0; i < currentQuantity; i++) {
                if(itemsInStore[i].equals(disc)) {
                    isExist = true;
                    index = i;
                    break;
                }
            }
            if(!isExist) {
                System.out.println("The disc " + disc.getTitle() + " does not exist");
            } else {
                for(int i = index; i < currentQuantity - 1; i++) {
                    itemsInStore[i] = itemsInStore[i + 1];
                }
                itemsInStore[currentQuantity - 1] = null;
                currentQuantity--;
                System.out.println("The disc " + disc.getTitle() + " has been removed sucessfully from store");
            }
        } else {
            System.out.println("The store is empty");
        }
    }
}

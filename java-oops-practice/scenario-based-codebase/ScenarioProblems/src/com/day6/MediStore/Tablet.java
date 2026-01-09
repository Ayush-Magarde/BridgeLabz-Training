package com.day6.MediStore;

public class Tablet extends Medicine {

    public Tablet(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets are preserved medicines
        return false;
    }
}


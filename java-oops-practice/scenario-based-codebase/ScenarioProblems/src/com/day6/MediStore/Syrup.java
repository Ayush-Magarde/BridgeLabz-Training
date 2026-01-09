package com.day6.MediStore;

public class Syrup extends Medicine {

    public Syrup(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicines expire faster
        return true;
    }
}

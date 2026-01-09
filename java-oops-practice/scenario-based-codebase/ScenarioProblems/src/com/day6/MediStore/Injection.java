package com.day6.MediStore;

public class Injection extends Medicine {

    public Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Sensitive storage required
        return false;
    }
}

package com.day9.medwarehouse;

public class Medicine {

    String name;
    int expiryDays; // days until expiry

    public Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return name + " | Expiry in days: " + expiryDays;
    }
}

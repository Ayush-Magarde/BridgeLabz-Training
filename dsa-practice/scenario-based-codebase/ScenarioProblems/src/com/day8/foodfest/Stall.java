package com.day8.foodfest;

public class Stall {
    String stallName;
    int footfall;

    public Stall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return stallName + " | Footfall: " + footfall;
    }
}

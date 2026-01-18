package com.day6.icecreamrush;

public class Flavor {

    String name;
    int soldCount;

    public Flavor(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }

    @Override
    public String toString() {
        return name + " | Sold: " + soldCount;
    }
}

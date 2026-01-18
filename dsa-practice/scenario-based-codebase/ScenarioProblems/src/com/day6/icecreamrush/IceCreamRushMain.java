package com.day6.icecreamrush;

public class IceCreamRushMain {

    public static void main(String[] args) {

        Flavor[] flavors = {
                new Flavor("Vanilla", 120),
                new Flavor("Chocolate", 200),
                new Flavor("Strawberry", 90),
                new Flavor("Mango", 150),
                new Flavor("Butterscotch", 110)
        };

        IceCreamRush rush = new IceCreamRush();

        System.out.println("Before Sorting:");
        rush.displayFlavors(flavors);

        rush.bubbleSort(flavors);

        System.out.println("\nAfter Sorting by Popularity:");
        rush.displayFlavors(flavors);
    }
}

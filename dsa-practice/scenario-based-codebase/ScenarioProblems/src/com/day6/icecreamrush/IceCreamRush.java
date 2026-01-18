package com.day6.icecreamrush;

public class IceCreamRush {

    public void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (flavors[j].soldCount < flavors[j + 1].soldCount) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public void displayFlavors(Flavor[] flavors) {
        for (Flavor f : flavors)
            System.out.println(f);
    }
}

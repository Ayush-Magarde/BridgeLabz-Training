package com.day5.robowarehouse;

public class RoboWarehouse {

    private PackageItem[] packages;
    private int size;

    public RoboWarehouse(int capacity) {
        packages = new PackageItem[capacity];
        size = 0;
    }

    // Insertion Sort during insertion
    public void addPackage(PackageItem pkg) {

        int i = size - 1;
        while (i >= 0 && packages[i].weight > pkg.weight) {
            packages[i + 1] = packages[i];
            i--;
        }

        packages[i + 1] = pkg;
        size++;
    }

    public void displayPackages() {
        for (int i = 0; i < size; i++)
            System.out.println(packages[i]);
    }
}

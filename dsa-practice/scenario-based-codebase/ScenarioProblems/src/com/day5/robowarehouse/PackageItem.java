package com.day5.robowarehouse;

public class PackageItem {

    int weight;

    public PackageItem(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Package Weight: " + weight;
    }
}

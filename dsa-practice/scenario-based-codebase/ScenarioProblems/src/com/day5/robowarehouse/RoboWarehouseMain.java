package com.day5.robowarehouse;

public class RoboWarehouseMain {

    public static void main(String[] args) {

        RoboWarehouse warehouse = new RoboWarehouse(10);

        warehouse.addPackage(new PackageItem(30));
        warehouse.addPackage(new PackageItem(10));
        warehouse.addPackage(new PackageItem(25));
        warehouse.addPackage(new PackageItem(5));

        System.out.println("Packages sorted by weight:");
        warehouse.displayPackages();
    }
}

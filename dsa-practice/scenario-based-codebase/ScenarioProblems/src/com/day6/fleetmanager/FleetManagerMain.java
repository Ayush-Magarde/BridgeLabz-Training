package com.day6.fleetmanager;

public class FleetManagerMain {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("V101", 12000),
                new Vehicle("V102", 8000),
                new Vehicle("V103", 15000),
                new Vehicle("V104", 10000)
        };

        FleetManager manager = new FleetManager();

        System.out.println("Before Sorting:");
        manager.displayVehicles(vehicles);

        manager.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nMaintenance Schedule (by mileage):");
        manager.displayVehicles(vehicles);
    }
}

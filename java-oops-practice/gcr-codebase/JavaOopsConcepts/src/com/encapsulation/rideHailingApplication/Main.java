package com.encapsulation.rideHailingApplication;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car(101, "Ramesh", 20);
        Vehicle v2 = new Bike(102, "Suresh", 15);
        Vehicle v3 = new Auto(103, "Mahesh", 18);

        Vehicle[] vehicles = { v1, v2, v3 };
        double distance = 10;

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: INR " +
                v.calculateFare(distance));

            GPS gps = (GPS) v;
            gps.updateLocation("ABC Road");
            System.out.println("Current Location: " + gps.getCurrentLocation());

            System.out.println();
        }
    }
}

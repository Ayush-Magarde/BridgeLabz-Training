package com.constructors.levelone;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Default constructor
    public CarRental() {
        this("Ayush", "Audi", 1, 1000);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Display rental details
    public void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

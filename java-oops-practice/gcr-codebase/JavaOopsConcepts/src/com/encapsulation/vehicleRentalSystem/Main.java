package com.encapsulation.vehicleRentalSystem;

public class Main {

	public static void main(String[] args) {
		
        Vehicle[] vehicles = {
                new Car ("CAR101", "CAR", 1500, "PN111"),
                new Bike("BIKE202", "BIKE", 1000, "PN222"),
                new Truck("TRUCK303", "TRUCK", 5000, "PN333"),
            };
        
        int days = 3;
        
        for (Vehicle v : vehicles) {

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost: INR " + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: INR " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println();
        }
	}

}

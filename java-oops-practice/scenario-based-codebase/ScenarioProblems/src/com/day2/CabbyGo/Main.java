package com.day2.CabbyGo;

public class Main {

	public static void main(String[] args) {
		
		// Create Customer
		Customer customer = new Customer("Ayush", "MG Road");
		
		// Create Driver
		Driver driver = new Driver("Ravi", "DRIVER1234",4.5);
		
		// Vehicle Array
		Vehicle[] vehicles = {
				new SUV("SUV101", 6), 
				new Mini("MINI202", 3), 
				new Sedan("SED303", 4)
		};
		
		// Choose one of the vehicles
		Vehicle selectedVehicle = vehicles[0];
		
		// Use the selected vehicle using IRideService interface
		IRideService ride = (IRideService) selectedVehicle;
		
		// Show the selected vehicle details
		selectedVehicle.displayVehicleInfo();
		System.out.println();
		
		// Book ride
		ride.bookRide();
		
		// Calculate the fair
		int distance = 8;
		double fare  = ride.calculateFare(distance);
		System.out.println("Total fare: " + fare + " INR for " + distance + " kms.");
		
		// End ride
		ride.endRide();

	}

}

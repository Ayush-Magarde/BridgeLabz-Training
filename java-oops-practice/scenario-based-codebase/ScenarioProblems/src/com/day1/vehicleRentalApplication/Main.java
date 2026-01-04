package com.day1.vehicleRentalApplication;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(311, "Ayush");
		
		Vehicle[] vehicles = {
				new Bike ("B101", 300),
				new Car ("C202", 500),
				new Truck ("T303", 1000),
		};
		
		int days = 3;
		customer.displayCustomerDetails();
		System.out.println();
		for (Vehicle vehicle : vehicles) {
			vehicle.displayInfo();
			
            double rent = ((Rentable) vehicle).calculateRent(days);
            System.out.println("Days: " + days);
            System.out.println("Total Rent: INR " + rent);
            System.out.println();
		}
		
	}
}

package com.vehicleRentalApplication;

public class Customer {

	private int customerId;
	private String name;
	
	public Customer (int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Id: " + customerId);
		System.out.println("Name: " + name);
	}
}

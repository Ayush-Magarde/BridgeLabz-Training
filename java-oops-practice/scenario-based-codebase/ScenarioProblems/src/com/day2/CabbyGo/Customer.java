package com.day2.CabbyGo;

public class Customer {

	private String name;
	private String location; // pick up location
	
	public Customer (String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
    // Optional helper method
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Pickup Location: " + location);
    }
}

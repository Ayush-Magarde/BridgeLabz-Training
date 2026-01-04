package com.day2.CabbyGo;

public abstract class Vehicle {

	private String vehicleNumber;
	private int capacity;
	private String type; // mini, sedan, suv
	
	public Vehicle (String vehicleNumber, int capacity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}
	
	// getters 
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getType() {
		return type;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Capacity: " + capacity);
		System.out.println("Type: " + type);
	}
	
}

package com.day2.MyBank;

public class Customer {

	private String name;
	
	public Customer (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	} 
	
	public void displayCustomerInfo() {
		System.out.println("Customer Name: " + name);
	}
}

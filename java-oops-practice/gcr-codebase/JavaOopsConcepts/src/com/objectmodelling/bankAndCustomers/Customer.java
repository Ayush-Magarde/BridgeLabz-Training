package com.objectmodelling.bankAndCustomers;

import java.util.jar.Attributes.Name;

public class Customer {
	
	private String customerName;
	private double balance;
	
	// Constructor
	public Customer(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = balance;
	}
	
	// Method to view balance
	public void viewBalance () {
		System.out.println(customerName + "'s Balance: INR " + balance);
	}
	
	// Used by Bank during account account opening
	public String getName() {
		return customerName;
	}
}

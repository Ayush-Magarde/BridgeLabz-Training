package com.eWalletApplication;

public class Transaction {

	// attributes
	private String description;
	private double amount;
	
	public Transaction(String description, double amount) {
		this.description = description;
		this.amount = amount;
	}
	
	public void displayTransaction() {
		System.out.println(description + ": INR " + amount);
	}
	
}

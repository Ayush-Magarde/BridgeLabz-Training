package com.constructors.levelone;

public class BankAccount {
	
	public int accountNumber;
	protected String accountHolder;
	private double balance;

	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// Accessing private balance
	public double getBalance() {
		return balance;
	}

	// Modifying private balance
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
}

package com.day2.MyBank;

public abstract class Account {

	private String accountNumber;
	private double balance;

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		setBalance(balance);
	}

	// getters

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}

	public abstract double calculateInterest();
}

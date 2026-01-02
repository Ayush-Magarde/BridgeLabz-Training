package com.encapsulation.bankingSystem;

public abstract class BankAccount {

	private String accountNumber;
	private String holderName;
	private double balance;

	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		setBalance(balance);
	}

	// getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Abstract method
	public abstract double calculateInterest();

}

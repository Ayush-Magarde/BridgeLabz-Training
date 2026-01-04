package com.day2.MyBank;

public class SavingsAccount extends Account implements ITransaction {

	private String type = "Savings Account";
	private static final double INTEREST_RATE = 5.0; // 5 percent

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Invalid withdraw amount");
		}
	}

	@Override
	public double checkBalance() {
		return getBalance();
	}

	@Override
	public double calculateInterest() {
		return getBalance() * INTEREST_RATE / 100;
	}
}

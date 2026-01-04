package com.day2.MyBank;

public class CurrentAccount extends Account implements ITransaction {

	private static final double INTEREST_RATE = 1.0; // 1 percent

	public CurrentAccount(String accountNumber, double balance) {
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

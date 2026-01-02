package com.encapsulation.bankingSystem;

public class CurrentAccount extends BankAccount {

	private static final double interest = 0.01; // 1%

	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public double calculateInterest() {
		return getBalance() * interest;
	}
}

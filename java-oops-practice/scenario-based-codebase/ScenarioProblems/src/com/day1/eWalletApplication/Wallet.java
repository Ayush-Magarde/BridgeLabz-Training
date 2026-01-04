package com.day1.eWalletApplication;

import java.util.ArrayList;
public abstract class Wallet implements Transferrable {

	private double balance;
	protected ArrayList<Transaction> transactions = new ArrayList<> ();
	
	public Wallet(double initialBalance) {
		if (initialBalance > 0) {
			balance = initialBalance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void addBalance(double amount) {
		balance += amount;
	}
	
	protected boolean deductBalance(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public void showTransactions() {
		for (Transaction t : transactions) {
			t.displayTransaction();
		}
	}
}

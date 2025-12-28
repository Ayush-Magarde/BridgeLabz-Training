package com.constructors.levelone;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}

	// displaying the banking information
	public void displayBankingDetails () {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Balnace: " + getBalance());
	}
	
}

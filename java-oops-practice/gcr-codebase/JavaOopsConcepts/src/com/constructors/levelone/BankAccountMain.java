package com.constructors.levelone;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount(123456, "Ayush", 10000);
		account1.displayBankingDetails();
		account1.setBalance(20000);
		account1.displayBankingDetails();;
	}

}

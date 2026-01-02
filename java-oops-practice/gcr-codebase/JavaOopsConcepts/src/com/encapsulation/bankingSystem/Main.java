package com.encapsulation.bankingSystem;

public class Main {

	public static void main(String[] args) {

		BankAccount account1 = new SavingsAccount("SA101", "Ayush", 50000);
		BankAccount account2 = new CurrentAccount("CA202", "Rahul", 80000);

		BankAccount[] accounts = {account1, account2};

		for (BankAccount acc : accounts) {
			System.out.println("Account Holder: " + acc.getHolderName());
			System.out.println("Interest Earned: INR " + acc.calculateInterest());

			if (acc instanceof Loanable) {
				Loanable loanAcc = (Loanable) acc;
				System.out.println("Loan Eligibility: INR " + loanAcc.calculateLoanEligibility());
			}
			System.out.println();
		}
	}

}

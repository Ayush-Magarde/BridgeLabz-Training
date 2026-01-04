package com.day2.MyBank;

public class Main {

	public static void main(String[] args) {

		// Create a Customer and display info
		Customer customer = new Customer ("Ayush");
		customer.displayCustomerInfo();
		System.out.println();
		
		// Create 2 accounts
		Account[] accounts = {
				new SavingsAccount("SA101", 5000),
				new CurrentAccount("CA202", 3000)
		};
		
		// Display account info and perform deposit and withdraw operations 
		for (Account a : accounts) {
			a.displayAccountInfo();
			
			ITransaction transaction = (ITransaction) a;
			transaction.deposit(2000);
			System.out.println("Balance after depositing 2000: " + transaction.checkBalance());
			transaction.withdraw(4000);
			System.out.println("Balance after withdrawing 4000: " + transaction.checkBalance());
			
            double interest = a.calculateInterest();
            System.out.println("Interest earned: " + interest);

            System.out.println();
		}
	}

}

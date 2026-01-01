package com.objectmodelling.bankAndCustomers;

public class Main {

	public static void main (String[] args) {
		Bank bank = new Bank("Bank of India");
		Customer customer1 = new Customer("Ayush", 5000000);
		
		bank.openAccount(customer1);
		customer1.viewBalance();
	}
}

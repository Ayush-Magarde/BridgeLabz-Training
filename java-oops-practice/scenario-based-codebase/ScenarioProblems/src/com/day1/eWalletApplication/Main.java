package com.day1.eWalletApplication;

public class Main {

	public static void main(String[] args) {
		
		User ayush = new User (
				1, "Ayush", new PersonalWallet(500, true)
				);
		
		User shop = new User (
				2, "Store", new BusinessWallet(1000));
				
		ayush.showBalance();
		shop.showBalance();
		
		ayush.getWallet().transferTo(shop, 300);
		shop.getWallet().transferTo(ayush, 500);
		
		ayush.showBalance();
		shop.showBalance();
		
		ayush.showTransactions();
		shop.showTransactions();
		
	}
}

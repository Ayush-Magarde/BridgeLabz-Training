package com.day1.eWalletApplication;

public class User {

	private int userId;
	private String name;
	private Wallet wallet;
	
	public User(int userId, String name, Wallet wallet) {
		this.userId = userId;
		this.name = name;
		this.wallet = wallet;
	}
	
	public String getName() {
		return name;
	}
	
	public Wallet getWallet() {
		return wallet;
	}
	
	public void showBalance() {
		System.out.println(name + " Balance: INR " + wallet.getBalance());
		System.out.println();
	}
	
	public void showTransactions() {
        System.out.println("Transactions for " + name);
        wallet.showTransactions();
        System.out.println();
	}
}

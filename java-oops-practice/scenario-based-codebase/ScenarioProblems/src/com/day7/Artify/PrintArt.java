package com.day7.Artify;

public class PrintArt extends Artwork{

	private User user;
	public PrintArt(String title, String artist, double  price, String licenseType, User user) {
		super(title, artist, price, licenseType);
		this.user = user;
	}

	@Override
	public void purchase() {
		if(user.getWalletBalance() >= price) {
			System.out.println("Print Art sold to: " + user.getName());
			user.deductBalance(price);
		}
		else {
			System.out.println("Insufficient Wallet balance!");
		}
	}

	@Override
	public void license() {
		System.out.println("Print Art License: " + licenseType);
	}

}

package com.day7.Artify;

public class DigitalArt extends Artwork{

	private User user;
	public DigitalArt(String title, String artist, double  price, String licenseType, User user) {
		super(title, artist, price, licenseType);
		this.user = user;
	}

	@Override
	public void purchase() {
		if(user.getWalletBalance() >= price) {
			System.out.println("Digital Art sold to: " + user.getName());
			user.deductBalance(price);
		}
		else {
			System.out.println("Insufficient Wallet balance!");
		}
	}

	@Override
	public void license() {
		System.out.println("Digital Art License: " + licenseType);
	}

}

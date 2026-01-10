package com.day7.Artify;

public abstract class Artwork implements IPurchasable{

	private String title;
	private String artist;
	protected double  price;	
	protected String licenseType;
	
	public Artwork(String title, String artist, double  price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType; // exclusive or non-exclusive
	}
	
	public void displayArtInfo() {
		System.out.println(
				"Title: " +  title + 
				"\nArtist: " + artist + 
				"\nPrice: " + price);
	}
	public abstract void purchase();
	public abstract void license();
	
	
	
	

}

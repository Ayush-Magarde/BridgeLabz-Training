package com.day2.CabbyGo;

public class Driver {

	private String name;
	private String licenseNumber;
	private double rating; // out of 5;

	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		setRating(rating);
	}

	public String getName() {
		return name;
	}

	public String getLicenseNumebr() {
		return licenseNumber;
	}

	public void updateRating(double newRating) {
		setRating(newRating);
	}

	// Private helper to enforce constraints
	private void setRating(double rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		} else {
			System.out.println("Invalid rating. Rating must be between 0 and 5.");
		}
	}

	// Optional: self-display
	public void displayDriverInfo() {
		System.out.println("Driver Name: " + name);
		System.out.println("Rating: " + rating + "/5");
	}

}

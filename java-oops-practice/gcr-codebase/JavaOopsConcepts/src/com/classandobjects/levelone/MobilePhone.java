package com.classandobjects.levelone;

public class MobilePhone {
	String brand;
	String model;
	double price;
		
	// Constructor
	MobilePhone (String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Method to display the reuslts
	public void displayMobiles() {
		System.out.println("Mobile brand: " + brand);
		System.out.println("Mobile model: " + model);
		System.out.println("Mobile price: " + price);
	}	
	public static void main(String[] args) {
		MobilePhone mobile1 = new MobilePhone("Nokia", "2311A", 4000);
		MobilePhone mobile2 = new MobilePhone("Apple", "2342B", 5000);
		mobile1.displayMobiles();
		mobile2.displayMobiles();
	}

}

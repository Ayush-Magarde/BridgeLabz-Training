package com.constructors.levelone;

public class CarRentalMain {

	public static void main(String[] args) {
		CarRental car1 = new CarRental();
		CarRental car2 = new CarRental("Max", "BMW", 3,2500);
		car1.displayRental();
		car2.displayRental();
	}

}

package com.constructors.levelone;

public class Circle {
	
	int radius;

	// Default constructor
	public Circle() {
		radius = 20;
	}
	// Parameterized constructor
	public Circle (int radius) {
		this.radius = radius;
	}
	// Display the constructors
	public void displayCircleRadius () {
		System.out.println("Radius of circle: " + radius);
	}	
}

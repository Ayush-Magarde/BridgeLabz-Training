package com.constructors.levelone;

public class Person {
	String name;
	String nationality;
	int age;
	// Default constructor
	public Person() {
		name = "Ayush";
		nationality = "Indian";
		age = 22;
	}
	// Parameterized constructor
	public Person (String name, String nationality, int age) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}
	// Copy constructor
	public Person (Person copyAttributes) {
		this.name = copyAttributes.name;
		this.nationality = copyAttributes.nationality;
		this.age = copyAttributes.age;
	}
	// Display results
	public void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Nationality: " + nationality);
		System.out.println("age: " + age);
	}
}

package com.constructors.levelone;

public class PersonMain {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Max", "Japanese", 35);
		Person person3 = new Person (person2);
		person1.displayPersonDetails();
		person2.displayPersonDetails();
		person3.displayPersonDetails();
	}
}

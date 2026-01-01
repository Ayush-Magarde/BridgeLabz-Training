package com.inheritance.hybridInheritance.restaurantManagement;

public class Main {
	
	public static void main(String[] args) {
		
		Person person1 = new Chef ("Ramesh", 123);
		Person person2 = new Waiter ("Suresh", 456);
		
		person1.displayInfo();
		((Worker)person1).performDuties();
		
		System.out.println();
		
		person2.displayInfo();
		((Worker)person2).performDuties();
	}
}

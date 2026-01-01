package com.inheritance.employeeManagementSystem;

public class Main {

	public static void main (String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Manager("Ayush", 1234, 50000, 25);
		employees[1] = new Developer("Aman", 5678, 25000, "Java");
		employees[2] = new Intern ("Anika", 9101, 10000, 5);
		
		for (Employee e : employees) {
			e.displayDetails();
		}
		
	}
}

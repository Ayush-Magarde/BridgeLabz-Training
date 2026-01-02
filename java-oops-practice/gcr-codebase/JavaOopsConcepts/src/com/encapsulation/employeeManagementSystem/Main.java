package com.encapsulation.employeeManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new FullTimeEmployee(1234, "Ayush", 50000);
		Employee employee2 = new PartTimeEmployee(5678, "Aman", 500, 40);
		
		((Department) employee1).assignDepartment("It");
		((Department) employee2).assignDepartment("Support");
		
		Employee[] employees = {employee1, employee2};
		
		for (Employee e : employees) {
			e.displayDetails();
			System.out.println("Department: " + ((Department)e).getDepartmentDetails());
			System.out.println();
		}
	}
}

package com.constructors.levelone;

public class Manager extends Employee {
	String role;

	public Manager(String employeeId, String department, double salary, String role) {
		super(employeeId, department, salary);
		this.role = role;
	}
	
	// Display employee information
	public void displayEmployeeDetails() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + getSalary());
		System.out.println("Role: " + role);
	}

}

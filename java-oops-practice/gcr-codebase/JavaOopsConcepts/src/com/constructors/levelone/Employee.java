package com.constructors.levelone;

public class Employee {
	
	public String employeeId;
	protected String department;
	private double salary;

	public Employee(String employeeId, String department, double salary) {
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	
	// Accessing private salary
	public double getSalary() {
		return salary;
	}
	
	// Modifying salary using getter
	public void setSalary (double salary) {
		this.salary = salary;
	}

}

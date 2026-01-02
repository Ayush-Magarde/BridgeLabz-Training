package com.encapsulation.employeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {

	private int hoursWorked;
	private double hourlyRate;
	private String department;
	
	public PartTimeEmployee (int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name, hourlyRate);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	// from Employee
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
	
	// from Department
	@Override
	public void assignDepartment(String departmentName) {
		this.department = departmentName;
	}
	
	@Override
	public String getDepartmentDetails() {
		return department;
	}
	
}

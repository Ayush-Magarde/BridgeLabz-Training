package com.encapsulation.employeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department {
	
	private String department;
	
	public FullTimeEmployee(int employeeId, String name, double salary) {
		super(employeeId, name, salary);
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary();
	}
	
	@Override
	public void assignDepartment(String departmentName) {
		this.department = departmentName;
	}
	
	@Override
	public String getDepartmentDetails() {
		return department;
	}
}

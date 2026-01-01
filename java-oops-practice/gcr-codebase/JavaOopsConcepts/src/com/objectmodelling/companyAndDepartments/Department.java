package com.objectmodelling.companyAndDepartments;

import java.util.ArrayList;
public class Department {

	private String departmentName;
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void addEmployee (String employeeName) {
		employees.add(new Employee(employeeName));
	}
	
	public void showDepartmentDetails () {
		System.out.println("Department: " + departmentName);
		for (Employee e : employees) {
			e.showEmployee();
		}
	}
}

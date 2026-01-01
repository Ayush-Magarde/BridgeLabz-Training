package com.objectmodelling.companyAndDepartments;

import java.util.ArrayList;
public class Company {
	
	private String companyName;
	private ArrayList<Department> departments = new ArrayList<> ();
	
	public Company (String companyName) {
		this.companyName = companyName;
	}
	
	public void addDepartmentName(Department department) {
		departments.add(department);
	}
	
	public void showCompanyDetails() {
		System.out.println("Company: " + companyName);
		for (Department d : departments) {
			d.showDepartmentDetails();
		}
	}
}

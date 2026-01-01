package com.objectmodelling.companyAndDepartments;

public class Main {
	
	public static void main(String[] args) {
		
		Company company = new Company("ABC Global");
		
		Department dev = new Department ("Development");
		dev.addEmployee("Ayush");
		dev.addEmployee("Aman");
		
		Department hr = new Department ("HR");
		hr.addEmployee("Anika");
		hr.addEmployee("Varun");
		
		company.addDepartmentName(dev);
		company.addDepartmentName(hr);
		
		company.showCompanyDetails();
	}
}
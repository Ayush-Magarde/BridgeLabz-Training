package com.constructors.levelone;

public class EmployeeMain {

	public static void main(String[] args) {
		Manager employee1 = new Manager ("123ABC", "Sales", 10000, "Team lead");
		employee1.displayEmployeeDetails();
		employee1.setSalary(15000);
		employee1.displayEmployeeDetails();
	}

}

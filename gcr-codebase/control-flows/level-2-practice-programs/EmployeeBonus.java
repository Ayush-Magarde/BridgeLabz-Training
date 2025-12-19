// Create a program to find the bonus of employees based on their years of service

import java.util.Scanner;
class EmployeeBonus {
    public static void main (String[] args) {
		// Take inputs for salary and years of service
        Scanner input = new Scanner(System.in);
		System.out.print ("Enter the Salary: ");
        double salary = input.nextDouble();
		System.out.print ("Enter years of service: ");
        int yearsOfService = input.nextInt();
		// Check if the bonus applicable or not
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}

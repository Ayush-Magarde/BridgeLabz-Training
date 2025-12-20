/* Create a program to find the bonus of 10 employees based on their years of service 
and the total bonus amount the company Zara has to pay, along with the old and new salary. */

import java.util.Scanner;
class EmployeeBonusCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		// Take user input for salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
		// Create necessary variables
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Run a for loop to take user input
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter Salary and Years of service for emplyee " + (i + 1));
            salary[i] = input.nextDouble();
            yearsOfService[i] = input.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid answer");
                i--;
            }
        }

        // Calculate Bonus 
        for (int i = 0; i < salary.length; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5 percent
            } else {
                bonus[i] = salary[i] * 0.02; // 2 percent
            }
			// Add the bonus to salary
            newSalary[i] = salary[i] + bonus[i];
			// Keep track of total bonus, old salary and new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
		
		// Display the results
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

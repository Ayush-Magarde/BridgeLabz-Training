// Program 1. Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.

// Creating class name AgeOfHarry indicating the purpose is to find Harry's age.
public class AgeOfHarry {
	
	public static void main (String[] args) {
		
		// Create an Integer variable yearOfBirth and assign value 2000.
		int yearOfBirth = 2000;
		
		// Create an Integer variable currentYear and assign value 2024.
		int currentYear = 2024;
		
		// Create an Integer variable ageOfHarry and calculate it by subtracting yearOfBirth from currentYear.
		int ageOfHarry = currentYear - yearOfBirth;
		
		// Display the result.
		System.out.println("Harry's age in 2024 is: " + ageOfHarry);
	}
}
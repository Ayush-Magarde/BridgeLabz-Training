// Create a program to find the BMI of a person

import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		// Take input for weight and height
		System.out.print("Enter your weight in kgs: ");
        double weightInKg = input.nextDouble(); 
		System.out.print("Enter your height in cms: ");
        double heightInCm = input.nextDouble(); 
		// Convert the height into meters
        double heightInMeters = heightInCm / 100;
		// Calculate the bmi using the given formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

		// Display the bmi
        System.out.println("BMI: " + bmi);
		// Display the status of the person based on their bmi
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

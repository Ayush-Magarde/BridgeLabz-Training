//create a program to find the BMI and display the height, weight, BMI and status of each individual.

import java.util.Scanner;
class BMICalculation {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
		// Take the input from the user
		System.out.print("Enter the number of people: ");
        int totalPeople = input.nextInt();
        double[] weight = new double[totalPeople];
        double[] height = new double[totalPeople];
        double[] bmi = new double[totalPeople];
        String[] status = new String[totalPeople];
		
		// Run a for loop for weight and height input
        for(int i = 0; i < totalPeople; i++){
			System.out.print("Enter weight: ");
            weight[i] = input.nextDouble();
			System.out.print("Enter height: ");
            height[i] = input.nextDouble();
            bmi[i] = weight[i] / ((height[i] / 100) * (height[i] / 100));
			
			// Assign status based on the BMI
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }


		//Display the results
        for(int i = 0; i < totalPeople; i++){
            System.out.println("weight: " + weight[i] + ", height: " + height[i] + ", BMI: " + bmi[i] + ", Remark: " + status[i]);
        }
	}
}
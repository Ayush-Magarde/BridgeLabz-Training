import java.util.Scanner;

// Program to calculate Body Mass Index (BMI) and display health status
class BMICalculator {

	// Method to calculate BMI using weight and height
	public static double calculateBMI(double weight, double heightCm) {
		double heightM = heightCm / 100;
		return weight / (heightM * heightM);
	}

	// Method to determine BMI status
	public static String bmiStatus(double bmi) {
		if (bmi < 18.5) return "Underweight";
		if (bmi < 25) return "Normal";
		if (bmi < 30) return "Overweight";
		return "Obese";
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] data = new double[10][3];

		// Take input, calculate BMI and display status for each person
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter weight (kg): ");
			data[i][0] = input.nextDouble();
			System.out.print("Enter height (cm): ");
			data[i][1] = input.nextDouble();

			data[i][2] = calculateBMI(data[i][0], data[i][1]);
			System.out.println("BMI: " + data[i][2] + " Status: " + bmiStatus(data[i][2]));
		}
	}
}

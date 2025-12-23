import java.util.Scanner;
class BmiCalculator {

	// Method to calculate BMI and determine health status
	public static String[][] calculateBmi (int[][] data) {
		String[][] result = new String[data.length][4];
		for (int i = 0; i < data.length; i++) {
			double heightMeter = data[i][1] / 100.0;
			double bmi = data[i][0] / (heightMeter * heightMeter);
			result[i][0] = String.valueOf(data[i][1]);
			result[i][1] = String.valueOf(data[i][0]);
			result[i][2] = String.format("%.2f", bmi);
			if (bmi < 18.5) result[i][3] = "Underweight";
			else if (bmi < 25) result[i][3] = "Normal";
			else if (bmi < 30) result[i][3] = "Overweight";
			else result[i][3] = "Obese";
		}
		return result;
	}

	// Method to display BMI details in tabular format
	public static void display (String[][] data) {
		System.out.println("Height\tWeight\tBMI\tStatus");
		for (String[] row : data) {
			System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
		}
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] persons = new int[10][2];

		// Take weight and height input for 10 persons
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter weight and height: ");
			persons[i][0] = input.nextInt();
			persons[i][1] = input.nextInt();
		}

		// Call methods to calculate and display BMI details
		display(calculateBmi(persons));
	}
}

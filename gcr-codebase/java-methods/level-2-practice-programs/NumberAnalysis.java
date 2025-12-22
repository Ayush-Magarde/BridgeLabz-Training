import java.util.Scanner;
class NumberAnalysis {

	// Method to check whether a number is positive
	public static boolean isPositive(int n) {
		return n >= 0;
	}

	// Method to check whether a number is even
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	// Method to compare two numbers
	public static int compare(int a, int b) {
		if (a > b) return 1;
		if (a == b) return 0;
		return -1;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];

		// Take input and analyze each number
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			if (isPositive(numbers[i])) {
				System.out.println(isEven(numbers[i]) ? "Positive Even" : "Positive Odd");
			} else {
				System.out.println("Negative");
			}
		}

		// Compare first and last elements of the array
		int result = compare(numbers[0], numbers[4]);
		System.out.println(result == 0 ? "Equal" : result > 0 ? "First Greater" : "First Smaller");
	}
}

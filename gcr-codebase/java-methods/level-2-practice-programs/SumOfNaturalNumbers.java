import java.util.Scanner;
class SumOfNaturalNumbers {

	// Method to find sum using recursion
	public static int recursiveSum(int number) {
		if (number == 0) return 0;
		return number + recursiveSum(number - 1);
	}

	// Method to find sum using formula n*(n+1)/2
	public static int formulaSum(int number) {
		return number * (number + 1) / 2;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int number = input.nextInt();

		// Check for natural number
		if (number <= 0) {
			System.out.println("Not a natural number");
			return;
		}

		// Call recursive method
		int recursiveResult = recursiveSum(number);

		// Call formula method
		int formulaResult = formulaSum(number);

		// Display results
		System.out.println("Sum using recursion: " + recursiveResult);
		System.out.println("Sum using formula: " + formulaResult);
		System.out.println("Results matched: " + (recursiveResult == formulaResult));
	}
}

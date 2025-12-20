import java.util.Scanner;
class SumOfNaturalNumbers {
	// Create a method to add the numbers till N
	public static int addTillNumber (int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		// Call the method
		int sumTillNumber = addTillNumber(number);
		
		// Display the results
		System.out.print("The sum of numbers till " + number + " is: " + sumTillNumber);
	}
}
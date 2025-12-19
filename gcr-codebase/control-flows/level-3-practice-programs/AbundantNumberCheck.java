// Create a program to check if a number is an Abundant Number.
import java.util.Scanner; 
class AbundantNumberCheck {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		// Take a number in input
		System.out.println ("Enter a number: ");
		int number = input.nextInt();
		int sum = 0;
		// Run a for loop to find all the divisors of a number
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				// Add all the divisors to sum
				sum += i;
			}
		}
		
		// Display the results
		if (sum > number) {
			System.out.println ("Abundant Number");
		} else {
			System.out.println("Not an Abundant Number");
		}
	}
}
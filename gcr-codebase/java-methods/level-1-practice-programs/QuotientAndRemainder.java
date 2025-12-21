import java.util.Scanner;
class QuotientAndRemainder {
	// Create a method to find quotient and remainder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		
		int quotient = number / divisor;
		int remainder = number % divisor;
		return new int[] {quotient, remainder};
	}
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = input.nextInt();
		
		// Invoking the method
		int [] quotientAndRemainder = findRemainderAndQuotient(number,divisor);
		
		// Dispaly the results
		System.out.println("The Quotient: " + quotientAndRemainder[0]);
		System.out.println("The Remainder: " + quotientAndRemainder[1]);
	}
}
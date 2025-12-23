// This program actually throws StringIndexOutOfBoundsException
import java.util.Scanner;
class IllegalArgumentExceptionDemonstration {
	
	// Method to generate exception
	public static void generateException (String text) {
		text.substring(2,1);
	}
	
	// Method to handle exception
	public static void handleException (String text) {
		try {
		text.substring(2,1);
		} catch (IllegalArgumentException e) {
		System.out.println("Exception message: " + e);
		System.out.println("IllegalArgumentException handled");
		}
	}
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String text = input.next();
		// generateException(text);
		handleException(text);
	}
}
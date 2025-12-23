import java.util.Scanner;
class NumberFormatExceptionDemonstration {
	
	// Method to generate exception
	public static void generateException (String text) {
		Integer.parseInt(text);
	}
	
	// Method to handle exception
	public static void handleException (String text) {
		try {
		Integer.parseInt(text);
		} catch (NumberFormatException e) {
		System.out.println("Exception message: " + e);
		System.out.println("NumberFormatException handled");
		}
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String text = input.next();
		// generateException(text);
		handleException(text);
	}
}
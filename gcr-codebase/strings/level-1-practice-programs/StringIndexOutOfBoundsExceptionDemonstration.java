import java.util.Scanner;
class StringIndexOutOfBoundsExceptionDemonstration {
	
	// Method to generate exception
	public static void generateException (String text) {
		System.out.println(text.charAt(text.length()));
	}
	
	// Method to handle the exception
	public static void handleException(String text) {
		try {
			System.out.println(text.charAt(text.length()));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error message: " + e);
			System.out.println("StringIndexOutOfBoundsException handled");
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
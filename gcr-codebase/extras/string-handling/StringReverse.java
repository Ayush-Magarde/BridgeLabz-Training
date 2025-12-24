import java.util.Scanner;
class StringReverse {
	// Method to reverse a string manually
	public static String stringReversal (String text) {
		String result = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			result += text.charAt(i);
		}
		return result;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.next();
		System.out.println("Original string: " + text);
		System.out.println("Reversed String: " + stringReversal(text));		
	}
}
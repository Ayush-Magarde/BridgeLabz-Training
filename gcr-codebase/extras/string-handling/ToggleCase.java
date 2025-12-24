import java.util.Scanner;
class ToggleCase {
	
	// Method to toggle the case of each character
	public static String toggleCaseOfEachCharacter (String text) {
		StringBuilder result = new StringBuilder(text);
		for (int i = 0; i < text.length(); i++) {
			if (result.charAt(i) >= 'a' && result.charAt(i) <= 'z') {
				result.setCharAt(i,(char)(result.charAt(i) - 32));
			} else if ((result.charAt(i) >= 'A' && result.charAt(i) <= 'Z')) {
				result.setCharAt((i), (char)(result.charAt(i) + 32));
			}
		}
		return result.toString();
	}
	
	// Main method
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter text: ");
	String text = input.nextLine();
	String toggleCase = toggleCaseOfEachCharacter(text);
	System.out.println("String after toggling cases: " + toggleCase);
	}
}
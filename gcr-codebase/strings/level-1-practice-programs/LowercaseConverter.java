import java.util.Scanner;
class LowercaseConverter {
	
	// Method to convert string to lower case manually
	public static String toLowerCaseManual (String text) {
		String lowerCase = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				lowerCase += (char)(ch + 32);
			} else lowerCase += ch;
		}
		return lowerCase;
	}

	// Method to compare 2 strings
	public static boolean compareStrings (String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		
		// Calling the methods
		String lowerCaseManual = toLowerCaseManual(text);
		String lowerCaseBuiltIn = text.toLowerCase();
		
		// Display the reuslts
		System.out.println("Are both strings equal: " + compareStrings(lowerCaseManual, lowerCaseBuiltIn));
	}
}

import java.util.Scanner;
class FirstNonRepeating {

	// Method to find first non-repeating character in the string
	public static char firstUnique (String text) {
		int[] freq = new int[256];
		for (int i = 0; i < text.length(); i++) {
			freq[text.charAt(i)]++;
		}
		for (int i = 0; i < text.length(); i++) {
			if (freq[text.charAt(i)] == 1) return text.charAt(i);
		}
		return '\0';
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call method to find first non-repeating character
		char ch = firstUnique(text);
		if (ch != '\0') System.out.println("First non-repeating: " + ch);
		else System.out.println("No non-repeating character");
	}
}

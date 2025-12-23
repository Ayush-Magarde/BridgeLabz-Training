import java.util.Scanner;
class PalindromeCheck {

	// Method to check palindrome using iterative approach
	public static boolean isPalindromeIterative (String text) {
		int start = 0, end = text.length() - 1;
		while (start < end) {
			if (text.charAt(start) != text.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
	}

	// Method to check palindrome using recursion
	public static boolean isPalindromeRecursive (String text, int start, int end) {
		if (start >= end) return true;
		if (text.charAt(start) != text.charAt(end)) return false;
		return isPalindromeRecursive(text, start + 1, end - 1);
	}

	// Method to check palindrome using character array comparison
	public static boolean isPalindromeArray (String text) {
		char[] original = text.toCharArray();
		char[] reverse = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			reverse[i] = text.charAt(text.length() - 1 - i);
		}
		for (int i = 0; i < original.length; i++) {
			if (original[i] != reverse[i]) return false;
		}
		return true;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call palindrome check methods and display results
		System.out.println(isPalindromeIterative(text));
		System.out.println(isPalindromeRecursive(text, 0, text.length() - 1));
		System.out.println(isPalindromeArray(text));
	}
}

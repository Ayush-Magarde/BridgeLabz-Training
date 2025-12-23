import java.util.Scanner;
class AnagramCheck {

	// Method to check whether two strings are anagrams
	public static boolean isAnagram (String a, String b) {
		if (a.length() != b.length()) return false;
		int[] freq1 = new int[256];
		int[] freq2 = new int[256];
		for (int i = 0; i < a.length(); i++) {
			freq1[a.charAt(i)]++;
			freq2[b.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (freq1[i] != freq2[i]) return false;
		}
		return true;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input strings from user
		System.out.print("Enter first text: ");
		String a = input.nextLine();
		System.out.print("Enter second text: ");
		String b = input.nextLine();

		// Call method to check anagram and display result
		System.out.println("Anagram: " + isAnagram(a, b));
	}
}

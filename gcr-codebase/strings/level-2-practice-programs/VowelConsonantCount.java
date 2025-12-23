import java.util.Scanner;
class VowelConsonantCount {

	// Method to check whether a character is vowel, consonant or not a letter
	public static String checkChar (char ch) {
		if (ch >= 'A' && ch <= 'Z') ch += 32;
		if (ch >= 'a' && ch <= 'z') {
			if ("aeiou".indexOf(ch) >= 0) return "Vowel";
			return "Consonant";
		}
		return "Not";
	}

	// Method to count vowels and consonants in the string
	public static int[] count (String text) {
		int v = 0, c = 0;
		for (int i = 0; i < text.length(); i++) {
			String type = checkChar(text.charAt(i));
			if (type.equals("Vowel")) v++;
			else if (type.equals("Consonant")) c++;
		}
		return new int[] {v, c};
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call method to count vowels and consonants
		int[] res = count(text);
		System.out.println("Vowels: " + res[0]);
		System.out.println("Consonants: " + res[1]);
	}
}

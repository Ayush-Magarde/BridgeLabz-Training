import java.util.Scanner;
class CharacterTypeTable {

	// Method to check whether a character is vowel, consonant or not a letter
	public static String checkChar (char ch) {
		if (ch >= 'A' && ch <= 'Z') ch += 32;
		if (ch >= 'a' && ch <= 'z') {
			if ("aeiou".indexOf(ch) >= 0) return "Vowel";
			return "Consonant";
		}
		return "Not a Letter";
	}

	// Method to classify each character and store result in a 2D array
	public static String[][] classify (String text) {
		String[][] data = new String[text.length()][2];
		for (int i = 0; i < text.length(); i++) {
			data[i][0] = String.valueOf(text.charAt(i));
			data[i][1] = checkChar(text.charAt(i));
		}
		return data;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call method to classify characters
		String[][] table = classify(text);
		for (String[] row : table) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}
}

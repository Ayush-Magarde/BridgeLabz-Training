import java.util.Scanner;
class UniqueCharacters {

	// Method to find length of string without using length()
	public static int findLength (String text) {
		int count = 0;
		try {
			while (true) {
				text.charAt(count);
				count++;
			}
		} catch (Exception e) {
			return count;
		}
	}

	// Method to find unique characters from the string
	public static char[] uniqueChars (String text) {
		int len = findLength(text);
		char[] temp = new char[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			boolean unique = true;
			for (int j = 0; j < i; j++) {
				if (ch == text.charAt(j)) unique = false;
			}
			if (unique) temp[index++] = ch;
		}
		char[] result = new char[index];
		for (int i = 0; i < index; i++) result[i] = temp[i];
		return result;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call method to find and display unique characters
		char[] unique = uniqueChars(text);
		for (char ch : unique) System.out.print(ch + " ");
	}
}

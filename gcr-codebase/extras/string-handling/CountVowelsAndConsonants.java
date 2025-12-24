import java.util.Scanner;
class CountVowelsAndConsonants {
	
	// Method to cout vowels and consonants
	public static int[] vowelsAndConsonantsCounter (String text) {
		text = text.toLowerCase();
		int vowels = 0, consonants = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".indexOf(ch) != -1) vowels++;
				else consonants++;
			}
		}
		return new int[] {vowels, consonants};
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		int[] vowelsAndConsonants = vowelsAndConsonantsCounter(text);
		System.out.println("Number of vowels: " + vowelsAndConsonants[0] + "\tNumber of consonants: " + vowelsAndConsonants[1]);
	}
}
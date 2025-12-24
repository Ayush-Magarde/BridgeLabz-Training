import java.util.Scanner;
class PalindromeString {
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.next();
		String reverse = StringReverse.stringReversal(text);
		if (text.equals(reverse)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}
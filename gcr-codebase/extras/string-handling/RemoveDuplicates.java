import java.util.Scanner;
class RemoveDuplicates {
	
	// Method to remove duplicates
	public static String duplicatesRemover (String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (result.indexOf(ch) == -1) {
				result += ch;			
			}
		}
		return result;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter text: ");
		String text = input.next();
		System.out.println ("String after removing duuplicates: " + duplicatesRemover(text));
	}
}
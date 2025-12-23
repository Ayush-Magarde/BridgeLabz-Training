import java.util.Scanner;
class StringLengthWithoutMethod {

	// Method to find length without using length()
	public static int findLength ( String text ) {
		int count = 0;
		try {
			while (true) {
				text.charAt (count);
				count++;
			}
		} catch (StringIndexOutOfBoundsException e) {
			return count;
		}
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner ( System.in );
		System.out.print ("Enter text: ");
		String text = input.next();
		System.out.println ("Length manually: " + findLength (text));
		System.out.println ("Length using builtin method: " + text.length());
	}
}

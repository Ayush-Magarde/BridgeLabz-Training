import java.util.Scanner;
class ArrayIndexOutOfBoundsExceptionDemo {
	
	// Method to generate exception
	public static void generateException (String[] names) {
		System.out.println(names[names.length]);
	}
	
	// Method to handle exception
	public static void handleException (String[] names) {
		try {
			System.out.println(names[names.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception message: " + e);
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter the " + (i+1) + " name: ");
			names[i] = input.next();
		}
		// generateException(names);
		handleException(names);
	}
}
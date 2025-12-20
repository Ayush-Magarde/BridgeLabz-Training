import java.util.Scanner;
class MaximumHandshakes {
	// Method to find the total number of handshakes for a given number of students
	public static int calculateHandshakes (int students) {
		return ((students) * (students - 1)) / 2;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// User input for number of students
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		// Calling the method
		int totalHandshakes = calculateHandshakes(students);
		
		// Display the results
		System.out.print("Total possible handshakes among " + students + " is: " + totalHandshakes);
	}
}
import java.util.Scanner; 
class NumberAnalysis {
	// Method to check if the number is positive, negatiive or zero
	public static int numberSignChecker (int number) {
		if (number == 0) return 0;
		else if (number > 0) return 1;
		else return -1;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		// Call the method
		int result = numberSignChecker(number);
		
		// Display the result
		System.out.print(result);
	}
}
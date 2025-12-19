import java.util.Scanner;
class TotalSum {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] array = new double [10];
		double total = 0.0;
		int index = 0;
		// Create an infinite while loop
		while(true) {
			// Check if the array's index exists
			if (index == array.length) {
				break;
			}
			// If the index exists, take user input in it
			System.out.print ("Please enter a number: ");
			array[index] = input.nextDouble();
			// Break if the user enters 0 or a negative number
			if ( array[index] <= 0) {
				break;
			}
			index++;
		}
		// Add all the elements of the array and print the results
		for (int i = 0; i < index; i++) {
			total += array[i];
		}
		System.out.println ("Total sum: " + total);
	}
}
			
				
		
	
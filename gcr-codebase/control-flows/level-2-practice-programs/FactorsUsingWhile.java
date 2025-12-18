import java.util.Scanner;
class FactorsUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		// Take a number as input
		System.out.print ("Enter a number: ");
        int number = input.nextInt();
		
		// Initialize a counter variable
        int counter = 1;
		// Run the while loop till the counter is smaller than the number
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(number + " is divisible by: " + counter);
            }
			// Increment the counter
            counter++;
        }
    }
}

import java.util.Scanner;
class AthleteRounds {
	// Method to find out how many rounds the athlete will have to run
	public static double roundsOfThePark (double side1, double side2, double side3) {
		double perimeter = (side1 + side2 + side3);
		double totalRounds = 5.0 / perimeter;
		return totalRounds;
	}	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of side 1 in kms: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the value of side 2 in kms: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the value of side 3 in kms: ");
		double side3 = input.nextDouble();
		
		// Calling the method and storing the value
		double totalRounds = roundsOfThePark (side1, side2, side3);
		// Display the results
		System.out.print("For running 5 kms, the athelete will have to run the park " + totalRounds + " times");		
	}
}
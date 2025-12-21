import java.util.Scanner; 
class FactorsCalculator {
	
	// Method: to find the factors of a number and save them in an array
	public static int[] factorsFinder (int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) count ++;
		}
		// Create and initialize an array
		int index = 0;
		int[] factorsArray = new int[count];
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factorsArray[index] = i;
				index++;
			}
		}
		// Return the factors array
		return factorsArray;
	}
	
	// Method: to find the sum of the factors
	public static int sumOfFactors (int[] factorsArray) {
		int sum = 0;
		for (int i = 0; i < factorsArray.length; i++) {
			sum += factorsArray[i];
		}
		return sum;
	}
	
	// Method: to find the product of the factors
	public static int productOfFactors (int[] factorsArray) {
		int product = 1;
		for (int i = 0; i < factorsArray.length; i++) {
			product *= factorsArray[i];
		}
		return product;
	}
	
	// Method: to find the sum of squares of the factors
	public static int sumOfSquaresOfFactors (int[] factorsArray) {
		int sumOfSquares = 0;
		for (int i = 0; i < factorsArray.length; i++) {
			int square = (int) Math.pow(factorsArray[i], 2);
			sumOfSquares += square;
		}
		return sumOfSquares;
	}
	
	// Method to display the factors array
	public static void printArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print (array[i] + " ");
		}
	} 
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Please enter a number: ");
		int number = input.nextInt();
		
		// Call method to find the factors
		int [] factors = factorsFinder(number);
		
		// Call method to find the sum of factors
		int sum = sumOfFactors(factors);
		
		// Call method to find the product of factors
		int product = productOfFactors(factors);
		
		// Call method to find the sum of squares of factors
		int sumOfSqaures = sumOfSquaresOfFactors(factors);
		
		// Display the results
		System.out.print ("The factors of the number are: ");
		printArray(factors);
		System.out.println();
		System.out.println("The sum of factors: " + sum);
		System.out.println("The product of factors: " + product);
		System.out.println("The sum of squares of factors: " + sumOfSqaures);
	}
}
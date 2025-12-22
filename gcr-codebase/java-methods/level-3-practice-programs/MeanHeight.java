import java.util.Scanner;
class MeanHeight {
	
	// Mehtod to find the sum of heights
	public static int sumOfHeights (int[] heights) {
		int sum = 0;
		for (int values : heights) {
			sum += values;
		}
		return sum;
	}
	
	// Mehtod to find the mean heights
	public static double meanHeightFinder (int sum) {
		double mean = sum/11.0;
		return mean;
	}
	
	// Method to find the shortest height 
	public static int shortestHeightFinder (int[] heights) {
		int shortest = 250;
		for (int values : heights) {
			if (values < shortest) {
				shortest = values;
			}
		}
		return shortest;
	}
	
	// Method to find the tallest height
	public static int tallestHeightFinder (int[] heights) {
		int tallest = 0;
		for (int values : heights) {
			if (values > tallest) {
				tallest = values;
			}		
		}
		return tallest;
	}

	
	// Main method
	public static void main (String[] args) {
		int[] heights = new int [11];
		// Run a for loop to take random heights between 150 to 250
		for (int i = 0; i < 11; i++) {
			heights[i] = (int)(Math.random() * 101) + 150;
		}
		
		// Call the methods
		int sum = sumOfHeights(heights);
		double mean = meanHeightFinder(sum);
		int shortest = shortestHeightFinder(heights);
		int tallest = tallestHeightFinder(heights);
		
		// Display the results
		System.out.println("Sum of all heights:" + sum);
		System.out.println("Mean of heights: " + mean);
		System.out.println("Shortest height: " + shortest);
		System.out.println("Tallest height: " + tallest);
	}
}
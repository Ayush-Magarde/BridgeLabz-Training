import java.util.Scanner;

// Program to find the youngest and tallest friend among three friends
class FriendsComparison {

	// Method to find the youngest age from the array
	public static int findYoungest(int[] ages) {
		int min = ages[0];
		for (int i = 1; i < ages.length; i++) {
			if (ages[i] < min) min = ages[i];
		}
		return min;
	}

	// Method to find the tallest height from the array
	public static int findTallest(int[] heights) {
		int max = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > max) max = heights[i];
		}
		return max;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ages = new int[3];
		int[] heights = new int[3];

		// Take age and height input for three friends
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter age: ");
			ages[i] = input.nextInt();
			System.out.print("Enter height: ");
			heights[i] = input.nextInt();
		}

		// Display youngest and tallest friend
		System.out.println("Youngest Age: " + findYoungest(ages));
		System.out.println("Tallest Height: " + findTallest(heights));
	}
}

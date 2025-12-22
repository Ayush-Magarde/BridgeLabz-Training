class RandomArrayOperations {

	// Method to generate an array of 4-digit random numbers
	public static int[] generate4DigitRandomArray (int size) {
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = (int) (Math.random() * 9000) + 1000;
		}
		return numbers;
	}

	// Method to find average, minimum and maximum of the array
	public static double[] findAverageMinMax (int[] numbers) {
		int min = numbers[0], max = numbers[0], sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			min = Math.min(min, numbers[i]);
			max = Math.max(max, numbers[i]);
		}
		return new double[] { (double) sum / numbers.length, min, max };
	}

	// Main method
	public static void main (String[] args) {
		// Generate random numbers and compute statistics
		int[] numbers = generate4DigitRandomArray(5);
		double[] result = findAverageMinMax(numbers);

		// Display results
		System.out.println("Average: " + result[0]);
		System.out.println("Min: " + result[1]);
		System.out.println("Max: " + result[2]);
	}
}

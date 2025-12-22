class FactorsOperations {
	// Method to find and store factors
	public static int[] storeFactorsInArray (int number) {
		int factorCount = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) factorCount++;
		}
		int[] factorArray = new int [factorCount];
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) factorArray[index++] = i;
		}
		return factorArray;
	}
	
	// Method to find the greatest factor
	public static int greatestFactorFinder (int[] factorArray) {
		int greatestFactor = 0;
		for (int value : factorArray) {
			if (value > greatestFactor) greatestFactor = value;
		}
		return greatestFactor;
	}
	
	// Method to find the sum of factors
	public static int sumOfFactors (int[] factorArray) {
		int sum = 0;
		for (int value : factorArray) {
			sum += value;
		}
		return sum;
	}
	
	// Method to find the product of factors
	public static int productOfFactors (int[] factorArray) {
		int product = 1;
		for (int value : factorArray) {
			product *= value;
		}
		return product;
	}
	
	// Method to find the product of the cubes of the factors 
	public static int productOfCubesOfFactors (int[] factorArray) {
		int productOfCubes = 1;
		for (int value : factorArray) {
			productOfCubes *= (int)Math.pow(value,3);
		}
		return productOfCubes;
	}
}
class AbundantNumberChecker {
	
	// Method to find the sum of proper divisors
	public static int sumOfDivisors (int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) sum += i;
		}
		return sum;
	}
	
	// Method to check perfect number 
	public static boolean isPerfectNumber (int number) {
		return number == sumOfDivisors(number);
	}
	
	// Method to check abundant number
	public static boolean isAbundantNumber (int number) {
		return number < sumOfDivisors(number);
	}
	
	// Method to find deficient number
	public static boolean isDeficientNumber (int number) {
		return number > sumOfDivisors(number);
	}
	
	// Method to check strong number 
	public static boolean isStrongNumber (int number) {
		int sumOfFactorials = 0;
		int temp = number;
		while (number != 0) {
			int digit = number % 10;
			int factorial = 1;
			for (int i = 1; i <= digit; i++) {
				factorial *= i;
		    }
			sumOfFactorials += factorial;
			number /= 10;
	    }
		return sumOfFactorials == temp;
	}
}
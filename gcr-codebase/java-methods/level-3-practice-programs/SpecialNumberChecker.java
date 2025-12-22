class SpecialNumberChecker {
    // Method to check prime number
    public static boolean isPrime (int number) {
        if (number <= 1) return false;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    // Method to check neon number
    public static boolean isNeon (int number) {
        int square = number * number;
        int sum = 0;
        while(square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check spy number
    public static boolean isSpy (int number) {
        int sum = 0, product = 1;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check automorphic number
	public static boolean isAutomorphic (int number) {
		int square = number * number;
		int temp = number;
		while (temp > 0) {
			if (square % 10 != temp % 10)
				return false;
			square /= 10;
			temp /= 10;
		}
		return true;
	}

    // Method to check buzz number
    public static boolean isBuzz (int number) {
		if ((number % 7 == 0) || (number % 10 == 7)) return true;
		return false;
    }
}

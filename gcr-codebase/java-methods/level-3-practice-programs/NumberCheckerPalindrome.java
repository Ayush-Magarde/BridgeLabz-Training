class NumberCheckerPalindrome {
    // Method to count digits
    public static int countDigits (int number) {
		if (number == 0) return 1;
        int count = 0;
        while(number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] getDigits (int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for(int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseDigits (int[] digits) {
        int[] reversed = new int[digits.length];
        for(int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual (int[] a, int[] b) {
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }

    // Method to check palindrome number
    public static boolean isPalindrome (int[] digits) {
        return areArraysEqual(digits, reverseDigits(digits));
    }

    // Method to check duck number
	public static boolean isDuckNumber(int[] digits) {
		if (digits[0] == 0) return false;
		for (int value : digits) {
			if (value == 0) return true;
		}
		return false;
	}
}

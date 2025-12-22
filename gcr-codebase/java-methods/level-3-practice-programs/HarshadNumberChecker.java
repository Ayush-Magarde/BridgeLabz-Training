class HarshadNumberChecker {
	
    // Method to count digits in number
    public static int countDigits (int number) {
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

    // Method to find sum of digits
    public static int sumOfDigits (int[] digits) {
        int sum = 0;
        for(int value : digits) {
            sum += value;
        }
        return sum;
    }

    // Find sum of squares of digits
    public static double sumOfSquares (int[] digits) {
        double sum = 0;
        for(int value : digits) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad (int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    // Method to find digit frequency
    public static int[][] digitFrequency (int[] digits) {
        int[][] frequency = new int[10][2];
        for(int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for(int value : digits) {
            frequency[value][1]++;
        }
        return frequency;
    }
}

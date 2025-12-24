import java.util.Scanner;
class PrimeChecker {

    // Method to check prime number
    public static boolean isPrime (int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (isPrime(num)) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}

import java.util.Scanner;
class FactorialRecursion {

    // Method to calculate factorial
    public static int factorial (int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("Factorial: " + result);
    }
}

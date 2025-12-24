import java.util.Scanner;
class FibonacciSequence {

    // Method to print Fibonacci sequence
    public static void printFibonacci (int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();
        printFibonacci(terms);
    }
}

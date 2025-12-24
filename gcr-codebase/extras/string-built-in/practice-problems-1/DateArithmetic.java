import java.time.LocalDate;
import java.util.Scanner;
class DateArithmetic {

    // Method to perform date calculations
    public static LocalDate calculateDate (LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        return date;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(input.nextLine());
        LocalDate result = calculateDate(date);
        System.out.println("Final date: " + result);
    }
}

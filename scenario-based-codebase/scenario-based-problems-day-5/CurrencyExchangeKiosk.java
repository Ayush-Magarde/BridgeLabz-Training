/* 18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while). */

import java.util.Scanner;
class CurrencyExchangeKiosk {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		String convertAgain;
		
		// do while loop
		do {
			System.out.print("Enter the amount in rupees: ");
			double rupees = input.nextDouble();
			System.out.println("\nConvert to:");
            System.out.println("1. Yen");
            System.out.println("2. USD");
            System.out.println("3. Pound Sterling");
            System.out.print("Enter choice (1-3): ");
			int targetCurrency = input.nextInt();
			switch(targetCurrency) {
				case 1 -> System.out.print(rupees + " INR is:\t" + (rupees * 1.74) + " Yen");
				case 2 -> System.out.print(rupees + " INR is:\t" + (rupees * 0.011) + " USD");
				case 3 -> System.out.println(rupees + "INR is:\t" + (rupees * 0.0083) + "Pound sterling");
				default -> System.out.print("Invalid answer!");
			} 
			System.out.println("\nDo you wish to make another conversion ? yes/no");
			convertAgain = input.next().toLowerCase();
		}while (convertAgain.equals("yes"));
		System.out.println("Thank you for using Currency Exchange Kiosk!");
	}
}
import java.util.Scanner;
class DiscountDashboard {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Shop for 2000 to avail a discount of 15%");
		System.out.println("Shop for 5000 to avail a discount of 25%");
		System.out.println("Enter the total number of items: " );
		int totalItems = input.nextInt();
		double totalBill = 0;
		for (int i = 1; i <= totalItems; i++) {
			System.out.print("Enter the price of the " + i + " product: ");
			int itemCost = input.nextInt();
			totalBill += itemCost;
		}
		System.out.println("Total bill: " + totalBill);
		if (totalBill >= 2000 && totalBill < 5000) {
			totalBill = totalBill - (totalBill * (0.15));
			System.out.println("Total bill after 15% discount: " + totalBill);
		}
		else if (totalBill > 5000){
			totalBill = totalBill - (totalBill * (0.25));
			System.out.println("Total bill after 25% discount: " + totalBill);
		}
		else {
			System.out.println("No discount applicable");
		}
		
	}
}
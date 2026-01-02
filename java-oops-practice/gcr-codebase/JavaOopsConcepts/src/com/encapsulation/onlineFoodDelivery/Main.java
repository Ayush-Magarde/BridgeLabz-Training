package com.encapsulation.onlineFoodDelivery;

public class Main {

	public static void main(String[] args) {
		
		FoodItem[] orders = {
				new VegItem("Kadhai Paneer", 250, 2),
				new NonVegItem("Chicken Biryani", 400, 3)
				};
		
		for (FoodItem item : orders) {
			
			item.getItemDetails();
			double total = item.calculateTotalPrice();
			
			if (item instanceof Discountable) {
				Discountable d = (Discountable) item;
				System.out.println(d.getDiscountDetails());
				total -= d.applyDiscount();
			}
			
			System.out.println("Total price: " + total);
			System.out.println();
		}

	}

}

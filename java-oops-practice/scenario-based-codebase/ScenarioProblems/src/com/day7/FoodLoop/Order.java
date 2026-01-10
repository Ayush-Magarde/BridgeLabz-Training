package com.day7.FoodLoop;
import java.util.ArrayList;

public class Order implements IOrderable {

	private ArrayList<FoodItem> items;
	private double total;
	
	// Constructor for combo meals
	public Order() {
		items = new ArrayList<> ();
		total = 0;
	}
	
	// Add items to the list
	public void addItem(FoodItem item) {
		if (item.isAvailable()) {
			items.add(item);
			total += item.getPrice();
			item.reduceStock();
		}
		else {
	        System.out.println(item.getName() + " not available right now.");
	    }
	}
	
	// Discount logic
	public double applyDiscount() {
		if(total > 500) {
			return total * 0.10;
		}
		return 0;
	}

	@Override
	public void placeOrder() {
        total = total - applyDiscount();
        System.out.println("Order placed!");
        System.out.println("Final Amount: INR " + total);
	}

	@Override
	public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }

}

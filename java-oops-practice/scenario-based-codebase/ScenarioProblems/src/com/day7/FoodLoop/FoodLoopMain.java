package com.day7.FoodLoop;

public class FoodLoopMain {

	public static void main(String[] main) {
		FoodItem item1 = new VegItem("Cheese Pizza", 400,3);
		FoodItem item2 = new NonVegItem("Biryani", 500,1);
		
		item1.displayFoodInfo();
		item2.displayFoodInfo();
		System.out.println();
		
		Order order = new Order();
		
		order.addItem(item1);
		order.addItem(item2);
		order.addItem(item2);
		
		System.out.println();
		
		order.placeOrder();
	}
}

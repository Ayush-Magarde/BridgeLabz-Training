package com.encapsulation.onlineFoodDelivery;

public abstract class FoodItem {

	private String itemName;
	private double price;
	private int quantity;

	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		setPrice(price);
		setQuantity(quantity);
	}

	// getters and setters

	public String getName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
	}

	public abstract double calculateTotalPrice();

	public void getItemDetails() {
		System.out.println("Item: " + itemName);
		System.out.println("Quantity: " + quantity);
	}
}

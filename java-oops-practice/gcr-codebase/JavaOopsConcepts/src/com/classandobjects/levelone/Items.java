package com.classandobjects.levelone;
class Items {
	// Variables to get item details
	String[] itemCode;
	String[] itemName;
	double[] price;
	
	// Constructor
	Items (String[] itemCode, String[] itemName, double[] price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price; 
	}
	// Method to display the results
	public void displayItems () {
		for (int i = 0; i < price.length; i++) {
			System.out.println ("ItemCode: " + itemCode[i]);
			System.out.println ("ItemName: " + itemName[i]);
			System.out.println ("Price: " + price[i]);
		}
	}	
	// Main method
	public static void main(String[] args) {
		String[] itemName = {"Water bottle", "Rice", "blackboard"};
		String[] itemCode = {"01010A", "02834B", "84374C"};
		double[] price = {500,900,430};
		Items items1 = new Items (itemCode, itemName, price);
		items1.displayItems();
	}
}

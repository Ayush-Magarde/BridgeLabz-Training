package com.encapsulation.ecommercePlatform;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Electronics(1234, "Laptop", 50000);
		Product product2 = new Clothing(5678, "Shirt", 1500);
		Product product3 = new Groceries(9101, "Sugar", 100);

		Product[] products = { product1, product2, product3 };

		for (Product p : products) {
			double tax = 0;
			
			if (p instanceof Taxable) {
				tax = ((Taxable) p).calculateTax();
			}

			double finalPrice = p.getPrice() + tax - p.calculateDiscount();

			System.out.println("Product: " + p.getName());
			System.out.println("Final Price: INR " + finalPrice);
			System.out.println();
		}
	}
}

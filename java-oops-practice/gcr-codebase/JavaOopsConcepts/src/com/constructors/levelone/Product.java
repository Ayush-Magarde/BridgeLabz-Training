package com.constructors.levelone;

public class Product {
	String productName;
	double price;
	static int totalProducts;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	public void displayProductDetails () {
		System.out.println("Product name: " + productName);
		System.out.println("Product price : " + price);
	}
	public static void displayTotalProducts () {
		System.out.println("Total products: " + totalProducts);
	}
}

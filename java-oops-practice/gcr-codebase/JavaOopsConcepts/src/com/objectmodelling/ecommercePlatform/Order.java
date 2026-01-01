package com.objectmodelling.ecommercePlatform;

import java.util.ArrayList;
public class Order {

	private ArrayList<Product> products = new ArrayList<> ();
	
	public void addProducts(Product product) {
		products.add(product);
	}
	
	public void showDetails () {
		System.out.println("Order contains");
		for (Product p : products) {
			System.out.println("- " + p.getProductName() + ": inr " + p.getPrice());
		}
	}
}

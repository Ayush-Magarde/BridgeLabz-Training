package com.objectmodelling.ecommercePlatform;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer("Ayush");
		
		Product product1 = new Product ("Laptop", 50000);
		Product product2 = new Product ("Mouse", 2000);
		
		Order order = new Order();
		order.addProducts(product1);
		order.addProducts(product2);
		
		customer.placeOrder(order);
	}
}

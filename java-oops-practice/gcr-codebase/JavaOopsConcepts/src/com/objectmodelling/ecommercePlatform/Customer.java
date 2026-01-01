package com.objectmodelling.ecommercePlatform;

public class Customer {

	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void placeOrder(Order order) {
		System.out.println(name + " placed an order");
		order.showDetails();
	}
}

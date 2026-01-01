package com.inheritance.multilevelInheritance.onlineRetailOrderManagement;

public class Main {

	public static void main(String[] args) {

		Order order = new Order(101, "01-09-2025");
		ShippedOrder shippedOrder = new ShippedOrder(101, "01-09-2025", "abc123");
		DeliveredOrder deliveredOrder = new DeliveredOrder(101, "01-09-2025", "abc123", "05-09-2025");
		
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
	}
}

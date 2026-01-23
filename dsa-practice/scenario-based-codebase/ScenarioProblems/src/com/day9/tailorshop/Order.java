package com.day9.tailorshop;

public class Order {

    String orderId;
    int deliveryDeadline; // days remaining

    public Order(String orderId, int deliveryDeadline) {
        this.orderId = orderId;
        this.deliveryDeadline = deliveryDeadline;
    }

    @Override
    public String toString() {
        return orderId + " | Deadline (days): " + deliveryDeadline;
    }
}

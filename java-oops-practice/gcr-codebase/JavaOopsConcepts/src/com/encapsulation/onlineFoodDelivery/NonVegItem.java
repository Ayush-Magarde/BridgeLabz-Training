package com.encapsulation.onlineFoodDelivery;

public class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + EXTRA_CHARGE) * getQuantity();
    }
}

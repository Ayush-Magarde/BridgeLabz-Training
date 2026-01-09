package com.day6.MediStore;

public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected String expiryDate;

    private int quantity;          // encapsulated stock
    private double costPrice;      // sensitive pricing logic

    // Constructor with default quantity
    public Medicine(String name, double price, String expiryDate) {
        this(name, price, expiryDate, 100);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, String expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.costPrice = price * 0.6; // internal logic
    }

    // Controlled stock update
    protected void reduceStock(int qty) {
        quantity -= qty;
    }

    public int getQuantity() {
        return quantity;
    }

    // Private pricing logic
    private double applyDiscount(double total) {
        return total > 1000 ? total * 0.9 : total;
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            double total = price * qty;        // operators used
            total = applyDiscount(total);
            reduceStock(qty);
            System.out.println(name + " sold | Total Bill: INR " + total);
        } else {
            System.out.println("Cannot sell " + name + " (Expired / Insufficient Stock)");
        }
    }

    public void displayMedicine() {
        System.out.println(
                name + " | Price: INR " + price +
                " | Expiry: " + expiryDate +
                " | Stock: " + quantity
        );
    }
}

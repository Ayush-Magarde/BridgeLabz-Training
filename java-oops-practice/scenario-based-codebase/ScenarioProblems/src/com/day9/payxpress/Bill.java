package com.day9.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;
    protected double amount;
    private LocalDate dueDate;
    private boolean isPaid;   // 🔒 encapsulated payment status

    // Constructor for recurring bills
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Late fee calculation using operators
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Controlled payment
    protected void markAsPaid() {
        isPaid = true;
    }

    public boolean getPaymentStatus() {
        return isPaid;
    }

    public void displayBillDetails() {
        System.out.println(
                "Bill Type: " + type +
                " | Amount: INR " + amount +
                " | Due Date: " + dueDate +
                " | Paid: " + isPaid
        );
    }
}

package com.day9.payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Water bill payment is pending.");
    }
}

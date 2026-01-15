package com.day4.zipzipmart;

public class Transaction {

    String date;    // YYYY-MM-DD
    double amount;

    public Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " | INR " + amount;
    }
}

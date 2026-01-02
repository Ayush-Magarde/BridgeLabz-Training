package com.encapsulation.libraryManagementSystem;

public class Magazine extends LibraryItem {

    public Magazine(int id, String title) {
        super(id, title);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1; // 1 rupee per day
    }
}

package com.encapsulation.libraryManagementSystem;

public class Book extends LibraryItem implements Borrowable {

    public Book(int id, String title) {
        super(id, title);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2; // 2 rupees per day
    }

    @Override
    public void borrowItem() {
        issueItem();
        System.out.println("Book issued: " + getTitle());
    }

    @Override
    public void returnBorrowedItem() {
        returnItem();
        System.out.println("Book returned: " + getTitle());
    }
}

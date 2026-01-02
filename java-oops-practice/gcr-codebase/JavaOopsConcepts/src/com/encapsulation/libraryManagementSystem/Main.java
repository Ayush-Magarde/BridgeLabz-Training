package com.encapsulation.libraryManagementSystem;

public class Main {

    public static void main(String[] args) {

        LibraryItem item1 = new Book(101, "Book");
        LibraryItem item2 = new Magazine(202, "Time Magazine");

        item1.issueItem();
        item2.issueItem();

        LibraryItem[] items = { item1, item2 };

        for (LibraryItem item : items) {
            System.out.println("Item: " + item.getTitle());
            System.out.println("Fine for 3 days late: INR " +
                item.calculateFine(3));
            System.out.println();
        }
    }
}

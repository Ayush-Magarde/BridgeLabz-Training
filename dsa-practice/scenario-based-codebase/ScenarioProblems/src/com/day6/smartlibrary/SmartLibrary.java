package com.day6.smartlibrary;

public class SmartLibrary {

    private Book[] books;
    private int size;

    public SmartLibrary(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    // Insert book in alphabetical order
    public void addBook(Book book) {

        int i = size - 1;

        while (i >= 0 && books[i].title.compareTo(book.title) > 0) {
            books[i + 1] = books[i];
            i--;
        }

        books[i + 1] = book;
        size++;
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++)
            System.out.println(books[i]);
    }
}

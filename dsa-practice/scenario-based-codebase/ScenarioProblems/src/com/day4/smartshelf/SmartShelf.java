package com.day4.smartshelf;

public class SmartShelf {

    private Book[] books;
    private int size;

    public SmartShelf(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    // Add book and keep list sorted using insertion sort
    public void addBook(Book book) {

        books[size] = book;
        int i = size - 1;

        // Shift books to make space (alphabetical order)
        while (i >= 0 && books[i].title.compareTo(book.title) > 0) {
            books[i + 1] = books[i];
            i--;
        }

        books[i + 1] = book;
        size++;
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}

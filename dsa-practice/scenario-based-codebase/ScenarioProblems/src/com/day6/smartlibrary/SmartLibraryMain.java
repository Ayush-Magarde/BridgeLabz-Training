package com.day6.smartlibrary;

public class SmartLibraryMain {

    public static void main(String[] args) {

        SmartLibrary library = new SmartLibrary(10);

        library.addBook(new Book("Operating Systems"));
        library.addBook(new Book("Algorithms"));
        library.addBook(new Book("Data Structures"));
        library.addBook(new Book("Computer Networks"));

        System.out.println("Borrowed Books (Alphabetical Order):");
        library.displayBooks();
    }
}

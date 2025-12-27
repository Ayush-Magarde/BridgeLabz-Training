package com.classandobjects.levelone;
public class HandBook {
	
	// variables to get book details
	String bookTitle;
	String bookAuthor;
	double price;
	
	// Constructor
	HandBook (String bookTitle, String bookAuthor, double price) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
	
	// Method to display the output
	public void displayBookDetails () {
		System.out.println("Title of the book: " + bookTitle);
		System.out.println("Author of the book: " + bookAuthor);
		System.out.println("Price of the book: " + price);
	}
	
	public static void main (String[] args) {
		HandBook book1 = new HandBook("Gone girl", "Gillian Flynn", 300);
		HandBook book2 = new HandBook("1984", "George Orwell", 500);
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
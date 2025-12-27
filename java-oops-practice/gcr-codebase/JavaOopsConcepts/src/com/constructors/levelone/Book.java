package com.constructors.levelone;

public class Book {
	String author;
	String title;
	int price;

	public Book() {
		title = "Book 1";
		author = "Ayush";
		price = 100;
	}
	public Book(String title, String author, int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	public void displayBooks() {
		System.out.println("Book title: " + title);
		System.out.println("Book author: " + author);
		System.out.println("Book price: " + price);
	}
}

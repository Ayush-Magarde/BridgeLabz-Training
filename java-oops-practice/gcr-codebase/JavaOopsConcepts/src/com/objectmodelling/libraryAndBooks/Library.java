package com.objectmodelling.libraryAndBooks;

import java.util.ArrayList;
public class Library {
	String name;
	ArrayList <Book> books = new ArrayList<> ();
	
	Library(String name) {
		this.name = name;
	}
	
	// method to add books
	public void addBook(Book book) {
		books.add(book);
	}
	
	// method to show books
	public void showBooks() {
		System.out.println("Library name: " + name);
		for (Book b : books) {
			System.out.println(b.title + " by " + b.author);
		}
	}
}

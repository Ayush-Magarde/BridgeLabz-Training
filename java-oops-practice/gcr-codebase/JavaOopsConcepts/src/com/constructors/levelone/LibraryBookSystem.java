package com.constructors.levelone;

public class LibraryBookSystem {
	
	public String ISBN;
	protected String title;
	private String author;
	
	// Constructor
	public LibraryBookSystem(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	// Method to get author info
	public String getAuthor() {
		return author;
	}

}

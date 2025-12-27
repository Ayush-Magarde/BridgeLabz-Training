package com.constructors.levelone;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book ();
		book1.displayBooks();
		Book book2 = new Book ("Hunger games","Author", 150);
		book2.displayBooks();
	}
}

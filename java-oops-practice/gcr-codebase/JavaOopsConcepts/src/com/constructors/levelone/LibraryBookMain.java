package com.constructors.levelone;

public class LibraryBookMain {

	public static void main(String[] args) {

	 LibraryBook book1 = new LibraryBook("1984", "George Orwell", 399);

	 book1.displayBook();

	 book1.borrowBook();   // first borrow
	 book1.borrowBook();   // second borrow attempt

	 book1.displayBook();
	 }
}



package com.objectmodelling.libraryAndBooks;

public class LibraryAndBooksMain {
	
	public static void main (String[] args) {
		
		// Making Book objects
		Book book1 = new Book("1984", "George Orwell");
		Book book2 = new Book("Dark Matter", "Blake Crouch");
		
		// Making library objects
		Library library1 = new Library("City Library");
		Library library2 = new Library("College Library");
		
		library1.addBook(book1);
		library2.addBook(book1);
		library2.addBook(book2);
		
		library1.showBooks();
		library2.showBooks();
	}
}

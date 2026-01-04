package com.linkedList.DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementMain {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "1984", "George Orwell", "Dystopian", true);
        library.addAtEnd(102, "The Alchemist", "Paulo Coelho", "Fiction", true);
        library.addAtBeginning(103, "Clean Code", "Robert Martin", "Programming", false);
        library.addAtPosition(2, 104, "Atomic Habits", "James Clear", "Self-Help", true);

        library.displayForward();
        library.displayReverse();

        library.searchBook("George Orwell");
        library.updateAvailability(102, false);

        library.countBooks();
        library.removeById(103);

        library.displayForward();
    }
}

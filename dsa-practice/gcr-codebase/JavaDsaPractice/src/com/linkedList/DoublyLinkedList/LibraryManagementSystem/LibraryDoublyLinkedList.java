package com.linkedList.DoublyLinkedList.LibraryManagementSystem;

public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    // Add at Beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at Specific Position (1-based)
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove Book by ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Book Not Found!");
            return;
        }

        if (temp == head)
            head = head.next;

        if (temp == tail)
            tail = tail.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        System.out.println("Book Removed!");
    }

    // Search by Title or Author
    public void searchBook(String key) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No matching books found!");
    }

    // Update Availability Status
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book Not Found!");
    }

    // Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available!");
            return;
        }

        BookNode temp = head;
        System.out.println("\nBooks (Forward):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books available!");
            return;
        }

        BookNode temp = tail;
        System.out.println("\nBooks (Reverse):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count Total Books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books in Library: " + count);
    }

    // Helper Method
    private void displayBook(BookNode node) {
        System.out.println(
                node.bookId + " | " +
                node.title + " | " +
                node.author + " | " +
                node.genre + " | " +
                (node.isAvailable ? "Available" : "Issued")
        );
    }
}


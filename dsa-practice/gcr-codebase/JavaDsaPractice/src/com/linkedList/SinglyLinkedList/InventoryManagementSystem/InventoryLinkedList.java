package com.linkedList.SinglyLinkedList.InventoryManagementSystem;

public class InventoryLinkedList {

    private InventoryNode head;

    // Add at Beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int id, String name, int qty, double price) {
        InventoryNode newNode = new InventoryNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at Specific Position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        InventoryNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }

        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove Item by ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty!");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item Removed!");
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Item Not Found!");
        else {
            temp.next = temp.next.next;
            System.out.println("Item Removed!");
        }
    }

    // Update Quantity
    public void updateQuantity(int id, int newQty) {
        InventoryNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item Not Found!");
    }

    // Search by ID or Name
    public void searchItem(int id, String name) {
        InventoryNode temp = head;

        while (temp != null) {
            if (temp.itemId == id || temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item Not Found!");
    }

    // Calculate Total Inventory Value
    public void calculateTotalValue() {
        double total = 0;
        InventoryNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    // Sort by Price (Ascending) – Bubble Sort on Linked List
    public void sortByPriceAscending() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;

            while (current.next != null) {
                if (current.price > current.next.price) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("Inventory Sorted by Price (Ascending)");
    }

    // Sort by Name (Ascending)
    public void sortByNameAscending() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;

            while (current.next != null) {
                if (current.itemName.compareToIgnoreCase(current.next.itemName) > 0) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("Inventory Sorted by Name (Ascending)");
    }

    // Display Inventory
    public void displayAll() {
        if (head == null) {
            System.out.println("No Inventory Items!");
            return;
        }

        InventoryNode temp = head;
        System.out.println("\nID | Name | Qty | Price");
        System.out.println("---------------------------");

        while (temp != null) {
            System.out.println(
                    temp.itemId + " | " +
                    temp.itemName + " | " +
                    temp.quantity + " | ₹" +
                    temp.price
            );
            temp = temp.next;
        }
    }

    // Helper Methods
    private void swapData(InventoryNode a, InventoryNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    private void displayItem(InventoryNode node) {
        System.out.println(
                node.itemId + " | " +
                node.itemName + " | Qty: " +
                node.quantity + " | Price: ₹" +
                node.price
        );
    }
}


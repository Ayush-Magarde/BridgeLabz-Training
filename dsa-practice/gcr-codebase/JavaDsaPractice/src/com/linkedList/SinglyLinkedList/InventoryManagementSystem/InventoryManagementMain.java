package com.linkedList.SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagementMain {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

        inventory.displayAll();

        inventory.searchItem(102, "");
        inventory.updateQuantity(101, 8);

        inventory.calculateTotalValue();

        inventory.sortByPriceAscending();
        inventory.displayAll();

        inventory.sortByNameAscending();
        inventory.displayAll();

        inventory.removeById(103);
        inventory.displayAll();
    }
}

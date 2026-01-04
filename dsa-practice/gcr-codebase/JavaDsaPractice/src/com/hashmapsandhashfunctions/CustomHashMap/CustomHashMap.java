package com.hashmapsandhashfunctions.CustomHashMap;

public class CustomHashMap {

    private static final int SIZE = 10;
    private HashNode[] table;

    public CustomHashMap() {
        table = new HashNode[SIZE];
    }

    // Hash function
    private int hashFunction(int key) {
        return key % SIZE;
    }

    // Put (Insert / Update)
    public void put(int key, int value) {
        int index = hashFunction(key);
        HashNode head = table[index];

        // Update value if key exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                System.out.println("Key updated: " + key);
                return;
            }
            head = head.next;
        }

        // Insert new node at beginning
        HashNode newNode = new HashNode(key, value);
        newNode.next = table[index];
        table[index] = newNode;

        System.out.println("Key inserted: " + key);
    }

    // Get value by key
    public Integer get(int key) {
        int index = hashFunction(key);
        HashNode head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    // Remove key
    public void remove(int key) {
        int index = hashFunction(key);
        HashNode head = table[index];
        HashNode prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null)
                    table[index] = head.next;
                else
                    prev.next = head.next;

                System.out.println("Key removed: " + key);
                return;
            }
            prev = head;
            head = head.next;
        }

        System.out.println("Key not found!");
    }

    // Display Hash Map
    public void display() {
        System.out.println("\nHash Map Contents:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            HashNode temp = table[i];

            if (temp == null) {
                System.out.println("null");
                continue;
            }

            while (temp != null) {
                System.out.print("[" + temp.key + "=" + temp.value + "] -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

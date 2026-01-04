package com.linkedList.DoublyLinkedList.UndoRedoFunctionality;

public class TextEditorHistory {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;

    private int size;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String content) {
        TextStateNode newNode = new TextStateNode(content);

        // Clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        newNode.prev = current;
        current.next = newNode;
        current = tail = newNode;
        size++;

        if (size > MAX_HISTORY)
            removeOldest();
    }

    // Undo operation
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo!");
            return;
        }
        current = current.prev;
        displayCurrent();
    }

    // Redo operation
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo!");
            return;
        }
        current = current.next;
        displayCurrent();
    }

    // Display current state
    public void displayCurrent() {
        if (current == null) {
            System.out.println("Editor is empty!");
            return;
        }
        System.out.println("Current Text: " + current.content);
    }

    // Remove oldest state when limit exceeded
    private void removeOldest() {
        head = head.next;
        if (head != null)
            head.prev = null;
        size--;
    }
}

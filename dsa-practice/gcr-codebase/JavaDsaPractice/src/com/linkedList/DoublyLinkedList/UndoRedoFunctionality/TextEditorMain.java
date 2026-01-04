package com.linkedList.DoublyLinkedList.UndoRedoFunctionality;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        editor.displayCurrent();

        editor.undo();
        editor.undo();

        editor.redo();

        editor.addState("Hello World!!!");

        editor.undo();
        editor.displayCurrent();
    }
}


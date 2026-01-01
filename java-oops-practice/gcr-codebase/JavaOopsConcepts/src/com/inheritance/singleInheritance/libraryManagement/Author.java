package com.inheritance.singleInheritance.libraryManagement;

public class Author extends Book{

	private String name;
	private int age;
	
	public Author (String author, int publicationYear, String name, int age) {
		super(author, publicationYear);
		this.name = name;
		this.age = age;
	}
	
	@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Age: " + age);
    }
}

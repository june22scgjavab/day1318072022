package com.infosys.collection.demos;

public class BookMain {

	public static void main(String[] args) {
		new Book(1, "Spring"); // A new object is created but the reference
		// of newly created object is not stored in any reference variable
		Book book = new Book(2, "Spring");// A new object is created and the
		new Book(1, "Spring").getId();
		new Book(1,"Spring").getName();
		// referenced by a variable book.
		System.out.println(book.getId());
		System.out.println(book.getName());
		// How many objects got created?
		//4

	}

}

package com.infosys.collection.demos;

public class Book {
 private int id;
 private String name;
public Book(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + "]";
}
 
}

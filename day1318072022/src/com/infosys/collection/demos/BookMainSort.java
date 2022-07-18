package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMainSort {

	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<>();
		bookList.add(new Book(3,"DOTNET"));
		bookList.add(new Book(1,"JAVA"));
		bookList.add(new Book(2,"PYTHON"));
		System.out.println("Before Sort");
		System.out.println(bookList);
		Collections.sort(bookList,new BookCompare());
		System.out.println("After Sort");
		System.out.println(bookList);
		
		String str="abc";
		String str2="afc";
		System.out.println(str.compareTo(str2));// ascii value difference
		
		Integer intOj=10;
		Integer intObj2=3;
		System.out.println(intOj.compareTo(intObj2));// if the object
		// calling the compareTo is having higher value then 1
		// is returned if less -1 and if same 0
		
		

	}

}

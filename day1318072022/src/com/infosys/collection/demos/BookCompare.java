package com.infosys.collection.demos;

import java.util.Comparator;

public class BookCompare implements Comparator<Book> {

	/* @Override
	public int compare(Book o1, Book o2) {
		int value=0;
		if(o1.getId()>o2.getId())
		value=1;
		else if(o1.getId()<o2.getId())
		value=-1;
		return value;
	} */

	public int compare(Book o1, Book o2) {
	  return o2.getName().compareTo(o1.getName());
	} 
	
	}


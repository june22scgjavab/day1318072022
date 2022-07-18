package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveElementDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Suman");
		names.add("Subhash");
		names.add("Rahil");
		String nametoDelete = "Subhash";
		Iterator<String> itr = names.iterator();
		/*
		 * while(itr.hasNext()) { String str=itr.next(); System.out.println(str); }
		 */
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals(nametoDelete)) {
				itr.remove();

			}
		}
	   System.out.println(names);
	
	}

}

package com.infosys.collection.demos;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	  //In the following line we have created an object of ArrayList
		ArrayList list=new ArrayList();
		Object obj="Hello";
		list.add(obj);      // boolean add(Object object)     Object get(int pos)  
		list.add("Ashok");
		list.add("Soham");
		for(Object object : list) {
			System.out.println(object);
			/*System.out.println(object.toString());
			String str=(String)object;
			System.out.println(str); */
		}
		System.out.println(list);
		System.out.println(list.toString());
		for(int i=0;i<list.size();i++)   // size method returns the number of elements in the ArrayList
		{
			System.out.println(list.get(i));   // get(int pos) returns the object on the position
			// mentioned as a parameter of the get method
		}
        // System.out.println(list.get(20));// java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 3
		
	}

}

package com.infosys.collection.demos;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		// The above line can be interpreted as such
		// Integer intObj=1;  // autoboxing
		// Object obj=intObj; 
		// Object
		//   |
		//  Number
		//   |
		//  Integer
		list.add(2);
		list.add(40);
		for(Object object : list)
		{
			System.out.println(object);
		}
		

	}

}

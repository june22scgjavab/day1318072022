package com.infosys.collection.demos;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Soham");
		list.add("Suresh");
		list.add("Soham");
		list.add("Ravi");
		list.add("Ravi Sharma");
		for (String name : list) {
			System.out.println(name);
		}
		/*
		 * list.add(1); //The method add(int, String) in the type ArrayList<String> is
		 * not applicable for the arguments (int) list.add(true);
		 */
		ArrayList<Character> list2 = new ArrayList<>();
		list2.add('A');
		list2.add('B');
		System.out.println("Before update");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++)

		{
			if (list.get(i).equals("Soham")) {
				list.set(i, "Soham Kumar");
			}

		}

		System.out.println("After update");
		System.out.println(list);

	}

}

package com.infosys.generics.demo;

// Generics used with Reference type
public class WithGenerics {

	public static void main(String[] args) {

		Integer nums[] = { 1, 2, 3, 4, 5 };
		add(nums);
		String str[] = { "One", "Two", "Three" };
		add(str);
	}

	private static <E> void add(E[] datas) {
		String str2 = "";
		int sum = 0;
		for (E data : datas) {
			if (data instanceof Integer) {
				int num = (Integer) data;
				sum += num;
				
			} else if (data instanceof String) {
				str2 += data;
				
		}
			System.out.println(sum);
			System.out.println(str2);
		}
	}

}

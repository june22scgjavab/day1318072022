package com.infosys.generics.demo;
// We have two add method one for String and one for int
public class WithoutGenerics {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5};
		add(nums);
	    String str[]= {"One","Two","Three"};	
        add(str);
	}
	

	private static void add(String[] str) {
		String str2="";
		for(String number : str)
		{
			str2+=number;
		}
		System.out.println(str2);
	}


	private static void add(int[] nums) {
		int sum=0;
		for(int n : nums)
		{
			sum+=n;
		}
		System.out.println(sum);
	}

}

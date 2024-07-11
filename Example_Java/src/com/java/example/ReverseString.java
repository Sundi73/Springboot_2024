package com.java.example;

public class ReverseString {

	public static String reverseOrder(String s) {

		String rev = "";
		
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		String s = "Ashutosh";
		System.out.println(reverseOrder(s));

	}

}

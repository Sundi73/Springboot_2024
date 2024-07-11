package com.java.example;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		int[] array = {23,12,32,11,9,3,34,67};
		
		int secondHighest = secondHighestNumber(array);
		System.out.println(secondHighest);

	}

	public static int secondHighestNumber(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i: array) {
			if(i > highest) {
				secondHighest = highest;
				highest = i ;
			}else if (i > secondHighest) {
				secondHighest = i ;
			}
		}
		return secondHighest;
	}
	
}

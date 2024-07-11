package com.check.junit.practice;

public class CheckPalindrome {
	
	public boolean isPalindrome(String str) {
		String rev= "";
		
		for(int i =str.length()-1; i >= 0;i--) { //madam
			rev += str.charAt(i);
		}
		
		if(str.equals(rev))
			return true;
		else
			return false;
	}

}

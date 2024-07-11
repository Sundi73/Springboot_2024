package com.check.junit.practice;

public class CheckException {
	
	public static Integer convertToInteger(String str) {
		
		if(str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
		
		return Integer.valueOf(str);
	}

}

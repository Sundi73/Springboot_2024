package com.java.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingFrequency {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","A","A","B","C","D");
		
		Map<String, Long> newCollect = list.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));
		
		newCollect.entrySet().stream().filter(e -> e.getValue() > 1).
								forEach(e -> System.out.println(e.getKey()+"-"+e.getValue()));
		
	}

}

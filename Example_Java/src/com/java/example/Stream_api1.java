package com.java.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_api1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(60);
//		
//		List<Integer> list1 = list.stream().map(e -> e * e).collect(Collectors.toList());
//		System.out.println("List  : "+ list);
//		System.out.println("List 1 : " +list1);
//		
		Set<Integer> list2 = list.stream().map(e -> e * e).collect(Collectors.toSet());
		System.out.println(list2);
	}

}

package com.java.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortintMapByValue {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(101,"Deepak");
		map.put(102,"Ramesh");
		map.put(103,"Suresh");
		map.put(104,"Avi");
		map.put(105,"Gyanesh");
		map.put(106,"Balram");
		map.put(107,"Jatin");
		map.put(108,"Chandra");
		map.put(109,"Firoz");

		Map<Integer,String> map2 =  map.entrySet().stream()
							.sorted(Map.Entry.comparingByValue())
												.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1 ,LinkedHashMap::new));
		
		map2.forEach((key,value) -> System.out.println(key+" "+value));
		
		
	}

}

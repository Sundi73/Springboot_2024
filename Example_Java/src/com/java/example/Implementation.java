package com.java.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Implementation {
	
	public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<>();
		
		map.put(101, new Employee("Ashutosh","Delhi","IT"));
		map.put(102, new Employee("Shivam","Gorakhpur","Sales"));
		map.put(103, new Employee("Abhishek","Mumbai","MERN"));
		map.put(104, new Employee("Mohan","Lucknow","Finance"));
		map.put(105, new Employee("Gyanesh","Gorakhpur","Pathology"));
		
		//System.out.println(map);
		
		for (Map.Entry<Integer, Employee> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
//		map.forEach((key , value) -> {
//			// System.out.println("Key : "+ key + " Value : "+value);
//		});
//		
//		
//		List<String> names = Arrays.asList("Ashutosh","Shivam","Abhishek","Rahul","Komal","Avi");
//		
//		List<String> sortedName = names.stream().sorted().collect(Collectors.toList());
//		sortedName.forEach(entry -> System.out.println(entry));
		
	}

}

package com.java.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mapexample1 {

	public static void main(String[] args) {
		
		int[] arr = {20,4,30,10,5};
		Arrays.sort(arr);

		for(int i : arr) {
			System.out.println(i);
		}
		
	List<Integer> j = 	IntStream.of(arr).boxed().collect(Collectors.toList());
	
	j.forEach(System.out::println);

	}

}

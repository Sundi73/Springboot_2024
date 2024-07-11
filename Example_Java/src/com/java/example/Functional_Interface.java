package com.java.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Functional_Interface {

	public static void main(String[] args) {
		
		Person p = new Person();
		Function<Integer,String> add = e -> e*10 +" output when multiply by 10";
		
		// System.out.println(add.apply(2));

		BiFunction<Integer,Integer, Integer> add1 = (m,n) -> m+n;
		
		Integer apply = add1.apply(10, 20);
		
		// System.out.println(apply);
		
		Predicate<String> check = n -> n.length()>5;
		
		// System.out.println(check.test("abcd"));
		
		
		
		// Consumer<String> msg = n -> System.out.println(n);
		
	//	msg.accept("I am in consumer");
		
		Consumer<Person> setName = n -> n.setName("Ashutosh");
			setName.accept(p);
	// System.out.println(p.getName());
			
			
		Supplier<Double> getRandomNumber = () -> Math.random();	
		System.out.println(getRandomNumber.get());
	}

}

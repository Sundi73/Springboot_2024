package com.crud.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorTestClass {
	
	private static Calculator cal;
	@BeforeAll
	public static void beforeAll() {
		 cal = new Calculator();
	}
	@AfterAll
	public static void afterAll() {
		cal = null;
	}
	@Test
	public void testAdd() {
		int add = cal.checkAdd(10,20);
		int result = 30;
		
		assertEquals(result, add);
		
	}
	
	

}

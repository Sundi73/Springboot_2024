package com.check.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.check.junit.practice.EvenOrOdd;

@SpringBootTest
public class checkNumberTest {
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv",numLinesToSkip = 1)
	public void isNumEvenOrOdd(String actual,String expected) {
		EvenOrOdd eoo = new EvenOrOdd();
		String checkNumber = eoo.checkNumber(Integer.parseInt(actual));
		assertEquals(expected,checkNumber);
		
	}

}

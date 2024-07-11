package com.check.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.check.junit.practice.CheckException;
@SpringBootTest
public class CheckExceptionTest {
	@Test
	public void exceptionCheck() {
		String str = "1";
		assertThrows(IllegalArgumentException.class, () -> CheckException.convertToInteger(str));
	}

}

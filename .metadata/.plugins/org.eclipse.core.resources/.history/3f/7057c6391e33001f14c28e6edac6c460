package com.check.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.check.junit.practice.CheckPalindrome;

@SpringBootTest
public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = {"racecar","madam","liril","radar","ashsa"})
	public void testPalindrome(String str) {
		CheckPalindrome cp = new CheckPalindrome();
		boolean result = cp.isPalindrome(str);
		assertTrue(result);
	}
}

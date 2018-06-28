package com.stackroute.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.stackroute.assignment.ReversePalindrome;

class ReversePalindromeTest {

	@Test
	void testReverseString() {
		String expectedValue="narmis";
		ReversePalindrome rs = new ReversePalindrome();
		String actualValue = rs.reverseString("simran");
		assertEquals(expectedValue,actualValue);
	}



	@Test
	void testReverseAndPalindrome() {
		String expectedValue="12344321";
		ReversePalindrome rs = new ReversePalindrome();
		String actualValue = rs.reverseString("12344321");
		assertEquals(expectedValue,actualValue);
	}


	@Test
	void testInvalidString() {
		String expectedValue="Invalid Input";
		ReversePalindrome rs = new ReversePalindrome();
		String actualValue = rs.reverseString("");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	void testValidString() {
		String expectedValue="a";
		ReversePalindrome rs = new ReversePalindrome();
		String actualValue = rs.reverseString("a");
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void testIsNotPalindrome() {
		boolean expectedValue=false;
		ReversePalindrome rs = new ReversePalindrome();
		boolean actualValue = rs.isPalindrome("simran","narmis");
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void testIsPalindrome() {
		boolean expectedValue=true;
		ReversePalindrome rs = new ReversePalindrome();
		boolean actualValue = rs.isPalindrome("12344321","12344321");
		assertEquals(expectedValue,actualValue);
	}


}

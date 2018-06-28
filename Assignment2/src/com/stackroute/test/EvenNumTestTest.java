package com.stackroute.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stackroute.assignment.EvenNumTest;

class EvenNumTestTest {

	@Test
	void testIsNotEven() {
		boolean expectedValue= false;
		boolean actualValue = EvenNumTest.isEven(55);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testIsEven() {
		boolean expectedValue= true;
		boolean actualValue = EvenNumTest.isEven(56);
		assertEquals(expectedValue, actualValue);
	}

}

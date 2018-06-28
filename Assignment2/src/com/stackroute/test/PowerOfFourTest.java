package com.stackroute.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stackroute.assignment.PowerOfFour;

class PowerOfFourTest {

	@Test
	void testIsPowerOfFour() {
		PowerOfFour pof = new PowerOfFour();
		boolean expectedValue = true;
		boolean actualValue = pof.isPowerOfFour(256);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testIsNotPowerOfFour() {
		PowerOfFour pof = new PowerOfFour();
		boolean expectedValue = false;
		boolean actualValue = pof.isPowerOfFour(200);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testCheckForZero() {
		PowerOfFour pof = new PowerOfFour();
		boolean expectedValue = false;
		boolean actualValue = pof.isPowerOfFour(0);
		assertEquals(expectedValue, actualValue);
	}

}

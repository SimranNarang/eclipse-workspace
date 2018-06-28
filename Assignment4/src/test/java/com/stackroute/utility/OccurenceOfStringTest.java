package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OccurenceOfStringTest {

	@Test
	public void testTotalOccurenceOfStirng() {
		OccurenceOfString occurenceOfString = new OccurenceOfString();
		int expected=6;
		int actual =occurenceOfString.totalOccurenceOfStirng("java is java again java and java java then java","java"); 
		assertEquals(expected, actual);
	}

}

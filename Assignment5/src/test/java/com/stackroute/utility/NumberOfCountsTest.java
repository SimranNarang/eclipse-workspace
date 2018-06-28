package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfCountsTest {

	@Test
	public void testNumberOfString() {
		//Arrange
		String expected = new String("{one=5, two=2, three=2}");
		NumberOfStrings noc = new NumberOfStrings();
		
		//Act
		String actual= noc.numberOfString(new String("“one one -one___two,,three,one @three*one?two”"));
		//assert
		assertEquals(expected, actual);
	}

}

package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMatcherTest {

	@Test
	public void test() {
		StringMatcher matcher = new StringMatcher();
		boolean expected = true;
		boolean actual = matcher.stringMatcher("Hello Harry?", "harry");
		assertEquals(expected, actual);
	}

}

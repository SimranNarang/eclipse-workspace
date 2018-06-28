package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplacingCharacterTest {

	@Test
	public void testReplacingCharacter() {
		String expected="faity fry";
		ReplacingCharacter repchar = new ReplacingCharacter();
		String actual = repchar.replacingCharacter("daily dry");
		assertEquals(expected, actual);
	}

}

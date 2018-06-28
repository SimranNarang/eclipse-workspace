package com.stackroute.utility;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RegexFindTextTest {

	@Test
	public void testIndexStrings() {
		RegexFindText obj = new RegexFindText();
		List<String> expected = new ArrayList<String>();
		expected.add("4-6");
		expected.add("10-12");
		expected.add("27-29");
		List<String> actual=obj.IndexStrings("She sells seashells by the seashore", "se");
		assertEquals(expected, actual);

	}

}

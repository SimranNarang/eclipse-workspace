package com.stackroute.utility;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SetSorterTest {

	@Test
	public void testSortSet() {
		SetSorter setSorter = new SetSorter();
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("alice", "Bluto", "Eugene", "Harry", "Olive"));
		assertEquals(expectedList, setSorter.sortSet(new String[] {"Harry", "Olive", "alice", "Bluto", "Eugene"}));
	}

}

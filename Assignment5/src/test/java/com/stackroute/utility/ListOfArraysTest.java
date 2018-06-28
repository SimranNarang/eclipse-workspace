package com.stackroute.utility;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ListOfArraysTest {

	@Test
	public void test() {
		//arrange
		ListOfArrays loa = new ListOfArrays();
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Kiwi");
		expected.add("Grape");
		expected.add("Mango");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Grape");
		list.add("Mango");
		
		//Act
		ArrayList<String> actual = loa.listofArrays(list, "Apple", "Kiwi");
		
		//Assert
		assertEquals(expected, actual);
		
	}

}

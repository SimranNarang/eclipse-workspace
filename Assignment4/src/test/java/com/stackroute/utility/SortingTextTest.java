package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortingTextTest {

	   SortingText sortWord;
	    @Before
	    public  void setup() {
	        sortWord = new SortingText();
	    }
	    @Test
	    public void testSortWordsOfText() {
	        String expected = "aajv is fnu";
	        assertEquals(expected,sortWord.sortWordsOfText("java is fun"));
	    }
	    @Test
	    public void testSortGivenWord() {
	        String expected = "aajv";
	        assertEquals(expected,sortWord.sortGivenWord("java"));
	    }

	}


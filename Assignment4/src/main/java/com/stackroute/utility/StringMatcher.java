package com.stackroute.utility;

public class StringMatcher {
	public boolean stringMatcher(String string,String substring) {
		
		return string.toLowerCase().contains(substring.toLowerCase());
	}

}

package com.stackroute.utility;

public class OccurenceOfString {
	public int totalOccurenceOfStirng(String string,String substring) {
		int actual_length= string.length();
		String replacedString = string.toLowerCase().replaceAll(substring.toLowerCase(),"");
		int replaced_length = replacedString.length();
		int cnt = (actual_length-replaced_length)/substring.length();
		return cnt;
		}


}

package com.stackroute.utility;

import java.io.DataInput;

//Reverse the String and check for Palindrome
public class PalindromeChecker {
	
	//constructor
	public PalindromeChecker() {}
	
	/*Reverse String method is used to reverse the string with the use of for loop*/
	
	public String reverseString(String str){
		if(str.isEmpty()) {
			return "Invalid Input";
		}else if(str.length()==1){
			return str;
		}
		String rev = "";
	    for (int i = str.length()-1; i>=0 ; i--) {
	        char ch = str.charAt(i);
	        rev+=ch;
	        }
	    if(isPalindrome(str,rev)) {
	    	System.out.println("The String is Palindrome");
	    }else {
	    	System.out.println("Not a Palindrome");
	    }
	    return rev;
	}
	
	public boolean isPalindrome(String str,String rev){
		if(rev.equals(str)) {
			return true;
		}else {
			return false;
		}
		
	}

}

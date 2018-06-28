package com.stackroute.assignment;

/*This class is used to reverse as well as check the 
palindrome of the given string*/

public class ReversePalindrome {
	
	/*Constructor for the class*/
	public ReversePalindrome() {
		super();
	}
	
	/*This method is used to reverse the string using for loop
	*/
	public String reverseString(String str){
		if(str.isEmpty()) {
			throw new IllegalArgumentException("Object is null");
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
	/*this methods check it it is a palindrome or not*/
	public boolean isPalindrome(String str,String rev){
		if(rev.equals(str)) {
			return true;
		}else {
			return false;
		}
		
	}

}

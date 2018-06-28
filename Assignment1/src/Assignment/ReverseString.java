package Assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
	    String str = sc.next();
	    String rev = new String();
	    
	    for (int i = str.length()-1; i>=0 ; i--) {
	        char ch = str.charAt(i);
	        rev+=ch;
	        }
	    System.out.println(rev);
	 }
}



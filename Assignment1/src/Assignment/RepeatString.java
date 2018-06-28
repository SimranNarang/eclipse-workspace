package Assignment;

import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String str= sc.next();
	    System.out.print("Enter an integer: ");
	    int x= sc.nextInt();
	    String substr = str.substring(str.length()-x);
	    for(int i =1; i<=x ;i++) {
	        str = str.concat(substr);
	    }
	    System.out.println(str);
	}

}

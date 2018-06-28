package com.stackroute.utility;

import java.util.Scanner;

public class Trial {
	public static void main(String[] args) {
		System.out.println("Enter the string to be checked");
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		for(int i=0;i<=((x.length())-1);i++) {
			char s =x.charAt(i);
			if((s=='0')||(s==1)||(s==2)||(s==3)||(s==4)||(s==5)||(s==6)||(s==7)||(s==8)||(s==9))
			System.out.println("Not a letter");
			else if((s=='a')||(s=='e')||(s=='i')||(s=='o')||(s=='u')||(s=='A')||(s=='E')||(s=='I')||(s=='O')||(s=='U')) {
				System.out.println(s+ " is a vowel");
			}
			else {
				System.out.println(s +" is a consonant");
			}
		}
	}
}

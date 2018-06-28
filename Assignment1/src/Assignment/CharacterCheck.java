package Assignment;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		String s = sc.next();
		char ch = s.charAt(0);
		if(ch >= 65 && ch<= 90) {
			System.out.println("Capital Letter");
		} else if(ch>=97 && ch<=122) {
			System.out.println("Small Letter");
		} else if(ch>=48 && ch<=57) {
			System.out.println("Number");
		} else {
			System.out.println("Special Character");
		}

	}

}

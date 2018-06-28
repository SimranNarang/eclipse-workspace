package Assignment;
import java.util.Scanner;

public class LetterCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = sc.next();
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
				switch(ch) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					al.add(c+" is vowel");
					break;
				default:
					al.add(c+" is consonant");
					
				}
			}else {
				al.add("Not a letter");
			}
		}
		
		
		
	}

}

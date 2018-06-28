package Assignment;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num,rev=0,sum=0;
		while(temp!=0) {
			int mod = temp%10;
			if(mod%2==0) {
				sum = sum+mod;
			}
			rev = rev*10 + mod;
			temp = temp/10;
		}
		
		if(num==rev) {
			System.out.print(num+" is palindrome");
			if(sum < 25) {
				System.out.print(" and sum of even numbers is less than 25.");
			
			}else if(sum > 25) {
				System.out.print(" and sum of even numbers is greater than 25.");
			}else {
				System.out.print("and sum of even numbers is equal to 25.");
			}
		
		
		}else {
			System.out.println(num+" is not palindrome.");
		}
	}
}

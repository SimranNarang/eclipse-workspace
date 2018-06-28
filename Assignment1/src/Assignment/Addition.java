package Assignment;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Inputs you want to give: ");
		int n = sc.nextInt();
		int sum = 0,num;
		try {
			
			for(int i=0;i<=n;i++) {
				 System.out.print("Enter the number: ");
				 num = sc.nextInt();
				 sum+=num;
			}
		}
		catch(Exception e) {
			System.out.println("The Value was not an Integer!!");
		}
		System.out.println("Sum is: "+sum);
	}

}

package Assignment;
import java.util.Scanner;

public class TomJerry {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		if(num>=20 && num<=30) {
			if(num%2==0) {
				System.out.println("Jerry");
			}else {
				System.out.println("Tom");
			}
		}
	}
}

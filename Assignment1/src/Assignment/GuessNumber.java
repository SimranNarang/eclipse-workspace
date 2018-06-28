package Assignment;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long from = 1,to = 100;
        int randomNumber = 78,guessedNumber = 0;
        System.out.printf("The number is between %d and %d.\n", from, to);
 
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = sc.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }

}

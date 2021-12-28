package Practice.MYSELF;

import java.util.Scanner;

public class Randomnum {

	public static void guessingNumberGame() {

		Scanner sc = new Scanner(System.in);

		int number = 1 + (int) (150 * Math.random());
		int K = 7;
		int i, guess;

		System.out.println("A number is Taken " + " between 50 to 150." + "Guess the number" + " within 7 Guess.");

		for (i = 1; i < K; i++) {

			System.out.println("Guess the number:");
			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations!" + " 67You guessed the number.");
				break;
			} else if (number > guess && i != K -1) {
				System.out.println("The number is " + "greater than " + guess);
			} else if (number < guess && i != K -1) {
				System.out.println("The number is" + " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println("You have exhausted" + " K trials.");

			System.out.println("The number was " + number);
		}
	}

	public static void main(String arg[]) {

		guessingNumberGame();
	}
}

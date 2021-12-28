package ass6.randomnum;

import java.util.Random;
import java.util.Scanner;

public class Randomnum {

	public static void main(String[] args) {

		int answer, guess;

		final int MAX = 150;

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		boolean correct = false;
		answer = rand.nextInt(MAX) + 1;

		while (!correct) {

			System.out.println("Guess a number between 50 and 150: ");

			guess = scan.nextInt();

			if (guess > answer) {
				System.out.println("Too high, try again");
			}

			else if (guess < answer) {
				System.out.println("Too low, try again");
			}

			else {

				System.out.println("Yes, you guessed the number.");

				correct = true;
			}
		}
		System.exit(0);
	}

}

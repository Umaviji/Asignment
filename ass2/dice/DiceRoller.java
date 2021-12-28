package ass2.dice;

import java.util.Random;

import Practice.MYSELF.Dice;

public class DiceRoller {

	int computerscore;
	int userscore;
	int userwin;
	int computerwin;

	public void roller() {
		Random rand = new Random();
		for (int roll = 0; roll < 10; roll++) {
			int userscore = rand.nextInt(6) + 1;
			int computerscore = rand.nextInt(6) + 1;

			System.out.println("Enter Computer score: " + computerscore);
			System.out.println("Enter user score: " + userscore);
			if (computerscore < userscore) {
				System.out.println("In the Game: " + roll + "userwins");
				userwin++;

			} else if (computerscore > userscore) {
				System.out.println("In the Game: " + roll + "computerwins");
			} else {
				System.out.println("!!Game Get Tie!!");
			}
             //	System.out.println("=======================");

			if (computerwin < userwin) {
				System.out.println("The  winner is USER");

			} else if (computerwin > userwin) {
				System.out.println("The winner is COMPUTER");
			} else {
				System.out.println("no winner");
				//System.out.println("=====================================");

			}
		}

	}

	public static void main(String[] args) {
		DiceRoller game = new DiceRoller();
		game.roller();
	}

}

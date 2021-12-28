package Practice.MYSELF;

import java.util.Random;

public class Dice {
	int computerscore;
	int userscore;
	int computerwins;
	int userwins;
	public void roller() {
		Random rand =new Random();
		for (int x = 0; x <10; x++) {
			 computerscore=1+rand.nextInt(6);
			 userscore=1+rand.nextInt(6);
					System.out.println("Computer score: "+computerscore);
					System.out.println("user score: "+userscore);
				if (computerscore<userscore) {
					System.out.println("In the round: "+x+"userwins");
					userwins++;
					
				}	else if (computerscore>userscore) {
					System.out.println("Inthe round: "+x+"computerwins");
				}else {
					System.out.println("the game tie");
				}
			if (computerwins<userwins) {
				System.out.println("the final winner is user");
				
			}else if (computerwins>userwins) {
			System.out.println("the final winner is computer");	
			}else {
				System.out.println("no winners");
				
				
		
			}
		}
	

	}
public static void main(String[] args) {
	Dice game=new Dice();
	game.roller();
}
}

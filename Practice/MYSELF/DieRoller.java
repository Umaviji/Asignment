package Practice.MYSELF;

import java.util.Random;

public class DieRoller {
	
	    private Random dieRoll;

	    private int dieValue1;
	    private int dieValue2;
	    private int dieValue3;
	    private int dieValue4;

	    // roll() method header that rolls the die (creates a Die object and gets a random value for the object).
	    public DieRoller()
	    {
	        Random dieRoll = new Random();
	        dieRoll.setSeed(System.currentTimeMillis());
	    }

	    public void roll() {

	        // Get a random integer value for the dice between 1 and 6.
	        dieValue1 = dieRoll.nextInt(6) + 1;
	        dieValue2 = dieRoll.nextInt(6) + 1;
	        dieValue3 = dieRoll.nextInt(6) + 1;
	        dieValue4 = dieRoll.nextInt(6) + 1;

	    }
	    // method that returns the value of die1.
	    public int roll_1()
	    {
	        return dieValue1;
	    }
	    // method that returns the value of die2.
	    public int roll_2()
	    {
	        return dieValue2;
	    }
	    // method that returns the value of die3.
	    public int roll_3()
	    {
	        return dieValue3;
	    }
	    // method that returns the value of die4.
	    public int roll_4()
	    {
	        return dieValue4;
	    }
	    // method that returns the sum of the values of die1, die2, die3, and die4.
	    public int sum()
	    {
	        return dieValue1 + dieValue2 + dieValue3 + dieValue4;
	    }

	    public static void main (String [] args) {

	        DieRoller roller = new DieRoller();
	        roller.roll();

	        // Roll the dice (redirect to the roll() methods) and declare variables to hold the values that have returned.
	        int dieValue1 = roller.roll_1();
	        int dieValue2 = roller.roll_2();
	        int dieValue3 = roller.roll_3();
	        int dieValue4 = roller.roll_4();

	        // Declare a variable for the sum of the dice values (and add the dice values to get that sum).
	        int diceSum = roller.sum();

	        // Print the sum of the rolled dice.
	        System.out.println("Your sum of the dice values: ");
	        System.out.println(diceSum);

	        // Determine if the user won or not.
	        if (diceSum == 6 ||diceSum == 12 ||diceSum == 13 ||diceSum == 17 || diceSum == 19 ||diceSum == 23)
	            System.out.println("You win!");
	    }
	}


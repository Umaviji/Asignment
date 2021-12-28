package Practice.MYSELF;

import java.util.Random;

public class DiceGame {
	public static void main(String[] args ) {
	        // TODO Auto-generated method stub
	        
	        Random random = new Random();
	        int totalNumberOfTurns = 10;
	        int computerDie;
	        int computerScore = 0;
	        int userScore = 0;
	    
	        for( int turn = 1; turn <= totalNumberOfTurns; turn++) {
	            computerDie = random.nextInt( 6 ) + 1;
	            int userDie1 = 0;
	            
	           if ( computerDie > userDie1 ) {
	            computerScore = computerScore + 1;
	                System.out.println("Computer won turn" + turn );
	            } else if ( userDie1 > computerDie ) {
	                System.out.println("User won turn" + turn );
	                userScore = userScore + 1;
	            } else { 
	                System.out.println("turn" + turn + "was a tie" );
	             }
	            
	            Object ComputerScore = null;
	            Object userScore1 = null;
	            if ( computerDie > userDie1 ) {
	                System.out.println("Computer was the grand winner, winning" + ComputerScore + "out of" + totalNumberOfTurns + "turns" );
	              } else if ( userDie1 > computerDie ) {
	                System.out.println("User was the grand winner, winning" + ComputerScore + "out of" + totalNumberOfTurns + "turns" );
	                
	            } else if(ComputerScore == userScore1) { 
	                System.out.println("It was a tie with computer winning" + ComputerScore + "turns and user winning" + userScore + "turns all out of" + totalNumberOfTurns ); 
	            
	           }
	            
	        
	        
	        }
	    }
	}    
	            
	        
	            
	            
	          
	            
	     


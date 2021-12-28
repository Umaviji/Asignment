package Practice.MYSELF;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int userscore=0;
		int cpuscore=0;
		System.out.println("How many rounds?: ");
		int rounds = scan.nextInt();
		
		for (int x = 1; x <rounds; x++) {
			int userchoice=rand.nextInt(6) +1;
			int cpuchoice=rand.nextInt(6) +1;
			
			if (userchoice<cpuchoice) {
			cpuscore +=1;
		}else if (userchoice>cpuchoice) {
			userscore+=1;
		}
			
		}
			System.out.printf("USER SCORE:%d\nCPU SCORE:%d\n",userscore,cpuscore);
			if (userscore<cpuscore) {
				System.out.println("Cpu won!");
			}else if (userscore>cpuscore) {
				System.out.println("you won!");
			}
			else {
				System.out.println("it will tie");
			}
		}
		
	
	}
	


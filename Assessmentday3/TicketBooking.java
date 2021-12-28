
package Assessmentday3;

import java.util.Scanner;

public class TicketBooking {
	Scanner sc = new Scanner(System.in);
	double amount;

	public void ticket() {
		System.out.print("Enter the No.of.Persons: ");
		int person = sc.nextInt();
		System.out.print("Enter the Age Limit: ");
		int age = sc.nextInt();
		if (age <= 3) {
			System.out.println("Total Ticket Charge : " + "Free");
		} else if (age >= 3 && age <= 12) {
			System.out.println("Total Ticket Charge : " + person * 70);
			amount = person * 70;
		} else if (age >= 13 && age <= 20) {
			System.out.println("Total Ticket Charge : " + person * 120);
			amount = person * 120;
		} else if (age >= 21 && age <= 54) {
			System.out.println("Total Ticket Charge : " + person * 200);
			amount = person * 200;
		} else if (age >= 55) {
			System.out.println("Total Ticket Charge : " + person * 150);
			amount = person * 150;
		}
		System.out.println("-----------");
		amount = amount + (amount * 0.02);
		System.out.println("Final Amount to be Paid by the person");
	}
}

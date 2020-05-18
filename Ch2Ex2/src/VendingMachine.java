/*
 * The VendingMachine program prompts the user for an input of the price of an item in a vending machine (in increments of 5). It then calculates the change
 * they would receive from that transaction (assuming they put in a dollar) and displays the change the user receives sorted into quarters, dimes, and nickels.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/10/17 at 4:16pm.
 */

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		//creates a new scanner
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int remainder, quarters, dimes, nickels;
		
		//prompts user to enter the price of an item in an increment of 5 cents
		System.out.println("Enter price of item");
		System.out.println("(from 25 cents to a dollar, in 5-cent increments): ");
		//obtain next input and store in 'remainder'
		remainder = input.nextInt();
		
		//displays the entered amount back to the user, this line of code is here instead of with the rest of the printed strings below so that the correct 'remainder' amount is displayed
		System.out.println("You bought an item for " + remainder + " cents and gave me a dollar.");
		
		//subtracts the amount entered by the user from 100 in order to calculate their change, which is the new amount stored in remainder
		remainder = 100 - remainder;
		
		//divides the 'remainder' variable by 25 to calculate the amount of quarters received, the remainder of the division by 25 is the new 'remainder' variable
		quarters = remainder / 25;
		remainder = remainder % 25;
		
		//divides the 'remainder' variable by 10 to calculate the amount of dimes received, the remainder of the division by 10 is the new 'remainder' variable
		dimes = remainder / 10;
		remainder = remainder % 10;
		
		//divides the 'remainder' variable by 5 to calculate the amount of nickels received
		nickels = remainder / 5;
		
		//displays the amount of each coin received to the user
		System.out.println("So your change is ");
		System.out.println("" + quarters + " quarters");
		System.out.println("" + dimes + " dimes, and");
		System.out.println("" + nickels + " nickels");	

	}

}

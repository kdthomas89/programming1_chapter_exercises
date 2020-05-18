/*
 * The ServiceCharge program prompts the user to input the amount of a check they are wishing to cash. The program then runs the input through a multi-way if statement
 * to determine the service charge fee for cashing a check of that amount.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/14/17 at 8:03pm.
 */

import java.util.Scanner;

public class ServiceCharge {

	public static void main(String[] args) {
		
		//create new scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		double checkAmount, serviceCharge;
		
		//prompts the user to input a check amount
		System.out.println("Enter the check amount:");
		//obtain the check amount from the user and store in 'checkAmount'
		checkAmount = input.nextDouble();
		
		//multi-way if statement to determine the service charge amount based on the amount entered as the check amount, in ascending order from under 10 to over 1000
		if (checkAmount < 10) {
			serviceCharge = 1;
			System.out.println("The service charge for cashing a $" + checkAmount + " check is $" + serviceCharge);
		}
		else if (checkAmount >= 10 && checkAmount < 100) {
			serviceCharge = checkAmount * 0.1;
			System.out.println("The service charge for cashing a $" + checkAmount + " check is $" + serviceCharge);	
		}
		else if (checkAmount >= 100 && checkAmount < 1000) {
			serviceCharge = 5 + (checkAmount * 0.05);
			System.out.println("The service charge for cashing a $" + checkAmount + " check is $" + serviceCharge);	
		}
		else {
			serviceCharge = 40 + (checkAmount * 0.01);
			System.out.println("The service charge for cashing a $" + checkAmount + " check is $" + serviceCharge);	
		}

	}

}

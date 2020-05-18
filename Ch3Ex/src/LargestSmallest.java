/*
 * The LargestSmallest program prompts the user for the input of three integers. It then runs those three integers through a multi-way if statement to determine which of those
 * integers is the smallest in value, and then through a second multi-way if statement to determine which of the integers is the largest in value. It then outputs the results
 * to the user in the console
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/14/17 at 11:36pm.
 */

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		
		//create a new scanner
		Scanner input = new Scanner(System.in);
		//declare variables
		int num1, num2, num3;
		
		//prompts user for input of three integers
		System.out.println("Enter three integers:");
		
		//obtain next three integers from input and store in 'num1', 'num2' and 'num3'
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		//multi-way if statement to determine the smallest value of the three integers
		if (num1 < num2 && num1 < num3) {
			System.out.println("The smallest value is " + num1);
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.println("The smallest value is " + num2);
		}
		//in case the first 2 integers are of equal value
		else if (num1 == num2 && num1 < num3) {
			System.out.println("The smallest value is " + num1);
		}
		else {
			System.out.println("The smallest value is " + num3);
		}
		
		//multi-way if statement to determine the largest value of the three integers
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest value is " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest value is " + num2);
		}
		//in case the first 2 integers are of equal value
		else if (num1 == num2 && num1 > num3) {
			System.out.println("The largest value is " + num1);
		}
		else {
			System.out.println("The largest value is " + num3);
		}
		
	}

}

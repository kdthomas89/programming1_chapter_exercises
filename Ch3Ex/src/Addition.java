/*
 * The addition program randomly generates 3 numbers between 1 and 12 and then asks the user to add these 3 numbers together and then input the total to the console.
 * The program then uses an if-else statement to determine whether or not the user's guess was correct and tells the user if they were right or wrong.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/14/17 at 7:25 pm.
 */

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		//create a new scanner
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int num1, num2, num3, total;
		
		//generates three random numbers between 1-12 (1 and 12 being inclusive)
		num1 = (int)(Math.random() * 12 + 1);
		num2 = (int)(Math.random() * 12 + 1);
		num3 = (int)(Math.random() * 12 + 1);
		
		//outputs the addition problem to the user
		System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + "?");
		
		//obtain the total of the three numbers from the user and store in 'total'
		total = input.nextInt();
		
		//checks the user's answer against the sum of the three numbers, then outputs whether the user was correct or incorrect
		if (total == num1 + num2 + num3) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Sorry, that is incorrect.");
		}

	}

}

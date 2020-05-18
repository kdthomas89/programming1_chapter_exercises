/*
 * The NonnegativeInts Program prompts the user to input as many integers as they like, with a -1 at the end as a sentinel value. The program will iterate through the 
 * input using a while loop to calculate the sum of the integers, as well as how many numbers were input. It will then calculate the average of the given integers and output
 * both the sum and the average of the integers, with an error message displayed should the user only input -1.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/6/17 at 3:35am.
 */

import java.util.Scanner;
public class NonnegativeInts {

	public static void main(String[] args) {
		
		//create a new scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize variables
		int number, sum = 0, count = 0;
		double average;
		
		//prompt user for input
		System.out.println("Enter nonnegative integers and end with -1:");
		//receive input and store value in number variable
		number = input.nextInt();
		
		//while loop to iterate through input and calculate sum and increase the count value needed for the calculation of the average
		//sentinel value for the loop is -1
		while (number  != -1) {
			sum = sum + number;
			count++;
			number = input.nextInt();
		} 
		
		//calculate the average by dividing the sum of the input and divide it by the count of numbers that was entered
		//casting so division will calculate properly
		average = (double)sum / (double)count;	
		
		//if statement to display an error message if only -1 is entered, or the output of the sum and average otherwise
		if (number == -1 && sum == 0) {
			System.out.println("no numbers are entered except -1");
		}
			else {
				System.out.println("The total is " + sum);
				//printf used to display the average to two decimal places
				System.out.printf("The average is %.2f", average);
			} 
	}

}

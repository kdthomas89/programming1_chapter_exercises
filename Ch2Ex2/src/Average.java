/*
 * The Average program prompts the user for the input of 3 integers, and then calculates the sum and product
 * of those integers. 
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/8/17 at 3:53 am.
 */
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		//creates a new Scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		int numberOne, numberTwo, numberThree, sum, product;
		
		
		//prompt for first input
		System.out.println("Please enter the first number.");
		//obtain next input from user and store in 'numberOne'
		numberOne = input.nextInt();
		
		//prompt for second input
		System.out.println("Please enter the second number.");
		//obtain next input from user and store in 'numberTwo'
		numberTwo = input.nextInt();
		
		//prompt for third input
		System.out.println("Please enter the third number.");
		//obtain next input from user and store in 'numberThree'
		numberThree = input.nextInt();
		
		//calculate sum of 3 inputs
		sum = numberOne + numberTwo + numberThree;
		//display sum of 3 inputs
		System.out.println("The sum of your three numbers is: " + sum);
		//calculate product of 3 inputs
		product = numberOne * numberTwo * numberThree;
		//display product of 3 inputs
		System.out.println("The product of your three numbers is: " + product);
		
		
	}

}

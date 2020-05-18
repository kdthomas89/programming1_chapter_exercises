/*
 * The SecondSmallest program prompts the user to input 10 numbers. The program then populates 
 * an array with the inputs and calls the secondSmallestIndex method to iterate through the 
 * array and search for the index of the second smallest number in the array. The program 
 * then outputs that index value to the user.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 11/17/17 at 2:00 am.
 */

import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallest {

	
	public static void main(String[] args) {
		
		//create new Scanner instance
		Scanner input = new Scanner(System.in);
		//create new double array with size of 10
		double[] testArray = new double[10];
		
		//prompt user for input
		System.out.println("Enter ten numbers: ");
		
		//for loop that populates array with the doubles the user inputs
		for (int i = 0; i < testArray.length; i++) {
			
			testArray[i] = input.nextDouble();
			
		}
		
		//call secondSmallestIndex method and output the index of the second smallest number
		System.out.println("The index of the second smallest number value is " + secondSmallestIndex(testArray));
		

	}
	
	public static int secondSmallestIndex (double[] testArray) {
		//declare variables and initialize min and secondMin
		int index;
		double min = testArray[0];
		double secondMin = testArray[0];
		
		//for loop to iterate through array and check for the two smallest numbers 
		for (int i = 0; i < testArray.length; i++) {
			
			//if statement that assigns the lowest value in the array to the min variable
			if (testArray[i] < min) {
				
				min = testArray[i];
				
			}
		}
		
		for (int i = 0; i < testArray.length; i++) {
			//if statement that assigns the second lowest value in the array to the secondMin variable
			if (testArray[i] < secondMin && testArray[i] > min) {
				
				secondMin = testArray[i];
				
			}
		}
		
		//initialize index method by calling the binarySearch method from the Arrays class, searches the testArray for the secondMin value and sets the index as the value of "index"
		index = Arrays.binarySearch(testArray, secondMin);
		
		
		return index;
		
		
		
		
		
		
	}

}

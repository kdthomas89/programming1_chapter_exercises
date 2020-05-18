/*
 * The ListEquals program prompts the user to input a list of numbers. The program will take the first number and create an array the size of that value, then populate the array with the 
 * numbers input after that. The program then prompts the user to input a second set of numbers and creates a second array. Once both arrays are populated, the program will call the equals 
 * method, which sorts both arrays then checks to see if they are equal to each other. The program will then output whether or not the arrays are equal to the user. 
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 11/17/17 at 3:15 am.
 */

import java.util.Scanner;
import java.util.Arrays;
public class ListEquals {

	public static void main(String[] args) {
		
		//declare variables
		Scanner input = new Scanner(System.in);
		int size1, size2;
		
		//prompt user to input a list of numbers, the first number being the size of the first array
		System.out.println("Enter list1 (first number indicates the size of list1)");
		
		//get input from Scanner and store the first number entered in size1 variable
		size1 = input.nextInt();
		
		//create and initialize first array to be size of first number entered
		int list1[] = new int[size1];
		
		//populate list1 with numbers input after the first number
		for (int i = 0; i < list1.length; i++) {
			
			list1[i] = input.nextInt();
			
		}
		
		//prompt user to enter a list of numbers. the first number being the size of the second array
		System.out.println("Enter list2 (first number indicates size of list2)");
		
		//get input from Scanner and store the first number entered in size2 variable
		size2 = input.nextInt();
		
		//create and initialize second array to be size of the first number entered
		int list2[] = new int[size2];
		
		//populate list2 with numbers input after first number
		for (int i = 0; i < list2.length; i++) {
			
			list2[i] = input.nextInt();
			
		}
		
		//calls the equals method to check whether list1 = list2, and using an if-else statement to print the appropriate 
		if (equals(list1, list2) == true) {
			
			System.out.println("Two lists are identical");
			
		}
		else {
			
			System.out.println("Two lists are not identical");
			
		}

	}
	
	public static boolean equals(int[] list1, int[] list2) {
		
		//calls sort method in Arrays class to sort the two arrays
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		//calls the equals method from the Arrays class to check whether the two sorted arrays are equal to one another
		boolean equals = Arrays.equals(list1, list2);
		
		return equals;
		
	}

}

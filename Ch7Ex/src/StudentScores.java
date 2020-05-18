/*
 * The StudentScores program prompts the user to input the number of students and then enter the scores of the students. The program will then create an array that is the length of
 * the number of students to hold the scores. The program then uses 2 for loops, the first being to populate the array with the values of the score inputs, and the second to iterate
 * through the loop to find the highest and lowest values of the entered scores.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 11/13/17 at 3:15pm.
 */

import java.util.Scanner;
public class StudentScores {

	public static void main(String[] args) {
		
		//declare variables
		int students, max, min;
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter the number of students:");
		
		//next int value will be stored in students variable
		students = input.nextInt();
		
		//declare new array variable whose length is that of the value in the students variable
		int[] scores = new int[students];
		
		//prompt user for input, number of requested inputs will be the value of the students variable
		System.out.println("Enter " + students + " scores:");
		
		//loop that will populate scores array with values that were input
		for (int i = 0; i < students; i++) {
			
			scores[i] = input.nextInt();
			
		}
		
		//set the min and max default values to be the first value in the array
		max = scores[0];
		min = scores[0];
		
		//for loop to iterate through the array and find the highest and lowest value, and store those in the max and min variable
		for (int i = 0; i < scores.length; i++) {
			
			if (scores[i] > max) {
				
				max = scores[i];
				
			}
			if (scores[i] < min) {
				
				min = scores[i];
				
			}	
		}
		
		//output highest and lowest value
		System.out.println("Highest score is " + max);
		System.out.println("Lowest score is " + min);
		
		

	}

}

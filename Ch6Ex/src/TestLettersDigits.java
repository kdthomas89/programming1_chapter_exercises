/*
 * The TestLettersDigits program prompts the user to enter a string. The program then iterates through the string and counts the number of letters and digits in the string using a set of 
 * methods that implement for loops with nested if statements. The program then displays the number of letters and digits in the string to the user in the console.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/28/17 at 2:36am.
 */

import java.util.Scanner;
public class TestLettersDigits {

	public static void main(String[] args) {
		
		//declare s variable and scanner
		String s;
		Scanner input = new Scanner (System.in);
		
		//prompt user to input a string
		System.out.print("Enter a string: ");
		
		//read string and store value in s variable
		s = input.next();
		
		//call the countLetters and countDigits methods to count the number of letters and digits in the string and display the result to the user
		System.out.println("The number of letters is " + countLetters(s));
		System.out.println("The number of digits is " + countDigits(s));
		
		
	}
	
	//method to count the number of letters in the string
	public static int countLetters(String s) {
		
		//declare and initialize count variable
		int count = 0;
		//for loop with nested if statement to iterate through the string and count the number of letters, incrementing the value of the count variable if the character at the index is a letter
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isLetter(s.charAt(i))){
				count++;
			}
		}
		
		return count;
	}
	
	public static int countDigits(String s) {
		
		//declare and initialize count variable
		int count = 0;
		//for loop with nested if statement to iterate through the string and count the number of letters, incrementing the value of the count variable if the character at the index is a letter
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isDigit(s.charAt(i))){
				count++;
			}
		}
		
		return count;	
	}

}

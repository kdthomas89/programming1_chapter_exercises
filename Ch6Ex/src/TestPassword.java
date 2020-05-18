/*
 * The TestPassword program prompts the user to input a string, designated as their password. The main method then calls 4 other methods to check the password and designate it as valid or invalid.
 * The first method checks that the password has at least 8 characters. The second method checks that the password consists of only letters and digits. The third password checks that the password contains at least 2 digits.
 * The fourth and final method checks that the password contains at least one lowercase and one uppercase letter. All four methods are boolean methods. If all 4 conditions are met, the program will output a response that tells
 * the user that their password is either valid or invalid.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/30/17 at 2:34pm.
 */

import java.util.Scanner;
public class TestPassword {

	public static void main(String[] args) {
		
		//declare string variable and scanner
		String s;
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Please enter your password: ");
		
		//get input and store in s variable
		s = input.next();
		
		//calls the four methods and checks the password against them, and displays whether the password is valid or not to the user
		if (length(s) == true && lettersDigits(s) == true && twoDigits(s) == true && lowerUpper(s) == true) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	//boolean method with an if statement to check whether the string entered at least 8 characters, returns true if it is and false if it isn't
	public static boolean length(String s) {
		
		boolean isTrue = false;
		
		
		if (s.length() >= 8) {
			isTrue = true;
		}
		else {
			isTrue = false;
		}
		
		return isTrue;
	}
	
	
	//boolean method to check the string for special characters, returns true if there are no special characters and false if there are
	public static boolean lettersDigits(String s) {
		
		boolean isTrue = false;
		
		//for loop to iterate through the string
		for (int i = 0; i <= s.length() - 1; i++) {
			
			//if statement that checks to ensure that the character at the given index is a letter or digit
			if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}
		}
		
		return isTrue;
		
	}
	
	
	//boolean method that checks whether or not the string has at least 2 digits, returning true if it does and false if it does not
	public static boolean twoDigits(String s) {
		
		boolean isTrue = false;
		int count = 0;
		
		//for loop with a one way if statement and two way if-else statement that will iterate through the string and check whether each character is a digit, incrementing the count variable if the character is a digit
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
			
			//if there are 2 or more digits in the string, the method will return true, else it will return false
			if (count >= 2) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}
		}
		
		return isTrue;
		
		
	}
	
	//boolean method that checks whether or not the string has at least one uppercase letter and one lowercase letter, returning true if both requirements are met, or false otherwise
	public static boolean lowerUpper(String s) {
		
		boolean isTrue = false;
		//countU increments for every uppercase letter, countL increments for each lowercase letter
		int countU = 0;
		int countL = 0;
		
		//for loop to iterate through the string and count the number of uppercase and lowercase letters, incrementing the appropriate count variable for each
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				countU++;
			}
			else if (Character.isLowerCase(s.charAt(i))) {
				countL++;
			}
			
			//sets the variable to true if at least one uppercase and lowercase letter is present within the string
			if (countU >= 1 && countL >= 1) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}
		}
		
		return isTrue;
	}

}

/*
 * The VowelsConsonantsReverse program prompts the user to input a string. The program then runs the string through two different for loops. The first loop uses a nested if 
 * statement to determine and count the number of vowels and consonants in the input. The second loop iterates through the string backwards and outputs the string in reverse.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/6/17 at 11:03pm.
 */

import java.util.Scanner;
public class VowelsConsonantsReverse {

	public static void main(String[] args) {
		
		//create new scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize variables
		String string;
		int vowels = 0, consonants = 0;
		
		//prompt user for input, store value in string variable
		System.out.println("Enter a string:");
		string = input.nextLine();
		
		//for loop to iterate through the string
		for (int i = 0; i < string.length(); i++) {
			
			//return char at 'i' index and store in c variable
			char c = string.charAt(i);
			
			//if statement to determine whether the char 'c' at index 'i' is a vowel or consonant and increment the appropriate variable
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
				vowels++;
			}
			else if (Character.isLetter(c)){
				consonants++;
			}
		}
		
		//output number of vowels or consonants to user
		System.out.println("Number of vowels is " + vowels);
		System.out.println("Number of consonants is " + consonants);

	
		
		System.out.print("The reversed string is ");
		//for loop to iterate through the string backwards and output the string in reverse order
		for (int i = string.length() - 1; i >=0; i--) {
			System.out.print(string.charAt(i));
		}
		
	}

}

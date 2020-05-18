/*
 * The ISBN program asks the user the input the first 9 digits of an ISBN number. This is input as a string. The program then gets the numeric values of each character in that
 * string of numbers and uses those values in a checksum calculation to determine whether the value of the checksum will be an X or not. Finally, the program will display the
 * full 10 digit ISBN to the user.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated at 9/29 at 11:31pm.
 */


import java.util.Scanner;
public class ISBN {

	public static void main(String[] args) {
		
		//create new scanner
		Scanner input = new Scanner(System.in);
		//declare variables
		String isbn;
		int checksum;
		char d10;
		
		//prompt input from user and storing value in isbn variable
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		isbn = input.next();
		
		//getting the numeric value of each character in the 9 digit string that was input
		int d1 = Character.getNumericValue(isbn.charAt(0));
		int d2 = Character.getNumericValue(isbn.charAt(1));
		int d3 = Character.getNumericValue(isbn.charAt(2));
		int d4 = Character.getNumericValue(isbn.charAt(3));
		int d5 = Character.getNumericValue(isbn.charAt(4));
		int d6 = Character.getNumericValue(isbn.charAt(5));
		int d7 = Character.getNumericValue(isbn.charAt(6));
		int d8 = Character.getNumericValue(isbn.charAt(7));
		int d9 = Character.getNumericValue(isbn.charAt(8));
		
		//perform checksum calculation
		checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		//if statement to determine value of d10
		if (checksum == 10) {
			d10 = 'X';
		}
		else {
			d10 = '0';
		}
		//output final 10 digit isbn to user
		System.out.println("The ISBN-10 number is " + isbn + d10);
	}

}

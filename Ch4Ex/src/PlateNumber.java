/*
 * The PlateNumber program generates 6 random numbers, then converts 2 of those random numbers into characters. The program then orders those random numbers and characters into
 * a specific order to represent a Tennessee license plate and outputs that plate number to the user.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/29/17 at 2:24am.
 */
public class PlateNumber {

	public static void main(String[] args) {
		
		//declare variables
		char char1, char2;
		int num1, num2, num3, num4, numChar1, numChar2;
		
		//generate random numbers between 0 and 9
		num1 = (int)(Math.random() * 10);
		num2 = (int)(Math.random() * 10);
		num3 = (int)(Math.random() * 10);
		num4 = (int)(Math.random() * 10);
		
		//generate random numbers that will represent a character
		numChar1 = (int)(Math.random() * 26) + 65;
		numChar2 = (int)(Math.random() * 26) + 65;
		
		//convert 2 random numbers to characters
		char1 = (char) numChar1;
		char2 = (char) numChar2;
		
		System.out.println("A random vehicle plate number: " + char1 + num1 + num2 + "-" + num3 + num4 + char2);
		

	}

}

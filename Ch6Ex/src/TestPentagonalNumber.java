/*
 * The TestPentagonalNumber program displays the first 50 pentagonal numbers in a table with 5 numbers on each line. The main method of the program implements a for loop 
 * that iterates through 1 - 50. The getPentagonalNumber method is called within this for loop for each iteration to calculate the first 50 pentagonal numbers.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/27/17 at 11:49pm.
 */
public class TestPentagonalNumber {

	public static void main(String[] args) {
		//for loop that iterates through numbers 1 - 50 and for each number, calls the formula in the getPentagonalNumber method and assigns the value of the current number 
		//to the variable in the formula. The program then performs the calculation and stores the value of the solution in the num variable. Finally, the program implements
		//a printf function to display the values of num in a table with 5 numbers per row, using an if function to move to the next line if the number % 5 = 0.
		for (int i = 1; i <= 50; i++) {
			
			//calls the getPentagonalNumber method using the variable i, stores the value in num variable
			int num = getPentagonalNumber(i);
			
			//printf function to display the values of num in a table
			System.out.printf("%10d", num);
			
			//if function to move to the next line if the value of i % 5 = 0
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	//method that calculates pentagonal numbers
	public static int getPentagonalNumber(int n) {
		
		//returns the result of this pentagonal number formula
		return n * ((3 * n) - 1) / 2;
	}
}

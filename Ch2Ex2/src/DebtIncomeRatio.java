/*
 * The DebtIncomeRatio program prompts the user for 4 inputs: their monthly gross income, monthly rent,
 * monthly credit card payments, and a sum of their other monthly expenses. After receiving those 4 inputs from the
 * user, the program calculates the debt to income ratio of the user and displays the result in decimal form.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/8/17 at 5:47 am.
 */
import java.util.Scanner;

public class DebtIncomeRatio {

	public static void main(String[] args) {
	
		//create a new scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		double monthlyGross, monthlyRent, monthlyCC, monthlyOther, ratio;
		
		
		
		System.out.println("Debt to Income Ratio Calculator");
		System.out.println("====================================");
		//prompts user to enter first variable
		System.out.println("Enter monthly gross income after tax:");
		//obtain next input and store in 'monthlyGross'
		monthlyGross = input.nextDouble();
		//prompts user to enter second variable
		System.out.println("Enter monthly rent:");
		//obtain next input and store in 'monthlyRent'
		monthlyRent = input.nextDouble();
		//prompts user to enter third variable
		System.out.println("Enter monthly credit card payments:");
		//obtain next input and store in 'monthlyCC'
		monthlyCC = input.nextDouble();
		//prompts user to enter fourth variable
		System.out.println("Enter other montly payments:");
		//obtain next input and store in 'monthlyOther'
		monthlyOther = input.nextDouble();
		
		//adds the three debts together and divides them by the income, then stores the result in 'ratio'
		ratio = (monthlyRent + monthlyCC + monthlyOther) / monthlyGross;
		System.out.println("====================================");
		//displays the calculated debt to income ratio to the user
		System.out.println("Your debt to monthly income ratio is: " + ratio);

	}

}

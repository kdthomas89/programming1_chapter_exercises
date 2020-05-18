/*
 * The Payroll program prompts the user to input a name, number of hours worked, hourly pay rate, federal tax rate, and state tax rate. It then calculates the amount of 
 * federal and state taxes that person will pay, in addition to their net pay once those taxes have been subtracted from their gross pay. The program will then display this 
 * information to the user in the console. The program implements the printf statements to display the output.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/29/17 at 12.57am.
 */

import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		
		//creates new scanner
		Scanner input = new Scanner(System.in);
		
		//declare variables
		String name;
		int comma;
		double hoursWorked, payRate, federalTax, stateTax, grossPay, federalWithholding, stateWithholding, totalDeduction, netPay;
		
		//prompt user to input information, storing values in appropriate variables
		System.out.println("Enter employee's name (lastname,firstname):");
		name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week: ");
		hoursWorked = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		federalTax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		stateTax = input.nextDouble();
		
		//initialize comma variable to distinguish between the last name and first name that was entered by using indexOf to store the location of the comma in order to split the names later
		comma = (name.indexOf(","));
		//initialize remaining variables
		grossPay = hoursWorked * payRate;
		federalWithholding = grossPay * federalTax;
		stateWithholding = grossPay * stateTax;
		totalDeduction = federalWithholding + stateWithholding;
		netPay = grossPay - totalDeduction;
		//convert the decimal inputs into percentages
		federalTax = federalTax * 100;
		stateTax = stateTax * 100;
		
		//printf methods to display output
		//use substring to split the first and last names of name variable
		System.out.printf("Employee Name: " + name.substring(comma + 1) + " " + name.substring(0, comma));
		//%.1f to display hoursWorked to 1 decimal place, \n to display on new line
		System.out.printf("\nHours Worked: %.1f \n", hoursWorked);
		System.out.printf("Pay Rate: $%.1f \n", payRate);
		System.out.printf("Gross Pay: $%.1f \n", grossPay);
		System.out.printf("Deductions: \n");
		System.out.printf("  Federal Withholding (%.1f%%): $%.1f \n", federalTax, federalWithholding); 
		System.out.printf("  State Withholding (%.1f%%): $%.1f \n", stateTax, stateWithholding);
		System.out.printf("  Total Deduction: $%.1f \n", totalDeduction);
		System.out.printf("Net Pay: $%.1f", netPay);
	}
}

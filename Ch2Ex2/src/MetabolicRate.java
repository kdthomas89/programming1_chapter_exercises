/*
 * The MetabolicRate program prompts the user for 3 inputs, their weight, height, and age. The program then calculates the basal metabolic rates
 * for both males and females with the given inputs.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/10/17 at 2:38pm
 */
import java.util.Scanner;

public class MetabolicRate {

	public static void main(String[] args) {
		
		//creates a new scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		double weight, height, age, maleRate, femaleRate;
		
		
		//prompts the user to input first variable
		System.out.println("Enter Weight (lbs): ");
		//obtain next input and store in 'weight'
		weight = input.nextDouble();
		//prompts the user to input the second variable
		System.out.println("Enter Height (inches): ");
		//obtain next input and store in 'height'
		height = input.nextDouble();
		//prompts the user to input the third variable
		System.out.println("Enter Age (years): ");
		//obtain next input and store in 'age'
		age = input.nextDouble();
		
		//calculates the metabolic rate for males with the given inputs and stores in 'maleRate'
		femaleRate = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		//calculates the metabolic rate for females with the given inputs and stores in 'femaleRate'
		maleRate = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		//prints the calculated metabolic rates for both males and females on separate lines 
		System.out.println("Female basal metabolic rate: " + femaleRate);
		System.out.println("Male basal metabolic rate: " + maleRate);
		

	}

}

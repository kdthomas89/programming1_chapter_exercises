/*
 * The RockPaperScissors program generates a random number between 0 and 2 that corresponds to either rock, paper, or scissors for the computer. The program then prompts the user 
 * for an input of an integer between 0 and 2, which will also correspond to either rock, paper, or scissors. The program then takes both the user's choice and the computer's
 * choice and runs them through a series of nested multi-way if statements based on the choice of the computer to calculate who the winner of the rock, paper, scissors match is. 
 * It then outputs the results of the game to the user.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/20/17 at 1:17am.
 */

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		//create a new scanner
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int scissors, rock, paper, userChoice, computerChoice;
		//initialize variables to correspond to numbers that the computer and user will choose
		scissors = 0;
		rock = 1;
		paper = 2;
		//generates a random number for the computer's choice between 0 and 2
		computerChoice = (int)(Math.random() * 3);
		
		//prompts the user to choose scissors, rock, or paper by inputting the corresponding number
		System.out.println("scissors (0), rock (1), paper (2):");
		//obtain choice of user and store in 'userChoice'
		userChoice = input.nextInt();
		
		
		//nested multiway if statement based upon the choice of the computer, the first being if the computer's choice is rock
		if (computerChoice == rock) {
			
			if (userChoice == rock) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
			}
			else if (userChoice == scissors) {
				
				System.out.println("The computer is rock. You are scissors. You lost");
			}
			else if (userChoice == paper) {
				System.out.println("The computer is rock. You are paper. You won");
			}
		}
		
		//for when the computer chooses scissors
		else if (computerChoice == scissors) {
			
			if (userChoice == rock) {
				System.out.println("The computer is scissors. You are rock. You won");
			}
			else if (userChoice == scissors) {
				System.out.println("The computer is scissors. You are scissors too. It is a draw");
			}
			else if (userChoice == paper) {
				System.out.println("The computer is scissors. You are paper. You lost");
			}
		}
		
		//for when the computer chooses paper
		else if (computerChoice == paper) {
			
			if (userChoice == rock) {
				System.out.println("The computer is paper. You are rock. You lost");
			}
			else if (userChoice == scissors) {
				System.out.println("The computer is paper. You are scissors. You won");
			}
			else if (userChoice == paper) {
				System.out.println("The computer is paper. You are paper too. It is a draw");
			}
		}
		
	}

}

package unit2;

import java.util.Scanner; 
/**
Description: A program which asks for a password using do while or while statements. <br>
Date: Mon, Nov 25, 2024
@author Erik Porteu
 */

public class LoopChallenge1 {

	public static void main(String[] args) {
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */

		// this block is just variable declarations
		String pass = "12345";
		String userInput = "";
		int tries = 3;
		boolean passActive = true;

		// This block prompts the user for an input using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the password?: (tries left: " + tries + ")");

		// This block runs the loop if the userInput is not equal to pass' value, and if passActive is not false.
		while (!(userInput.equals(pass)) && !(passActive == false)) {
			userInput = sc.next();

			// this block ends the loop if the userInput is equal to the password
			if (userInput.equals(pass)) {
				System.out.println("Welcome in.");

				// this block subtracts one from tries every time the user does not input the password
				// this block also stops printing the text "thats wrong. Try again" if the amount of tries are less than or equal to 1.
			} else {
				tries = tries - 1;
				if (tries >= 1) {
					System.out.println("thats wrong. Try again (tries left: " + tries + ")");
				}
			}

			// This block stops the loop by setting passActive to false
			if (tries == 0) {
				System.out.println("You're done.");
				passActive = false;
			}
		}

		sc.close();

	}
}
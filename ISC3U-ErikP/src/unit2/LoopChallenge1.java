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
		String pass = "12345";
		String userInput = "";
		int tries = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the password?:");
		
		
		while (!userInput.equals(pass)) {
			userInput = sc.next();
			if (userInput.equals(pass)) {
				System.out.println("Welcome in.");
			} else {
				System.out.println("thats wrong. Try again");
				tries = tries - 1;
				
			}
			
		}
		
		sc.close();
		
	}
}
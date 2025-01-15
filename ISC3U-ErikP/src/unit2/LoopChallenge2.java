package unit2;

import java.util.Scanner;

/**
 Description: A program that only takes the square root of a number if the number is positive. <br>
 Date: Tues, Nov 26, 2024
 @author Erik Porteu
 */

public class LoopChallenge2 {
	public static void main(String[] args) {

		double num;

		Scanner sc = new Scanner (System.in);
		
		// this block prompts the user to input a positive number
		do {
			System.out.println("Please enter a positive number");
			num =  sc.nextDouble();
			
			// this block makes it so that if the number is not positive, then the loop resets
			if (num < 0){
				System.out.println("That number isn't positive, try again.\n");
			}
			
			// This block makes it so that if the number is positve, then it will print out its square root
		} while (num < 0);
		System.out.println("Your number square rooted is " + Math.sqrt(num));

		sc.close();

		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1
		 */
	}
}
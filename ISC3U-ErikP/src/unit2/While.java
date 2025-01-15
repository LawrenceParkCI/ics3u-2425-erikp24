package unit2;
/**
Description: A program that explores the properties of while statements </br>
Date: Mon, Nov 25, 2024
@author Erik Porteu
 */

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("How many people are you planning to see?");
//
//		//Why do you think I coded it this way?
//		int numPeople = Integer.parseInt(in.nextLine());
//
//		while (numPeople > 0) {
//			System.out.print("What is this person's name? ");
//
//			//Why do you think the variable is declared here?
//			String name = in.nextLine();
//			System.out.println("Welcome, " + name + "!");
//
//			numPeople = numPeople - 1;
//		}



		//Run the code Using the debugger. 
		//Explain the code in your own words

		//What code is repeated?
		//When does it decide whether to repeat or not?
		//What is the condition for repeating?


		//What is the difference between a while loop and a do-while loop?


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
		
		String word;
		int count = 20;
		
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		
		while (count >=1) {
			count = count -1;
			System.out.println(word);
		}
		
		in.close();
	}
}
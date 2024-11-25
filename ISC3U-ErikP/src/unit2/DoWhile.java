package unit2;

/**
Description: A program which explores the property of do while statements. <br>
Date: Mon, Nov 25, 2024
@author Erik Porteu
 */

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		//Run the code. Explain the code in your own words

		//What code is repeated?
		//A: System.out.println("What is your name?");

		//When does it decide whether to repeat or not?
		// A: if the user input is "Mr. Lee".

		//What is the condition for repeating?
		// A: if the user input is anything but "Mr. Lee"

		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times
		int count = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a word:");
		String word;
		word = sc.nextLine();
		sc.close();

		do {
			System.out.println(word);
			count = count + 1;
		} while (count <= 20);
	}
}
package unit2;

import java.util.Scanner;

/**
 * Description: A program which creates a test, using conditional statements in java. <br>
 * Date: Thurs, Nov 14, 2024
 * @author Erik Porteu
 */

public class IfChallenge3 {
	public static void main(String[] args) {

		final int questionsAmnt = 4;

		// This block declares the variables
		String yesOrNo;
		int score = 0;
		int ques1;
		int ques2;
		String ques3;
		String ques4a;
		String ques4b;
		String ques4c;
		int ques5;
		int ques6;

		Scanner sc = new Scanner(System.in);

		// This block gains a user-inputted character to determine the rest of the output of the code.
		System.out.print("Are you ready for a quiz? (Y or N): ");
		yesOrNo = sc.next();

		if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {

			System.out.println("\nGreat!\n");

			System.out.format("%35s","Welcome to..\n");
			System.out.format("%90s","(\\(\\(\\ Erik's quiz of unnecessary information /)/)/)\n\n");

			// This block prompts the user to answer the first question
			System.out.println("What is the most sold game of all time?");
			System.out.println("1) Fortnite");
			System.out.println("2) Minecraft");
			System.out.println("3) Tetris\n");
			System.out.print("Ans > ");
			ques1 = sc.nextInt();

			// If the user answers correctly, 1 int will be added to the variable "score", and a string is printed
			// If not, then the nothing is added to score, and a different string is printed
			if (ques1 == 2) {
				score = score + 1;
				System.out.println("\nGood job, smartypants.\n");
			} else if (ques1 == 1 && ques1 == 3) {
				System.out.println("\n*Incorrect buzzer noise*\n");
			} else {
				System.out.println("\nWhat kind of answer is that?!?\n");
			}

			// This block prompts the user to answer the second question
			System.out.println("What is the city with the most population?");
			System.out.println("1) New York");
			System.out.println("2) Tokyo");
			System.out.println("3) New Dehli\n");
			System.out.print("Ans > ");
			ques2 = sc.nextInt();

			// If the user answers correctly, another int will be added to the variable "score", and a string is printed
			// If not, then the nothing is added to score, and a different string is printed
			if (ques2 == 2) {
				score = score + 1;
				System.out.println("\nNot too shabby.\n");
			} else if (ques2 >= 1 && ques2 < 2 && ques2 > 2 && ques2 <= 3) {
				System.out.println("\nYou're pretty smart.. For a Monkey!\n");
			} else {
				System.out.println("\nI think you're doing the wrong test...\n");
			}

			// This block prompts the user to answer the third question
			System.out.println("What fruit is the juiciest");
			System.out.println("a) Juicyfruit");
			System.out.println("b) Banana");
			System.out.println("c) Apple\n");
			System.out.print("Ans > ");
			ques3 = sc.next();

			// If the user answers correctly, a third int will be added to the variable "score", and a string is printed
			// If not, then the nothing is added to score, and a different string is printed
			if (ques3.equalsIgnoreCase("A")) {
				score = score + 1;
				System.out.println("\nWowzers.\n");
			} else if (ques3.equalsIgnoreCase("B") || ques3.equalsIgnoreCase("C")) {
				System.out.println("\nThat's not even a bad answer... It's a terrible one.\n");
			} else {
				System.out.println("\nThat's not even close to the right answer, weirdo.\n");
			}

			// This block prompts the user to answer the fourth question
			System.out.println("What responsabilites does the municipal government account for? (Select 3 that apply)");
			System.out.println("a) Garbage & recycling");
			System.out.println("b) Highways");
			System.out.println("c) Libraries");
			System.out.println("d) Green space");
			System.out.println("e) Immigration & Border security\n");
			System.out.print("Ans 1 > ");
			ques4a = sc.next();
			System.out.print("Ans 2 > ");
			ques4b = sc.next();
			System.out.print("Ans 3 > ");
			ques4c = sc.next();
			
			// If the user answers correctly, a fourth int will be added to the variable "score", and a string is printed
			// If not, then the nothing is added to score, and a different string is printed
			if ((ques4a.equalsIgnoreCase("A") || ques4a.equalsIgnoreCase("C") || ques4a.equalsIgnoreCase("D")) && (ques4b.equalsIgnoreCase("A") || ques4b.equalsIgnoreCase("C") || ques4b.equalsIgnoreCase("D")) && (ques4c.equalsIgnoreCase("A") || ques4c.equalsIgnoreCase("C") || ques4c.equalsIgnoreCase("D"))) {
				score = score + 1;
				System.out.println("\nNice one, I guess.\n");
			} else {
				System.out.println("\nLooks like someone needs to learn about municipal powers and capabilities!\n");
			}

			System.out.println("Your test score is " + score + "/" + questionsAmnt);

			sc.close();

			// This block prints a line if the user chooses not to do the test
		} else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
			System.out.println("Well, then why are you here?");

			// This block prints a line if the user types any other string other than (Y,N,y,n,Yes,No,yes,no,etc.)
		} else {
			System.out.println("That's not an option and you know it!");

		}


		//This is for the portfolio

		/*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
		 */
	}
}
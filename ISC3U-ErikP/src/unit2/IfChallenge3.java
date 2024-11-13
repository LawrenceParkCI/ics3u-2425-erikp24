package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author
 */

public class IfChallenge3 {
	public static void main(String[] args) {

		final int QuestionsAmnt = 3;
		
		// This block just declares my variables
		String yesOrNo;
		int correct;
		int ques1;
		int ques2;
		String ques3;

		Scanner sc = new Scanner(System.in);
		
		// This block gains a user-inputted character to determine the rest of the output of the code.
		System.out.print("Are you ready for a quiz? (Y or N): ");
		yesOrNo = sc.next();
		
		if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {
			
			System.out.println("Great!\n");
			
			System.out.println("What is the most popular game of all time?");
			System.out.println("1) Fortnite");
			System.out.println("2) Rock paper scissors");
			System.out.println("3) Minecraft");
			ques1 = sc.nextInt();
			
			if (ques1 == 3) {
				correct = 1;
				System.out.println("Good job, smartypants.\n");
			} else if (ques1 >= 1 && ques1 <= 2) {
				System.out.println("*Incorrect buzzer noise*\n");
			} else {
				System.out.println("What kind of answer is that?!?\n");
			}
			
			System.out.println("What is the city with the most population?");
			System.out.println("1) New York");
			System.out.println("2) Tokyo");
			System.out.println("3) New Dehli");
			ques2 = sc.nextInt();
			
			if (ques2 == 2) {
				correct = 2;
				System.out.println("Not too shabby.\n");
			} else if (ques2 >= 1 && ques2 < 2 && ques2 > 2 && ques2 <= 3) {
				System.out.println("You're pretty smart.. For a Monkey!\n");
			} else {
				System.out.println("I think you're doing the wrong test...\n");
			}
			
			System.out.println("What fruit is the juiciest");
			System.out.println("a) Juicyfruit");
			System.out.println("b) Banana");
			System.out.println("c) Apple");
			ques3 = sc.next();
			
			if (ques3.equalsIgnoreCase("A")) {
				correct = 3;
				System.out.println("Wowzers.\n");
			} else if (ques2 >= 1 && ques2 < 2 && ques2 > 2 && ques2 <= 3) {
				System.out.println("I bet you like drinking warm milk!\n");
			} else {
				System.out.println("That's not even close to the right answer, weirdo.\n");
			}
			
			sc.close();
			
		} else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
			System.out.println("Well then why are you here?");
			
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
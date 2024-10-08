package unit1;

import java.util.Scanner;

public class StringManipulation {
/**
 * Date: Tues, Oct 8, 2024<br>
 * Description: A program which modifies a user inputted string based off of the requested prompts.
 * @author Erik Porteu
 * @param args
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//this code declares the variable
		String userSentence;

		//this code prints out the prompt
		System.out.println("Please type a sentence and hit <Enter>:");

		//this code stores the user input in the userSentence variable
		userSentence = sc.nextLine();

		System.out.println(userSentence);

		System.out.println(userSentence.toUpperCase());

		System.out.println(userSentence.toLowerCase());

		System.out.println(userSentence.length());

		System.out.println(userSentence.charAt(3));

		String userSentenceWords = userSentence.trim();
		int pos1 = userSentence.indexOf(' ');
		int pos2 = userSentence.lastIndexOf(' ');
		String firstWord = userSentenceWords.substring(0,pos1);
		String lastWord = userSentenceWords.substring(pos2+1);
		System.out.println("The first word is " + firstWord + "\nThe last word is " + lastWord);

		sc.close();

	}

}

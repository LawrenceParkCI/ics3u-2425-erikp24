package Culminating;

import java.util.Scanner;

public class ErikPorteuCulminatingProject {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);

		// This code declares variables
		String mainScreenIn;
		String ruleScreenIn;
		String difficultyChoice;


		// This code prints the title of the game and decals
		System.out.println("Welcome to...");
		System.out.println("\nHangman: The video-game");
		System.out.println("\n  +---+\r\n"
				+ "  |   |\r\n"
				+ "  O   |\r\n"
				+ " /|\\  |\r\n"
				+ " / \\  |\r\n"
				+ "      |\r\n"
				+ "=========");

		System.out.println("\n1. Start game\n2. Rules\n3. Quit");
		System.out.print("\nInput: ");
		mainScreenIn = sc.next();

		// This block of code runs the start of the game, where the user can choose its difficulty
		if (mainScreenIn.equals("1") || mainScreenIn.equals("1.") || mainScreenIn.equalsIgnoreCase("Start")) {
			System.out.println("\nWould you like to play in:");
			
			// This code gets input from the user to choose the difficulty of the game
			System.out.println("\n1. Easy\n2. Medium\n3. Hard\n4. Overkill (No vowels)");
			System.out.print("\nInput: ");
			difficultyChoice = sc.next();
			
			if (difficultyChoice.equals("1") || difficultyChoice.equalsIgnoreCase("1.") || difficultyChoice.equalsIgnoreCase("Easy")) {
				String[] easyWords = {"eye", "sail", "fun", "easy", "sleep", ""};
				
			} else if (difficultyChoice.equals("2") || difficultyChoice.equalsIgnoreCase("2.") || difficultyChoice.equalsIgnoreCase("Medium")) {
				String[] mediumWords = {};
				
			} else if (difficultyChoice.equals("3") || difficultyChoice.equalsIgnoreCase("3.") || difficultyChoice.equalsIgnoreCase("Hard")) {
				String[] hardWords = {};
				
			} else if (difficultyChoice.equals("4") || difficultyChoice.equalsIgnoreCase("4.") || difficultyChoice.equalsIgnoreCase("Overkill")) {
				String[] overkillWords = {};
				
			}

			// This block of code prints the rules of hangman
		} else if (mainScreenIn.equals("2") || mainScreenIn.equals("2.") || mainScreenIn.equalsIgnoreCase("Rules")) {
			System.out.println("\nRules:\n-Blah\n-Blah\n-Blah");

			// This block of code gets input from the user for whether they want to quit the progam, or return to the main screen
			System.out.println("\n1. Return to main screen\n2. Quit");
			System.out.print("\nInput: ");
			ruleScreenIn = sc.next();

			// This block of code runs if the user chooses 1, in rule screen
			if (ruleScreenIn.equals("1") || ruleScreenIn.equals("1.") || ruleScreenIn.equalsIgnoreCase("Return") || ruleScreenIn.equalsIgnoreCase("Return to main screen")) {

				// This block of code runs if the user chooses 2, in rule screen
			} else if (ruleScreenIn.equals("2") || ruleScreenIn.equals("2.") || ruleScreenIn.equalsIgnoreCase("Quit")) {
				System.exit(0);

				// This block of code runs if the user inputs anything else, in rule screen
			} else {
				System.out.println("Entered input not valid. Sending user back to main screen.");
			}

			// This block of code runs if if the user chooses 3, in main screen, to terminate the program
		} else if (mainScreenIn.equals("3") || mainScreenIn.equals("3.") || mainScreenIn.equalsIgnoreCase("Quit")) {
			System.exit(0);

			// This block of code runs if if the user inputs anything else in main screen
		} else {
			System.out.println("Entered input not valid. Sending user back to main screen.");
		}

		sc.close();
	}

	public static String wordFetcher (String words[]) {
		return null;

	}

	public static int underscorePrinter (String word) {
		return 0;

	}

	public static char charPrinter (String word) {
		return 0;

	}

}

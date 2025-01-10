package Culminating;

import java.util.Arrays;
import java.util.Scanner;

public class ErikPorteuCulminatingProject {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);

		// This code declares variables
		String mainScreenIn;
		String ruleScreenIn;
		String difficultyChoice;
		boolean gameStarted = true;


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
			

			// the input above is sent to a method which chooses a specific array based off of difficulty, then sends the array to another method that selects one word randomly
			String[] arrayDifficulty = chooseArrayDifficulty(difficultyChoice);
			String wordForGame = wordFetcher(arrayDifficulty);
			
			int wrongGuesses = 0;
			char letterGuessed;
			String hangmanPic = wrongGuessDispay(wrongGuesses);
			System.out.println(hangmanPic);
			
			char[] guessedWord = new char[wordForGame.length()];
			
			for (int i = 0; i < wordForGame.length(); i++) {
				guessedWord[i] = '.';
			}
			
			while (gameStarted == true) {
				
				// This code prints the number of blank spaces of the word, based off of its index
				System.out.println("\nYour word to guess is:\n");
				for (int i = 0; i < wordForGame.length(); i++ ) {
					System.out.print(guessedWord[i]);
				}
				
				// This code is the scanner input for a character
				System.out.print("\n\nInput: ");
				letterGuessed = sc.next().toLowerCase().charAt(0);
				
				// This code checks to see if the character that the user inputted is in the string
				if (wordForGame.contains(String.valueOf(letterGuessed))) {
					for (int i = 0; i < wordForGame.length(); i++) {
						if (wordForGame.charAt(i) == letterGuessed) {
							guessedWord[i] = letterGuessed;
						}
					}
				}
				boolean wordCompleted = isWordCompleted(guessedWord);
				
				// this code checks to see if the 
				
				
//				String hangmanPic = wrongGuessDispay(wrongGuesses);
//				System.out.println(hangmanPic);
				
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

	/**
	 * @param String difficultyChoice: a String that was inputted by a user to select difficulty
	 * @return arrayChoice: an array that was selected based off of difficultyChoice
	 */
	public static String [] chooseArrayDifficulty (String difficultyChoice) {
		// These are all the possible arrays
		String[] easyWords = {"eye", "sail", "fun", "easy", "sleep"};
		String[] mediumWords = {"halt", "return", ""};
		String[] hardWords = {"fortuitous", "supercalifragilisticexpialidocious", "opportunistic", "dynamite", "malfeasances"};
		String[] overkillWords = {"crypt", "myths", "flyby", "myrrh"};
		String[] arrayChoice = null;

		// This code chooses one of the arrays above for word selection, based on the user input.
		if (difficultyChoice.equals("1") || difficultyChoice.equalsIgnoreCase("1.") || difficultyChoice.equalsIgnoreCase("Easy")) {
			arrayChoice = easyWords;

		} else if (difficultyChoice.equals("2") || difficultyChoice.equalsIgnoreCase("2.") || difficultyChoice.equalsIgnoreCase("Medium")) {
			arrayChoice = mediumWords;

		} else if (difficultyChoice.equals("3") || difficultyChoice.equalsIgnoreCase("3.") || difficultyChoice.equalsIgnoreCase("Hard")) {
			arrayChoice = hardWords;

		} else if (difficultyChoice.equals("4") || difficultyChoice.equalsIgnoreCase("4.") || difficultyChoice.equalsIgnoreCase("Overkill")) {
			arrayChoice = overkillWords;
		}

		return arrayChoice;


	}

	public static String wordFetcher (String words[]) {
		int random = 0;
		for (int i = 0; i < words.length; i++) {
			random = (int) (Math.random() * i);
		}
		String word = words[random];

		return word;

	}

	public static boolean isWordCompleted (char[] guessedWord) {
		char c = '.';
		return true;

	}

	public static String wrongGuessDispay(int wrongGuesses) {
		int count = wrongGuesses;
		String hangmanPic = null;

		if (count == 0) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 1) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 2) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 3) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 4) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 5) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " /    |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (count == 6) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " / \\  |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		}
		
		return hangmanPic;

	}

}

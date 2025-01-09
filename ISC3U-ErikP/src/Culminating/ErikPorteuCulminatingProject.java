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

			// the input above is sent to a method which chooses a specific array based off of difficulty, then sends the array to another method that selects one word randomly
			String[] arrayDifficulty = chooseArrayDifficulty(difficultyChoice);
			String wordForGame = wordFetcher(arrayDifficulty);
			
			// This code prints the number of blank spaces of the word, based off of its index
			System.out.println("\n" + wordForGame + "\n");
			for (int i = 0; i < wordForGame.length(); i++) {
				System.out.print('.');
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
		String[] hardWords = {"fortuitous"};
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

	public static char charPrinter (String word) {
		return 0;

	}

	public static String wrongGuessDispay() {
		int wrongGuesses = 0;
		String hangmanPic = null;

		if (wrongGuesses == 0) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 1) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 2) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 3) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 4) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 5) {
			hangmanPic = "  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " /    |\r\n"
					+ "      |\r\n"
					+ "=========";
			
		} else if (wrongGuesses == 6) {
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

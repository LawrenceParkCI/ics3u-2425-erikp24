package Culminating;

/**
 * Date: Monday, Jan 13, 2025 <br>
 * Description: A program which runs a game of hangman in Java
 * @author Erik Porteu
 */

import hsa_new.Console;

import java.awt.Color;
import java.util.Scanner;


public class ErikPorteuCulminatingProject {

	static Console c = new Console (25, 100);
	public static void main(String[] args) throws InterruptedException {	

		Scanner sc = new Scanner(System.in);

		// This code declares variables
		String mainScreenIn;
		String ruleScreenIn;
		String difficultyChoice;
		String endOfGameIn;
		boolean programRunning = true;
		int wrongGuesses = 0;
		char letterGuessed;
		boolean wordCompleted = false;
		String incorrectGuesses = "";

		// This code prints the title of the game and ASCII art decals
		c.setTextColor(Color.BLUE);
		c.println("Developed by Erik Porteu");
		Thread.sleep(2000);
		c.println("Welcome to...");
		Thread.sleep(2000);
		while (programRunning != false) {
			c.clear();
			c.println("Hangman: The video-game");
			c.println("\n  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " / \\  |\r\n"
					+ "      |\r\n"
					+ "=========");

			// this code recieves the user input from the main screen
			c.println("\n1. Start game\n2. Rules\n3. Quit");
			c.print("\nInput: ");
			mainScreenIn = c.readLine();

			// This block of code runs the start of the game, where the user can choose its difficulty
			if (mainScreenIn.equals("1") || mainScreenIn.equals("1.") || mainScreenIn.equalsIgnoreCase("Start")) {
				c.println("\nWould you like to play in:");

				// This code gets input from the user to choose the difficulty of the game
				c.println("\n1. Easy\n2. Medium\n3. Hard\n4. Overkill (No vowels)");
				c.print("\nInput: ");
				difficultyChoice = c.readLine();
				c.clear();

				// the input above is sent to a method which chooses a specific array based off of difficulty, then sends the array to another method that selects one word randomly
				String[] arrayDifficulty = chooseArrayDifficulty(difficultyChoice);
				String wordForGame = wordFetcher(arrayDifficulty);

				// this code just displays the hangman ASCII art at the start of the game.
				String hangmanPic = wrongGuessDispay(wrongGuesses);
				c.println("\n" +hangmanPic);

				// this code create a character array to store the blank spaces to guess the word, limited by the length of the wordForGame
				char[] guessedWord = new char[wordForGame.length()];

				// this code creates an array to see if the user has entered the same character twice
				boolean[] alphabetGuessed = new boolean[26];

				// this code sets the spots in the array to the character '.' based off of the index of the wordForGame
				for (int i = 0; i < wordForGame.length(); i++) {
					guessedWord[i] = '.';
				}

				while (wordCompleted != true && wrongGuesses < 6) {

					// This code prints the number of blank spaces of the word, based off of its index
					c.println("\nYour word to guess is:\n");
					for (int i = 0; i < wordForGame.length(); i++ ) {
						c.print(guessedWord[i]);
					}

					// This code is the scanner input for a character
					c.print("\n\nInput: ");
					letterGuessed = c.readLine().toLowerCase().charAt(0);
					c.clear();

					// This code tracks your input to see if you have entered a letter twice
					if (alphabetGuessed[letterGuessed - 97] == true) {
						c.println("\nYou already entered that, try another letter!\n");
						hangmanPic = wrongGuessDispay(wrongGuesses);
						c.println(hangmanPic);
					}

					// This code checks to see if the character that the user inputted is in the word, and then replaces the blank spaces with the char inputted, and prints a line and the ASCII art hangman based off of guesses.
					if (wordForGame.contains(String.valueOf(letterGuessed)) && alphabetGuessed[letterGuessed - 97] != true) {
						for (int i = 0; i < wordForGame.length(); i++) {
							if (wordForGame.charAt(i) == letterGuessed) {
								guessedWord[i] = letterGuessed;	
							}
						}
						c.println("\nGood guess!\n");
						hangmanPic = wrongGuessDispay(wrongGuesses);
						c.println(hangmanPic);

						// this code runs if the character inputted by the user is not in the word
					} else if (!(wordForGame.contains(String.valueOf(letterGuessed))) && alphabetGuessed[letterGuessed - 97] != true) {
						wrongGuesses ++;
						c.println("\nSorry, there's no \'"+ letterGuessed + "\'. (You now have " + (6 - wrongGuesses) + " guesses left)\n");
						incorrectGuesses += letterGuessed + " ";
						hangmanPic = wrongGuessDispay(wrongGuesses);
						c.println(hangmanPic);
					}

					// this code prints a list of letters that aren't in the word
					if (!incorrectGuesses.isEmpty()) {
						c.println("\nLetters not in word: " + incorrectGuesses);
					}

					alphabetGuessed[letterGuessed - 97] = true;

					// this code checks to see if the word has any blank spaces '.' remaining
					wordCompleted = isWordCompleted(guessedWord, wordForGame);
				}

				// this code runs if the word is completed and under the max # of wrong guesses
				if (wordCompleted == true && wrongGuesses < 6) {
					c.println("\nCongratulations! You guessed the word correctly! Game over.\nThe word was: " + wordForGame);

					// this code runs if the word is not completed and equal or over the max amount of guesses 
				} else if (wordCompleted == false && wrongGuesses >= 6) {
					c.println("\nYou ran out of tries, Game over.\nThe word was: " + wordForGame);
				}

				// this code prints at the end of the hangman game
				c.println("\nWould you like to:\n\n1. Return to main screen\n2. Quit");
				c.print("\nInput: ");
				endOfGameIn = c.readLine();

				if (endOfGameIn.equals("1.") || endOfGameIn.equals("1") || endOfGameIn.equalsIgnoreCase("Return")) {
					programRunning = true;
					wrongGuesses = 0;
					wordCompleted = false;
					incorrectGuesses = "";

				} else if (endOfGameIn.equals("2.") || endOfGameIn.equals("2") || endOfGameIn.equalsIgnoreCase("Quit")) {
					System.exit(0);

				} else {
					c.println("User input invalid, returning to main screen.");
					Thread.sleep(2000);
					programRunning = true;
				}

				// This block of code prints the rules of hangman
			} else if (mainScreenIn.equals("2") || mainScreenIn.equals("2.") || mainScreenIn.equalsIgnoreCase("Rules")) {
				c.clear();
				c.println("Rules:\n\n- Player selects a word difficulty\n- Player is given the hangman post and empty spaces for the word\n- Player needs to guess what the word is by entering one letter that may be in the word"
						+ "\n- If the player fully guesses the word in less than 6 tries, they win\nHappy playing!");

				// This block of code gets input from the user for whether they want to quit the progam, or return to the main screen
				c.println("\n1. Return to main screen\n2. Quit");
				c.print("\nInput: ");
				ruleScreenIn = c.readLine();

				// This block of code runs if the user chooses 1, in rule screen
				if (ruleScreenIn.equals("1") || ruleScreenIn.equals("1.") || ruleScreenIn.equalsIgnoreCase("Return") || ruleScreenIn.equalsIgnoreCase("Return to main screen")) {
					programRunning = true;

					// This block of code runs if the user chooses 2, in rule screen
				} else if (ruleScreenIn.equals("2") || ruleScreenIn.equals("2.") || ruleScreenIn.equalsIgnoreCase("Quit")) {
					System.exit(0);

					// This block of code runs if the user inputs anything else, in rule screen
				} else {
					c.println("Entered input not valid. Sending user back to main screen.");
					Thread.sleep(2000);
					programRunning = true;
				}

				// This block of code runs if if the user chooses 3, in main screen, to terminate the program
			} else if (mainScreenIn.equals("3") || mainScreenIn.equals("3.") || mainScreenIn.equalsIgnoreCase("Quit")) {
				System.exit(0);

				// This block of code runs if if the user inputs anything else in main screen
			} else {
				c.println("Entered input not valid. Sending user back to main screen.");
				Thread.sleep(2000);
				programRunning = true;
			}

			sc.close();
		}
	}

	/**
	 * @param String difficultyChoice: a String that was inputted by a user to select difficulty
	 * @return String[] arrayChoice: an array that was selected based off of difficultyChoice
	 */
	public static String [] chooseArrayDifficulty (String difficultyChoice) {
		// These are all the possible arrays
		String[] easyWords = {"eye", "sail", "fun", "easy", "sleep", "jazz", "arms", "leg", "hello", "simple", "fair", "pizza", "steal", "wee"};
		String[] mediumWords = {"halt", "return", "wallow", "buzzed", "wrecking", "wretched", "impose", "stretch", "curious", "folding", "specific", "frazzled", "frizzled", "equip", "jumbo", "haiku", "complicated"};
		String[] hardWords = {"fortuitous", "supercalifragilisticexpialidocious", "opportunistic", "dynamite", "malfeasances", "perspective", "galvanized", "einstein", "imperialistic", "interwoven", "ionization", "spectate", "acrimonious", "mnemonic"};
		String[] overkillWords = {"crypt", "myths", "flyby", "myrrh", "crwth"};
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

	/**
	 * @param String[] words: a String[] that was selected by a user during difficulty selection
	 * @return String word: a String that was selected randomly from array
	 */
	public static String wordFetcher (String words[]) {
		int random = (int) (Math.random() * words.length);
		String word = words[random];

		return word;

	}

	/**
	 * @param char[] guessedWord: the array of blank spaces that you guess the letters for
	 * @param String wordForGame: the word that was randomly selected for the game from one of the arrays
	 * @return boolean false: if the guessedWord still has the char '.' inside it
	 * @return boolean true: if the guessedWord does not have the char '.' inside it
	 */
	public static boolean isWordCompleted (char[] guessedWord, String wordForGame) {
		char c = '.';
		for (int i = 0; i < wordForGame.length(); i++) {
			if (guessedWord[i] == c) {
				return false;
			}
		}
		return true;

	}

	/**
	 * @param int wrongGuesses: an integer which increases based of the # of guesses the user inputs that did not have a letter in the word.
	 * @return String hangmanPic: a String which is an ASCII art display of the wrongGuesses counter, for hangman.
	 */
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
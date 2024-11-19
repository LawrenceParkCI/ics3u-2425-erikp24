package unit2;

/**
 * Description:
 * Date:
 * @author
 */
public class DoubleDiceContest {

	public static void main(String[] args) throws InterruptedException {
		// This block just declares variables
		int dice1Rob, dice2Rob;
		int dice1Hum, dice2Hum;

		System.out.format("%30s","Dice Game:\n\n");
		
		System.out.println("-----------------------------------------------------------------------------------------------");

		System.out.format("\n%30s","Human/Player:\n");
		
		// This block just prints out some ASCII art
		System.out.println("  ____");
		System.out.println(" /\\' .\\    _____");
		System.out.println("/: \\___\\  / .  /\\");
		System.out.println("\\' / . / /____/..\\");
		System.out.println(" \\/___/  \\'  '\\  /");
		System.out.println("          \\'__'\\/");
		
		System.out.println("\n*Rolls die*");
		
		// This block generates two random numbers from the listed range of numbers, and stores them in two variables.
		dice1Hum = (int)(Math.random() * 6 + 1);
		dice2Hum = (int)(Math.random() * 6 + 1);
		
		int dieHuman = dice1Hum + dice2Hum;
		
		System.out.println("\nThe player rolls a " + dice1Hum + " and a " + dice2Hum + ". Thus, Rolling " + dieHuman + " in total.\n");
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.format("\n%30s","Computer/Robot:\n");
		
		// This block just prints out some ASCII art
		System.out.println("  ____");
		System.out.println(" /\\' .\\    _____");
		System.out.println("/: \\___\\  / .  /\\");
		System.out.println("\\' / . / /____/..\\");
		System.out.println(" \\/___/  \\'  '\\  /");
		System.out.println("          \\'__'\\/");
		
		System.out.println("\n*Rolls die*");
		
		// This block generates two random numbers from the listed range of numbers, and stores them in two seperate variables.
		dice1Rob = (int)(Math.random() * 6 + 1);
		dice2Rob = (int)(Math.random() * 6 + 1);
		
		int dieRobot = dice1Rob + dice2Rob;
		System.out.println("\nThe robot rolls a " + dice1Rob + " and a " + dice2Rob + ". Thus, Rolling " + dieRobot + " in total.\n");
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.format("\n%30s","Showdown:\n");
		
		if ( dieHuman > dieRobot) {
			
			System.out.println("\nSince the human's " + dieHuman + " is greater than the robot's " + dieRobot + " the human wins!\n");
			
			// This block just prints out some ASCII art
			System.out.println("       _\\|/^");
			System.out.println("        (_oo /");
			System.out.println("       /-|--/");
			System.out.println("       \\ |");
			System.out.println("         /--i");
			System.out.println("        /   L");
            System.out.println("        L");
			
			
		} else if ( dieRobot > dieHuman ){
			
			System.out.println("\nSince the robot's " + dieRobot + " is greater than the human's " + dieHuman + " the robot wins!\n");
			
			// This block just prints out some ASCII art
			System.out.println("      \\_/");
			System.out.println("     (* *)");
			System.out.println("    __)#(__");
			System.out.println("   ( )...( )(_)");
			System.out.println("   || |_| ||//");
			System.out.println(">==() | | ()/");
			System.out.println("    _(___)_");
			System.out.println("   [-]   [-]");
			
		} else if (dieHuman == dieRobot) {
			
			System.out.println("\nSince both contestants die are equal, no one wins!");
			
		}

	}

	/*
	 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
	 * The program should output the total of the two dice for both the user and the computer, 
	 * then announce who won: the computer, the user, or say it was a tie.
	 */


}



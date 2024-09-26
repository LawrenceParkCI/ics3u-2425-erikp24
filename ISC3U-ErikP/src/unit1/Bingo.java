package unit1;

import java.text.Format;
/**
 * Description: A program which creates a Bingo Chart consisting of five rows and columns, and the rules of the game.<br>
 * <br>Date: Wed, Sept 25, 2024
 * @author Erik Porteu
 */
public class Bingo {
	
	public static void main(String[] args) {
		/*
		 * The code below should print the rules of the game "Bingo"
		 */
		System.out.format("%37s|Bingo Rules:|\n\n","");
		System.out.println("1.\t The caller randomly pulls a numbered Bingo ball\n\n");
		System.out.println("2.\t The number is placed on the Bingo board and called out\n\n");
		System.out.println("3.\t Players look for the called number on their Bingo card\n\n");
		System.out.println("4.\t If the number is located, it is marked off\n\n");
		System.out.println("5.\t Steps 1 - 4 are repeated until a player matches the Bingo pattern\n\n");
		System.out.println("6.\t The winning player yells BINGO!\n\n");
		System.out.format("%38sBingo card:\n\n","");
		/*
		 * The code below should print in the console a Bingo chart consisting of five rows and columns.
		 */
		System.out.format("%30s ________________________\n","");
		System.out.format("%30s|Test your luck on Bingo!|\n","");
		System.out.format("%30s|------------------------|\n\n","");
		System.out.format("%15s|B|%10s|I|%10s|N|%10s|G|%10s|O|\n\n","","","","","","");
		System.out.format("%16s8%12s26%11s43%11s59%11s68\n\n","","","","","","");
		System.out.format("%16s13%11s17%10sFree%10s48%11s72\n\n","","","","","","");
		System.out.format("%16s2%12s19%11s36%11s51%11s63\n\n","","","","","","");
		System.out.format("%16s5%12s22%11s44%11s54%11s69\n\n","","","","","","");
		System.out.format("%16s11%11s30%11s35%11s52%11s74\n\n","","","","","","");
	}

}
	
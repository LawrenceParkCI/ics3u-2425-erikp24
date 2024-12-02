package unit2;

import java.util.Scanner;

/**
 * Description: A program which gives a few challenges based off of if else statements.
 * Date: Tues, Nov 5, 2024
 * @author 
 */

public class IfChallenge {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int favNum;
		
		System.out.println("Please enter your favourite number.");
		favNum = in.nextInt();
		
		in.close();
		
		// (IF)
		System.out.println("(IF)");
		if (favNum < 0) {
			System.out.println("You need to look on the bright side.");
		}
		if (favNum % 2 != 0) {
			System.out.println("That's a bit strange.");
		}
		
		// (IF, ELSE)
		System.out.println("(IF, ELSE)");
		if (favNum % 3 == 0) {
			System.out.println("You should really consider thinking about 6.");
			
		} if (favNum % 2 == 0) {
			System.out.println("You should really consider thinking about 6.");
			
		} else {
			System.out.println("You can keep it wholesome.");
		}
		
		// (IF, ELSE IF, ELSE)
		System.out.println("(IF, ELSE IF, ELSE)");
		if (favNum % 10 == 8) {
			System.out.println("I am too full");
			
		} else if (favNum % 10 == 9) {
			System.out.println("Canada is a nice country");
			
		} else {
			System.out.println("don't count on it");
		}
		
		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.


    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */


	}
}

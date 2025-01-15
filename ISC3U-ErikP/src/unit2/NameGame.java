package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */
public class NameGame {

	public static void main(String[] args) {
			String name;
			int prcnt = (int)(Math.random() * 100) + 1;

			// this block initiates the scanner and prompts the user to enter their name.
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your name?");
			name = sc.next();

			sc.close();

			if (prcnt > 30) {
				System.out.println("I love that name!");
			} else {
				System.out.println("I hate that name!");
			}



		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */


	}

}

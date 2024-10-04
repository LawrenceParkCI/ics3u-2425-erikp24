package unit1;

import java.util.Scanner;
/**
 * Date: Fri, Oct 4, 2024 <br>
 * Description: A program which prints out characters either in their literal or ASCII value
 * @author Erik Porteu
 */
public class InputChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch1, ch2, ch3;
		
		System.out.println("Type in any 3 characters on this keyboard");
		System.out.println("after each, press <enter>");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		System.out.print("Together, these 3 letters spell: " + (ch1 + ch2 + ch3));
	}

}

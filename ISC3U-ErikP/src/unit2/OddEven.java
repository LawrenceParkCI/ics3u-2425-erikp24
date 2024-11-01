package unit2;

import java.util.Scanner;
/**
 * Date: Fri, Nov 1, 2024 <br>
 * Description: A program which determines whether a number is odd or even using modulus.
 * @author Erik Porteu
 */
public class OddEven {

	public static void main(String[] args) {
		
		int num;
		
		// Prompts the user for a number and assigns it to the variable num using Scanner.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = sc.nextInt();
		sc.close();
		
		int numValue = num % 2;
		
		// If the value of numValue has a remainder greater than 0 its an odd number, if it's less than 0 it's an even number.
		if (numValue > 0) {
			System.out.println("You have an odd number");
		}
		else {
			System.out.println("You have an even number");
		}

	}

}

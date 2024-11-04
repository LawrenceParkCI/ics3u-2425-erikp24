package unit2;

/**
 * Date: Fri, Nov 1, 2024 <br>
 * Description: A program which determines whether a number is positive or negative.
 * Also tests to see if it's divisible by 7.
 * @author Erik Porteu
 */
public class PositiveNegative {

	public static void main(String[] args) {
		//Declares a variable and assigns it a integer and determines whether the number is positive or negative by determining whether the number is greater than or less than zero.
		int num = 7;
		
		if (num >= 0) {
			System.out.println("You have a positive number.");
		}
		else {
			System.out.println("You have a negative number.");
		}
		// Determines whether the number is divisible by 7 using modulus.;
		
		if (num % 7 == 0) {
			System.out.println("You have a number which is divisible by 7.");
		}
	}

}

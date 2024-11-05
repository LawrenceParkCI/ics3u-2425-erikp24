package unit2;

/**
 * Description: A program which explores the properties of If Else statements.
 * Date: Tues, Nov 5, 2024
 * @author Erik Porteu
 */

public class IfStatements1 {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		/*
		 * A: nothing as the condition is not met to print anything out.
		 */

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		 * A: XQCL, as the condition was not met to print out the strings stored in if,
		 * so it has to print what's in else.
		 */

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		 * A: sykSHY, because the values will be equal to zero after modulus. So it meets the requirements of the condition.
		 */

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		 * A:KEKW, OMEGALUL, sykSHY, as it prints out the print statements where the conditions are met
		 */
		//What is the difference between the first and second part?
		/*
		 * the last if statements in part 2 has a exclamation mark "!"
		 * which makes it so that if the conditions are met,
		 * DON'T print any of the code in the if statement.
		 */

	}
}
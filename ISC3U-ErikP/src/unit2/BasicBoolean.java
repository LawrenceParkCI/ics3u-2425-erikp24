package unit2;

/**
 * Description: A program that explores the properties of Boolean if else statements.<br>
 * Date: Tues, Nov 5, 2024
 * @author Erik Porteu
 */

public class BasicBoolean {
	
	public static void main(String[] args) {

		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either _true_______ or _false_________
		
		boolean isPurple = false;


		/*
      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out ___true_____ because ___the second number is greater than the first number, so the condition has its requirements met_____________
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out ___false_____ because ___the first number is not greater than the second number, so the condition does not have its requirements met_____________
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out _____true___ because ____because the first number is greater than or equal to the third number as an integer, so the condition has its requirements met____________
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		//this prints out ____true____ because ______because the first number is less than or equal to the third number, so the condition has its requirements met__________
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means: greater than
		 * < means: less than
		 * <= means: less or equal to
		 * >= means: greater or equal to
		 * == means: is equal to
		 * != means: is not equal to
		 */

	}
}
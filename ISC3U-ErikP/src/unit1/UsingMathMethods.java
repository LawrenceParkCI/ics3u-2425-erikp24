package unit1;

import java.util.Scanner;

/**
 * Description: A program which explores the properties of using math methods <br>
 * Date: Tues, Oct 15, 2024
 * @author Erik Porteu
 */
public class UsingMathMethods {

	public static void main(String[] args) {
		double num = 4.4;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)			17		| 	4			|   -23  
		 * Math.rint(num)			17.0	| 	4.0			|   -23.0   
		 * Math.sqrt(num)		4.09...		|	2.0			|   NaN  
		 * Math.abs(num)		16.75		|	4.0			|   23.45
		 * Math.pow(num, 2)		280.5...   	|	16.0  		|   549.90...    
		 * Math.pow(num, num)	3.178...	|	256.0		|   NaN
		 * Math.pow(num, 3)		4699.42...	|	64.0		|   -12895.213...
		 * 
		 */
		num = 16.75;
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num,num));
		System.out.println(Math.pow(num, 3));
		num = 4.0;
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num,num));
		System.out.println(Math.pow(num, 3));
		num = -23.45;
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num,num));
		System.out.println(Math.pow(num, 3));

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!
		// A: because the number is negative, and you can't root a negative number.

		//In your own words describe what the following Math methods does
		/*
		 * round: Rounds the number to the nearest integer
		 * rint: Rounds the number to the nearest integer and decimal place.
		 * sqrt: Gives the square root of the number
		 * abs: Gives you the absolute of your number, meaning it makes whatever number you gave it positive.
		 * pow: Puts the number you gave it to the power of any exponent you choose.
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		// A: because the only argument you need is your chosen number.

		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		// A: because your arguments consist of the number you want to be put to the power of and the exponent.

		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25

		Scanner sc = new Scanner(System.in);
		double userNum;
		double power;
		System.out.println("Please type a base number and hit <enter>");
		userNum =  sc.nextDouble();
		System.out.println("Please type a number for your power and hit <enter>");
		power =  sc.nextDouble();
		System.out.format("%5sREAL NUMBER %5sSQUARE ROOT %5sRAISED TO POWER "+ power,"","","");
		System.out.format("\n%16.3f%17.3f%25.3f",userNum,Math.sqrt(userNum),Math.pow(userNum, power));
		
		sc.close();


		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input. A: Real number: 7.899, Square root: 2.810, Raised to power: 492.758



		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5 A: Real number: 16.000, Square root: 4.000, Raised to power: 4.000
		//b) the number 8 and the real number power 0.33 A: Real number: 8.000, Square root: 2.828, Raised to power: 1.986


		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power? A: No it does not




	}

}

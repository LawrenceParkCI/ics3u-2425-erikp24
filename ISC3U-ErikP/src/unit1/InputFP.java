package unit1;

import java.util.Scanner;
/**
 * Date: Wed, oct 3, 2024
 * Description: A program which prints out two floating point numbers which the user selects.
 * @author Erik Porteu
 */
public class InputFP {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("type in your first number and hit <enter>");
		num1 = sc.nextDouble();
		
		System.out.print("type in your second number and hit <enter>");
		num2 = sc.nextDouble();
		
		System.out.println("The first number entered was "+ num1);
		System.out.println("The second number enter was "+ num2);
		
		sc.close();
	}
}

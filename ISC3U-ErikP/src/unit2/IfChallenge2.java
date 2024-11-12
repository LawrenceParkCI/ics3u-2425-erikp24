package unit2;

import java.util.Scanner;

/**
 * Description: A program which further explores the properties of if statements </br>
 * Date: Tues, Nov 12, 2024
 * @author Erik Porteu
*/

public class IfChallenge2 {
  public static void main(String[] args) {
	  
	  int num1, num2, num3;
	  
	  // This block adds scanner and asks for an integer from the user
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter a number.");
	  num1 = sc.nextInt();
	  
	  // this block of code prompts the user for a second integer
	  System.out.println("Please enter a second number.");
	  num2 = sc.nextInt();
	  
	  // this block of code prompts the user for a third integer
	  System.out.println("Please enter a third number.");
	  num3 = sc.nextInt();
	  sc.close();
	  
	  // this block states that if the second integer is equal to the first plus one, and the second third integer is equal to the second plus one. Then it prints "Your numbers are strictly in order."
	  // if not, it prints "Golly gee! Your numbers are not in order."
	  if (num2 == num1 + 1 && num3 == num2 + 1) {
		  System.out.println("Your numbers are strictly in order.");
	  } else {
		  System.out.println("Golly gee! Your numbers are not in order.");
	  }
	
  }
}
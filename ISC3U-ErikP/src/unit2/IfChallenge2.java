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
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Please enter a number.");
	  num1 = sc.nextInt();
	  
	  System.out.println("Please enter a second number.");
	  num2 = sc.nextInt();
	  
	  System.out.println("Please enter a third number.");
	  num3 = sc.nextInt();
	  
	  sc.close();
	  
	  if (num2 == num1 + 1 && num3 == num2 + 1) {
		  System.out.println("Your numbers are strictly in order.");
	  } else {
		  System.out.println("Golly gee! Your numbers are not in order.");
	  }
	  
    //This is for the portfolio

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
  }
}
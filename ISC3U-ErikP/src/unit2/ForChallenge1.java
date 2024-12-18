package unit2;

/**
Description:
Date:
@author
*/

import java.util.Scanner;

public class ForChallenge1 {
  public static void main(String[] args) throws InterruptedException {
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	  
	  
	  double num1;
	  double num2;
	  double inc;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter a number");
	  num1 = sc.nextDouble();
	  
	  System.out.println("Please enter a second number");
	  num2 = sc.nextDouble();
	  
	  System.out.println("Please enter an increment");
	  inc = sc.nextDouble();
	  
	  sc.close();
	  
	  for (double i = num1; i <= num2; i += inc) {
		  System.out.println(i);
	  }
	  
  }
}

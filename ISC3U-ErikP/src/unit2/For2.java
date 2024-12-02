package unit2;

/**
Description: A program which explores the properties of for statements <br>
Date: Thurs, Nov 28, 2024
@author Erik Porteu
*/

import java.util.Scanner;

public class For2 {
  public static void main(String[] args) {
    //Recall - create a for loop printing 1 to 10:

	  for (int i = 1; i <= 10; i++) {
		  System.out.println(i);
	  }

    //though we are repeating a certain number of times, we can use variables in our for loops as well

    int times = 20;

    for (int i = 15; i < times; i++) {
      System.out.println(i);
    }

    //In addition, the counter doesn't necessarily have to be an integer
    double increment = 0.1;
    for (double i = 0; i < 2; i += increment) {
      System.out.println(i);
    }

    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:

    double num1, num2;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Please enter your first number");
    num1 = sc.nextDouble();
    
    System.out.println("Please enter your second number");
    num2 = sc.nextDouble();
    sc.close();
    
    for (double i = num1; i <= num2; i += 0.1) {
    	System.out.println(i);
    }

   //Look at the following code. Explain what is happening?

    int sum = 0; 

    for (int i = 1; i < 10; i++) {
      sum += i;
    }

    System.out.println(sum);


    
  }
}
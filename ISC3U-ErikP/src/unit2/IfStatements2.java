package unit2;
import java.util.Scanner;

/**
 * Description: A program which continues to explore the properties of if else statements.
 * Date: Tues, Nov 5, 2024
 * @author Erik Porteu
 */

public class IfStatements2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? 
		/*
		 * A: Because the variable is only declared if the number is over 18,
		 * which logically won't work as the variable might not be 18,
		 * so it will create a error in the code.
		 */

		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.
		
		String title = "Adult";
		
		if (userAge > 18) { //If they're over 18, they are titled an adult
			System.out.println(title);
			
		} else {  //if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");
			
		}

	}
}

package unit1;

import java.util.Scanner;

public class Alive {
/**
 * Date: Tues, Oct 8, 2024 <br>
 * Description: A program which calculates the total amount of days the user has been alive and the total hours they have slept, based on user inputted values.
 * @author Erik Porteu
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int birthD;
		int birthM;
		int birthY;
		int presentD;
		int presentM;
		int presentY;

		System.out.println("Please enter your birthdate:\n");

		System.out.print("Enter day: ");
		birthD = sc.nextInt();
		System.out.print("Enter month: ");
		birthM = sc.nextInt();
		System.out.print("Enter year: ");
		birthY = sc.nextInt();

		System.out.println("\nPlease enter the present date:\n");

		System.out.print("Enter day: ");
		presentD = sc.nextInt();
		System.out.print("Enter month: ");
		presentM = sc.nextInt();
		System.out.print("Enter year: ");
		presentY = sc.nextInt();

		int daysAlive = (presentY - birthY) * 365 + (presentM - birthM)*30 + (presentD - birthD);
		int hoursSlept = daysAlive * 8;

		System.out.println("You have been alive for: "+ daysAlive +" days");
		System.out.println("You have slept for: "+ hoursSlept +" hours");
		sc.close();


	}

}

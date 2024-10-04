package unit1;

import java.util.Scanner;

public class Carpet {
/**
 * Date: Fri, Oct 4, 2024
 * Description: This is a program that calculates the total cost to carpet a room based on user-inputted values, it then prints the total value in a print statement.
 * @author Erik Porteu
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, width, carpetFlatPrice;
		
		System.out.println("Please enter the length (m) of your room and hit <Enter>");
		length = sc.nextInt();
		
		System.out.println("Please enter the width (m) of your room and hit <Enter>");
		width = sc.nextInt();
		
		System.out.println("Please enter the price ($) of the carpet per square meter (m^2) and hit <Enter>");
		carpetFlatPrice = sc.nextInt();
		
		int carpetPrice = (int) (length * width) * carpetFlatPrice;
		
		System.out.println("The price to carpet your room is: $" + carpetPrice);
		
		sc.close();

	}

}

package unit1;

import java.util.Scanner;
/**
 * Date: Wed, oct 3, 2024
 * Description: A program which calculates the volume of a rectangle and prints it out in console.
 * @author Erik Porteu
 */
public class RectangleArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int length, width, depth;
		
		// Get user input
		System.out.println("AREA PROGRAM");
		System.out.print("type in the length of the rectangle and hit <enter>");
		length = sc.nextInt();
		
		System.out.print("type in the width of the rectangle and hit <enter>");
		width = sc.nextInt();
		
		System.out.print("type in the depth of the rectangle and hit <enter>");
		depth = sc.nextInt();
		
		// Calculate volume
		int area = length * width * depth;
		
		// Print the output
		System.out.println("the volume of the rectangle is " + area);
		
		sc.close();
	}
}

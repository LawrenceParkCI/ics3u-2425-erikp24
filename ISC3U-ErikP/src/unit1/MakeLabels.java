package unit1;

import java.util.Scanner;

public class MakeLabels {
	/**
	 * Date: Tues, Oct 2, 2024
	 * Description: A program which teaches us how to type string variables.
	 * @author Erik Porteu
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// This code declares the variables
		String subject;
		String name;

		// this code prints out the statement
		System.out.println("Type in your name and subject, then press <enter>");
		name =  sc.nextLine();
		subject = sc.nextLine();

		System.out.println();
		System.out.println("**********************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("**********************");
		sc.close();

	}

}

package unit1;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class GroceryShopping {

	public static void main(String[] args) {
		/*
		 * This block is fetching the date and time values from my computer.
		 * As well as, formatting the way the date and time is printed.
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  

		Scanner sc =  new Scanner(System.in);

		// This block is declaring most of my variables.
		String personName, item1, item2;
		double itemPrice1, itemPrice2;
		int itemAmnt1, itemAmnt2, tax = 13;

		// This block is asking for your name and printing it.
		System.out.print("Please enter your name: ");
		personName =  sc.nextLine();
		System.out.println("Thank you.\n");
		System.out.println("|| $$$ \\\\\\ ========== \"" + personName + "'s Groceries\" ========== /// $$$ ||\n\n");

		// This block is asking for your first grocery item.
		System.out.print("What would you like to purchase?: ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemPrice1 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmnt1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Amazing.\n");

		// This block is asking for your second grocery item.
		System.out.print("What would you like to purchase?: ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemPrice2 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmnt2 = sc.nextInt();
		System.out.println("Perfect.\n");

		System.out.println("this is your receipt:\n\n\n");

		// This block is printing the receipt title as well as live time.
		System.out.format("%24s"+  personName + "'s Groceries\n", "");
		System.out.println(dtf.format(now));

		//this block is going to print the values collected as a receipt.
		System.out.format("Item%5s|	Price%5s| Quant.%5s	| Total Price\n","","","");
		System.out.println("-----------------------------------------------------");
		System.out.format(item1 + "");
		
		sc.close();
	}

}

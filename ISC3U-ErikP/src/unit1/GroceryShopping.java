package unit1;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Random;

public class GroceryShopping {
/**
 * Date: Mon, Oct 21, 2024<br>
 * Description: A program which asks the user for price and quantity of two items at a grocery store and prints the receipt.
 * @author Erik Porteu
 * @param args 
 */
	public static void main(String[] args) {

		// This code assigns and lists the possible values of compliments 1 and 2.
		String[] compliments = {"Amazing.", "Perfect.", "Great."};
		
		
		// This code creates a random object.
		Random random = new Random();
		
		// This code generates a random index from 0 to 2 for compliments 1 and 2.
		int randomIndex = random.nextInt(compliments.length);
		
		// This code assigns a random string to compliment
		String compliment = compliments[randomIndex];

		Scanner sc =  new Scanner(System.in);
		
		// This block is declaring most of my variables.
		String item1, item2, personName = "Erik";
		double itemPrice1, itemPrice2;
		int itemAmnt1, itemAmnt2;

		System.out.println("\n|| $$$ \\\\\\ ========== \"" + personName + "'s Groceries\" ========== /// $$$ ||\n\n");

		// This block is asking for your first grocery item.
		System.out.print("What would you like to purchase?: ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemPrice1 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmnt1 = sc.nextInt();
		sc.nextLine();
		System.out.println(compliment);

		// This block is asking for your second grocery item.
		System.out.print("What would you like to purchase?: ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemPrice2 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmnt2 = sc.nextInt();
		System.out.println(compliment);

		sc.close();

		System.out.println("this is your receipt:\n\n\n");

		System.out.format("%30s"+ personName + "'s Groceries\n\n", "");

		/*
		 * This block is fetching the date and time values from my computer.
		 * As well as, formatting the way the date and time is printed.
		 * It then prints the date and time
		 */

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));

		// This block is just declaring and assigning some more variables
		final double tax = 0.13;
		double itemTotalPrice1 = itemPrice1*itemAmnt1;
		double itemTotalPrice2 = itemPrice2*itemAmnt2; 
		double cost = itemTotalPrice1 + itemTotalPrice2;
		double total = cost + cost*tax, taxAmnt = cost*tax;
		int roundedTotalInt = (int) Math.round(total);
		double roundedTotalFlt = Math.round(total*20.0)/20.0;
		
		// This block is assigning numerical formats to variables.
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percentage = NumberFormat.getPercentInstance();
		
		System.out.format("\n%19s|%20s|%19s|%18s\n", "Item   ", "Price   ", "Quantity   ","Total   ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.format("%-19s|%20s|%19d|%18s\n", item1, money.format(itemPrice1), itemAmnt1, money.format(itemTotalPrice1));
		System.out.format("%-19s|%20s|%19d|%18s\n", item2, money.format(itemPrice2), itemAmnt2, money.format(itemTotalPrice2));
		System.out.println("-------------------------------------------------------------------------------");
		System.out.format("\n%61s%18s","Subtotal:", money.format(cost));
		System.out.format("\n%61s%18s","Tax ("+ percentage.format(tax)+"):", money.format(taxAmnt));
		System.out.format("\n%61s%18s","Total:", money.format(total));
		System.out.println("\nThe rounded total is: " + money.format(roundedTotalInt));
		System.out.println("\nThe rounded total to the nearest 5 cents is: " + money.format(roundedTotalFlt));
		System.out.format("\n\n%63s","Thank you for shopping at " + personName + "'s groceries. Come again!");
	}

}

package unit2;
import java.util.Scanner;

/**
 * Description: This program explores the properties of strings in if else statements. </br>
 * Date: Tues, Nov 12, 2024
 * @author Erik Porteu
*/

class StringComparison {
  public static void main(String[] args) {

    /*Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer.equals("Toronto")) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }*/
    
    String word1 = "Hello";
    String word2 = "hARrY";
    
    // this block uses .equals
    if (word1.equals("Hello")){
    	System.out.println("Greetings!");
    }
    
    // this block uses .equalsIgnoreCase
    if (word2.equalsIgnoreCase("harry")){
    	System.out.println("Which planet do you speak of?");
    }
    
    if (word1.compareTo(word2) < 0) {
    	System.out.println("The word \"" + word2 + "\" comes after \"" + word1 + "\" in ASCII!");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?

    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */
    
    
    


    //What values does compareTo() return? How can we 
    //interpret the value?

    //what value does equals() and equalsIgnoreCase() return? 
    //What is the difference between these two functions?
  }
}

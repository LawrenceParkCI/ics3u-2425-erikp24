package unit1;

import java.util.Scanner;

/**
* Description: A program that explores the properties of casting.
* Date: Wed, Oct 15, 2024
* @author Erik Porteu
*/
public class Casting {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why? A: a floating point, as the variable 'intNum' was declared as the value of 'doubleNum' which is a floating point
    System.out.println(doubleNum);

    //can you explain what is happening in this code? A: the code is saying that doubleNum is equal to itself but adding 2.2 to its value.
    doubleNum = doubleNum + 2.2;

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why? A: an Integer, because the code above casted it as an integer.
    System.out.println(intNum);

    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double A: Implicit
      double to int A: Explicit
      int to long A: Implicit
      long to int A: Explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data) 
    A: because Implicit casting means your lengthening short data, meaning you're not losing precision. Explicit casting means your shortening long data, meaning you're losing precision.
    */

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    myNum = in.nextDouble();
    //code

    System.out.print("Rounding down to the nearest tenth, it is: "+ Math.floor(myNum*10) / 10.0 +"\n");
    System.out.print("Rounding up to the nearest tenth, it is: "+  Math.ceil(myNum*10) / 10.0);
    in.close();
  }
}
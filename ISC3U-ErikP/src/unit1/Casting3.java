package unit1;

/**
 * Description: A program that goes more in-depth about casting <br>
 * Date: Thurs, Oct 17, 2024
 * @author Erik Porteu
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way? A: because it prints out a portion of a string, and the direct value of the integers

		//Demonstrate casting a double value to a String in this way
		System.out.println("1.32 + 1.23 + 3.21" + 2.13);

		//Demonstrate casting a boolean value to a String in this way
		System.out.println("True or " + false);

		//Demonstrate casting a char value to a String in this way
		System.out.println("a + b" + 'c');
		
		System.out.println("Part 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "-5";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2" Error
		 * "23c" Error
		 * "2 3" Error
		 * "Lol23" Error
		 * "-5" Functions
		 */
		//What can you say about how we can use the function, Integer.parseInt()? Your string can only have a value of an integer in it for the function to work.


		// What do you think the code to change a String to double would look like?
		//Similarly, test out the code and write down what instructions
		
		double myFloatNum =  Double.parseDouble(strNum); // Cast the string value as a double value.
		
		System.out.println(strNum + " * 2 = " + 2 * myFloatNum); // Print the value in a mathmatical operation.
		
		//When do you think it might be necessary to change a string value into an integer value/double value? // when writing values for integers as strings and you don't want to take time to declare all the variables for each value.
	}
}
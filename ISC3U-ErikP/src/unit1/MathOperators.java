package unit1;

public class MathOperators {
	/**
	 * Date: Tue, Oct 1, 2024
	 * Description: This program is a coding assignment exploring the properties of math operators.
	 * @author Erik Porteu
	 * @param args
	 */
	public static void main(String[] args) {
		/*
        Pre: Kind of Math, but not really
        What do you notice is happening?
        A: I see that the math is being printed out as opposed to being calculated because of the quotation marks, and when they aren't in quotations, it's undergoing a math operation.
     */
     
     //      System.out.println("Butter" + "fly");
     
     //      System.out.println("1 + 2 + 3 + 4 + 5");
     
     //      System.out.println(1 + 2 + 3 + 4 + 5);
     
     //      System.out.println(1 + 2 + "3 + 4 + 5");
     
     //      System.out.println("1 + 2 + 3" + 4 + 5);
     
     
     //Why do you think the last two outputs act so differently? A: because a portion of the line is a string, as it's put in quotation marks
     
     
     //Summary: What are two possible roles of the + operator? A: to either merge both a variable and a string into a print statement.
    
     
     /*
        Part 1 
        Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.
     */
		System.out.println("Part 1:\n");
        int numOne;
        int numTwo;
        numOne = 2;
        numTwo = 4;
		
     // + means: addition as the two values are added
     System.out.println(numOne+numTwo +"\n");
     // - means: subtraction as the two values are subtracted
     System.out.println(numOne-numTwo +"\n");
     // * means: multiplication as the two values are multiplied
     System.out.println(numOne*numTwo +"\n");
     // / means: division as the two values are divided
     System.out.println(numOne/numTwo +"\n");
     
     
     //Print the following expression: (3 + 2) * 5
     //Print the following expression: 3 + 2 * 5
     System.out.println((3 + 2) * 5 +"\n");
     System.out.println(3 + 2 * 5 +"\n");
     //Was this expected? Why or why not? A: it was, since it follows BEDMAS during math operations.
     /*
        Part 2 - Calculate Using Operators
        Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
        Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
     */     
     System.out.println("Part 2:\n");
     int celsius;
     celsius = 900;
     System.out.println(celsius*(9/5)+32 +"\n");
     /*
        Part 3
        Figure out what is the meaning of % as a math operator. Use print statements
        to check your answer.
     */
     System.out.println("Part 3\n");
     System.out.println(15 % 2);
     //I think % means: the remainder of the value
	}

}

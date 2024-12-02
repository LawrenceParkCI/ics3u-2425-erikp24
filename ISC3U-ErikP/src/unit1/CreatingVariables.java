package unit1;

public class CreatingVariables {
	/**
	 * Description: Program that prints my name and a statement that calculates the area of a square using variables<br><br>
	 * Date: Mon, Sept 30, 2024
	 * @author Erik Porteu
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("%15sCreatingVariables.java (Assignment) - Erik Porteu\n\n","");
		// Warmup # 1
		System.out.println("My name is Erik \n");
		// Warmup # 2
		// Q: What if the Value I want to use needs to change? A: when you print out the statement, include the variable in any places where it needs to be mentioned.
		int squareSide;
		squareSide = 25;
		System.out.println("The area of a square with a side of "+ squareSide +" units is: "+ squareSide*squareSide +" units.");
		int number;
		number = 4;
		System.out.println("\n"+ Math.sqrt(number));
		
	}

}

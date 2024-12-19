package unit3;
/**
 * Description: A program which explores the properties of methods. </br>
 * Date: Dec 18, 2024
 @author Erik Porteu
 */

public class MathPlus {
	public static void main(String[] args) {
		
		// This code is method 1 distance calculations;
		System.out.println("Distance method:");
		double dist = distance(-1, 2, 3, 6);
		System.out.println("The distance between the two points is: " + dist + " units");
		
		// This code is method 2 hypotenuse calculations:
		System.out.println("\nHypotenuse method:");
		double hypotenuse = hypotenuse(3.3, 6.6);
		System.out.println("The hypotenuse is: " + hypotenuse + " units");
		
		// This code is method 3 factor calculations:
		System.out.println("\nFactor method:");
		int factors = numOfFactors(312);
		System.out.println("The number of factors that the number has is " + factors);
		
		// This code is method 4 prime number calculations:
		System.out.println("\nPrime number method:");
		boolean primer = isPrime(313);
	
	}
	/**
	 * @param dx1 - first x coordinate
	 * @param dy1 - first y coordinate
	 * @param dx2 - second x coordinate
	 * @param dy2 - second y coordinate
	 * @return formula - returns distance value after calculations
	 */
	public static double distance(int dx1, int dy1, int dx2, int dy2) {
		double formula = Math.sqrt((Math.pow(dx2 - dx1, 2)) + Math.pow(dy2 - dy1, 2));
		return formula;
	}
	
	/**
	 * @param a - first side
	 * @param b - second side
	 * @return c - hypotenuse value
	 */
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
	
	/**
	 * @param num - operand
	 * @return factorCount - return int value for # of factors
	 */
	public static int numOfFactors(int num) {
		int factorCount = 0;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				factorCount ++;
			}
		}
		return factorCount;
	}

	public static boolean isPrime(int num) {
		
		return true;
	}
}

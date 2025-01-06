package unit3;
/**
 * Description: A program which explores the properties of methods. </br>
 * Date: Dec 18, 2024
 @author Erik Porteu
 */

public class MathPlus {
	public static void main(String[] args) {

		// Methods:

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
		boolean primer = isPrime(25);
		System.out.println("Is it a prime number?: " + primer);

		// Arrays:

		// This code is array 1 sum of number calculations:
		System.out.println("\nSum of array numbers:");
		int [] sum = {1, 2, 3, 4};
		int total = sum(sum);
		System.out.println(total);

		// This code is array 2 sum of floating point number calculations:
		System.out.println("\nSum of floating point array numbers:");
		double [] sumDb  = {0.3, 2.9, 3.7, 2.6, 1};
		double totalDb = sumDb(sumDb);
		System.out.println(totalDb);

		// This code is array 3 finding the index of the minimum # in an array:
		System.out.println("\nIndex of the min # in an array:");
		int [] min = {4, 10, 3, 5, 6, 7, 2};
		int smallest = smallest(min);
		System.out.println(smallest);

		// This code is array 4 find the the index of the maximum # in an array:
		System.out.println("\nIndex of the max # in an array:");
		int [] max = {3, 1, 6, 9, 5, 4, 2};
		int maxIn = max(max);
		System.out.println("integer " + maxIn);

		// This code is array 5 find the the index of the maximum # in an array:
		System.out.println("\nIndex of the max # in an array:");
		double [] max2 = {2.1, 5.4, 3.2, 8.9, 9.1, 0.3, 1.8};
		int maxFlt = (int) max2(max2);
		System.out.println("float " + maxFlt);

		// This code is array 6 return the difference between the smallest and largest numbers in the array
		System.out.println("\nDifference between largest and smallest # in an array");
		int [] numbas = {10, 13, 32, 24, 18, 100 };
		int difArray = difArray(numbas);
		System.out.println("integer " + difArray);

		// This code is array 6 return the difference between the smallest and largest numbers in the array
		System.out.println("\nDifference between largest and smallest # in an array");
		double [] numbasFlt = {3.2, 2.1, 5.6, 1.4, 9.6, 7.9};
		double difArrayFlt = difArrayFlt(numbasFlt);
		System.out.println("float " + difArrayFlt);

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

	/**
	 * @param num - potential prime number
	 * @return true/false - true if its a prime number
	 */
	public static boolean isPrime(int num) {
		int recallPrime = numOfFactors(num);
		if (recallPrime == 2) {
			return true;
		}
		return false;
	}

	/**
	 * @param sum - array of numbers to combine
	 * @return total - returns the sum
	 */
	public static int sum(int[] sum) {
		int total = 0;
		for (int i = 0; i< sum.length; i++) {
			total += sum[i];
		}
		return total;
	}

	/**
	 * @param sumDb - array of numbers to combine
	 * @return totalDb - returns the sum
	 */
	public static double sumDb(double[] sumDb) {
		double totalDb = 0;
		for (int i = 0; i< sumDb.length; i++) {
			totalDb += sumDb[i];
		}
		return totalDb;
	}

	/**
	 * @param min[] - array of numbers to evaluate for min 
	 * @return smallest - index of the min # in array
	 */
	public static int smallest(int[] min) {
		int smallest = 0;
		for (int i = 1; i < min.length; i++) {
			if (min[smallest] > min[i]) {
				smallest = i;
			} 
		}
		return smallest;
	}

	public static int max(int[] max) {
		int maxest = 0;
		for (int i = 1; i < max.length; i++) {
			if (max[maxest] < max[i]) {
				maxest = i;
			} 
		}
		return maxest;
	}

	public static double max2(double[] max2) {
		int maxestFlt = 0;
		for (int i = 1; i < max2.length; i++) {
			if (max2[maxestFlt] < max2[i]) {
				maxestFlt = i;
			} 
		}
		return maxestFlt;
	}



	public static int difArray(int[] numbas) {
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < numbas.length; i++) {
			if (numbas[maxIndex] < numbas[i]) {
				maxIndex = i;
			}
			if (numbas[minIndex] > numbas[i]) {
				minIndex = i;
			}
		}
		return numbas[maxIndex] - numbas[minIndex];
	}
	
	public static double difArrayFlt(double[] numbasFlt) {
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < numbasFlt.length; i++) {
			if (numbasFlt[maxIndex] < numbasFlt[i]) {
				maxIndex = i;
			}
			if (numbasFlt[minIndex] > numbasFlt[i]) {
				minIndex = i;
			}
		}
		return numbasFlt[maxIndex] - numbasFlt[minIndex];
	}

}

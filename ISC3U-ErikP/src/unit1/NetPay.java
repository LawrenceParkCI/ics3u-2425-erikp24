package unit1;

public class NetPay {
/**
 * Date: Fri, Oct 4, 2024
 * Description: A program which uses variables and arithmetic to find a total netPay
 * @author Erik Porteu
 * @param args
 */
	public static void main(String[] args) {
		// This code is declaring and assigning Variables
		int hours = 40;
		double tax = 0.22, wage = 5.00, insurance = 2.00;
		
		//This code uses math operations to assign its variable
		double netPay = (double) ((hours * wage - insurance) - tax*(hours * wage - insurance));
		
		// This code prints out the total netPay
		System.out.println("Therefore, your netPay is: $" + netPay);

	}

}

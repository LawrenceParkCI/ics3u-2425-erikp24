package unit3;

/**
Description: A program which applies what we have learned about methods as of now. </br>
Date: Tues, Dec 17, 2024
@author Erik Porteu
*/

public class MethodChallenge1 {
   public static void main( String[] args )    {
       // Complete the function below. Don't forget to comment.
       double d1 = distance(-2,1 , 1,5);
       System.out.println(" (-2,1) to (1,5) => " + d1 );

       double d2 = distance(-2,-3 , -4,4);
       System.out.println(" (-2,-3) to (-4,4) => " + d2 );

       System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

       System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
   }

 /**
 (Description)
 @param x1 -> the first coordinate value on the x-axis
 @param y1 -> the second coordinate value on the x-axis
 @param x2 -> the first coordinate value on the y-axis
 @param y2 -> the second coordinate value on the y-axis
 @return returns the total distance between two points on a plane.
 */
   public static double distance( int x1, int y1, int x2, int y2 )
   {
       // put your code up in here
	   double d1 = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
	   return d1;
   }
}
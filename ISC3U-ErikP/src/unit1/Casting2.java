package unit1;

/**
 * Description: A program which continues exploring the properties of casting. 
 * Date: Thurs, Oct 17, 2024
 * @author Erik Porteu
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?

		//Why do you think this happens?
		//Investigate what is ASCII. What is it? A: ASCII is short for American Standard Code for Information Interchange, which is the most common character encoding format for text data in computers and on the internet. 
		//Can you find the number value for 'a'? Does it match with your findings above? A: the number value for a is 97, so it matches

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it

		char myCharCap = (char) (myChar - 32);
		System.out.println(myCharCap);

	}
}
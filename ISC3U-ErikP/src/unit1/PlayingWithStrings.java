package unit1;

public class PlayingWithStrings {

	public static void main(String[] args) {
		String fruit = "Apple";
		fruit = "banana";
		System.out.println(fruit + " Split");
		
		String num1 = "12";
		String num2 = "34";
		System.out.println("\n" +num1 + num2);
		System.out.println("\n" +num1 + num2 + 56);
		
		String number1 =  13 + "";
		System.out.println("\n"+number1);
		
		String froot = "apple";
		System.out.println("\n"+froot.length()+"\n");
		
		String name = "Runnymede";
		System.out.println(+name.length() + "Ravens".length());
		
		String message = "Themouseranuptheclock";
		String word = message.substring(3,8);
		System.out.println("\n"+word);
		
		String phrase;
		phrase = "JackandJillwentupthehill";
		System.out.println(phrase.substring(20));
		System.out.println(phrase.substring(phrase.length() - 4));
		
		System.out.println("hello".substring(3));
		System.out.println("hello".substring(5));
		
		String spaces = "   Trim me   ";
		String noSpaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(noSpaces);
		
		String digits = "1234567890";
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));
	}

	

}

package unit1;

import java.text.Format;

/**
 * Description: A program which states my name, grade, teacher and school. <br>
 * <br>
 * Date: Fri, Sept 20, 2024
 * @author Erik Porteu
 */
public class AboutMe {

	public static void main(String[] args) {
		/*
		 * This code below is printing my name, grade, teacher and school
		 */
		System.out.println("My name, grade, teacher and school");
		System.out.println(" ");
		System.out.println("Name: Erik Porteu");
		System.out.println("Grade: grade 11");
		System.out.println("Teacher: Ms Kemp");
		System.out.println("School: Lawrence Park Collegiate institute");
		System.out.println("\"go panthers\"\n");
		System.out.format("%15sMon%15sTue%15sWed%15sThurs%15sFri","","","","","");
		System.out.format("\n%14sDay 1%13sDay 2%13sDay 1%14sDay 2%14sDay 1","","","","","");
		System.out.format("\n\n09:00-10:15|%1sComp Sci%9sPhysics%11sComp Sci%11sPhysics%13sComp Sci%2s|\"Late Start\" 9:55-10:55","","","","","","");
		System.out.format("\n\n10:15-11:40|%1sPhysics%10sComp Sci%10sPhysics%12sComp Sci%12sPhysics%3s|\"Late Start\" 11:00-11:59","","","","","","");
		System.out.format("\n\n11:40-12:40|%1sLunch%12sLunch%13sLunch%14sLunch%15sLunch%5s|\"Late Start\" 12-01:00","","","","","","");
		System.out.format("\n\n12:40-01:55|%1sEnglish%10sFunctions%9sEnglish%12sFunctions%11sEnglish%3s|\"Late Start\" 01:00-02:05","","","","","","");
		System.out.format("\n\n01:55-03:15|%1sFunctions%8sEnglish%11sFunctions%10sEnglish%13sFunctions%1s|\"Late Start\" 01:00-02:05","","","","","","");
	}

}

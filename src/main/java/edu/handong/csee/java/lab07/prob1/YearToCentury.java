package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;
/**in this class yeartocentury main method takes in the value then passes on the value to class CenturyCalculator 
 * by instantiation to change year to century and print out the result
 */
public class YearToCentury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0; //variable yr
		Scanner keyboard = new Scanner(System.in); //instantiate scanner so user can type in the year

		System.out.println("Input year: "); //print out so to aid user to type
		yr = keyboard.nextInt(); //store typed in value to yr

		CenturyCalculator year = new CenturyCalculator(yr);//instantiate class CenturyCalculator to year and pass on value yr
		System.out.println(yr + " is " + year.calc_century() + "th century.");//print out the result
	}
}

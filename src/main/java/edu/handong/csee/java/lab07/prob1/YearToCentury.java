package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

public class YearToCentury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input year: ");
		yr = keyboard.nextInt();

		CenturyCalculator year = new CenturyCalculator(yr);
		System.out.println(yr + " is " + year.calc_century() + "th century.");
	}
}

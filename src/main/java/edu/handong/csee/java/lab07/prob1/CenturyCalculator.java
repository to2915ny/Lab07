package edu.handong.csee.java.lab07.prob1;
/** In this class value year is input from the user, and this class calculates the year to century*/
public class CenturyCalculator {
	int year; //set initial local variable year

	public CenturyCalculator()
	{
		year = 0; //with no parameter, given year = 0
	}

	public CenturyCalculator(int year)
	{
		this.year = year; //with parameter given save given year into local variable
	}
	/** This calculates the year to century*/
	public int calc_century()
	{
		if(year % 100 == 0) // calculate if year divided by 100 has no remainder
			year = year / 100; //then remove the last 2 digits and save it in variable year
		//eg 1900%100= 0 1900/100 =19 1900 is 19th century
		else
		{
			year = (year / 100) + 1; // if not remove the last 2 digits of the given 4 digit year and add 1 and store it in variable year
		}							//eg 1945 /100 =19 +1 20. 1945 = 20 century
		return year; //return year to main method
	}
}

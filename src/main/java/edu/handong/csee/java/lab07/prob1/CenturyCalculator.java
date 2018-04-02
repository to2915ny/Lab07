package edu.handong.csee.java.lab07.prob1;

public class CenturyCalculator {
	int year;

	public CenturyCalculator()
	{
		year = 0;
	}

	public CenturyCalculator(int year)
	{
		this.year = year;
	}

	public int calc_century()
	{
		if(year % 100 == 0)
			year = year / 100;
		else
		{
			year = (year / 100) + 1;
		}
		return year;
	}
}

package edu.handong.csee.java.lab07.prob2;
/** This class stores value(setter) from the main method also returns value from variable to main method*/
public class Chicken {
	private String name; //local variables
	private double price;
	private int stars;
	//constructors
	public Chicken()
	{
	this.name = ""; //with no parameter given, intital values are these.
	this.price = 0.0;
	this.stars = 0;
	}
	//Overloading can be applied
	public Chicken(String name, double price, int stars)
	{
	this.name = name; //with parameters given, values are stored into the local variables
	this.price = price;
	this.stars = stars;
	}
	//getters
	public String get_name()
	{
	return this.name;//when used in main method, returns value in the variable - name
	}

	public double get_price()
	{
	return this.price; // when declared in main method ,returns value in the variable - price
	}

	public int get_stars()
	{
	return this.stars; // when declared in main method, returns value in the variable - stars
	}
	//setters
	public void set_name(String name)
	{
	this.name = name; // stores value declared in the main method into local variable - name
	}

	public void set_price(double price)
	{
	this.price = price;// stores value declared in the main method into local variable - price
	}

	public void set_stars(int stars)
	{
	this.stars = stars; // stores value declared in the main method into local variable - stars
	}
	}



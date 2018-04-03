package edu.handong.csee.java.lab07.prob3;

import java.util.*; 
/** This class has set of methods such as constructors, getters and setters
 * 
 * @author to291
 *
 */
public class Attendance {
	private String name = ""; //First set initial variables
	private int year = 0; //Make it private so it is not seen by others
	private String student_id = "";
	private int missed = 0;

	//Constructors
	/** This class sets varaible so nothing is stored*/
	public Attendance()
	{
		this.name = "Null"; //variable name =0
		this.year = 0; //year = 0
		this.student_id = "Null"; //student_id =0
		this.missed = 0; //days of absent = 0 
	}
	/** same methods been declared but with a different parameter. Overloading*/
	public Attendance(String name, int year, String student_id, int missed) 
	{
		this.name = name; //if the parameters are given then automatically java directs it to this method
		this.year = year; // and the following values of variables will be stored according to the parameters.
		this.student_id = student_id;
		this.missed = missed;
	}
	//Getters
	public String get_name() // These are getters. These simply return values stored in variables 
	{
		return name; //return name
	}
	public int get_year()
	{
		return year; //return year
	}

	public String get_id()
	{
		return student_id; //return student _id
	}
	public int get_missed()
	{
		return missed; //return missed
	}

	//Setters
	public void set_name(String name) // these store variables when used in main method
	{
		this.name = name; //stores value into variable name
	}
	public void set_year(int year)
	{
		this.year = year; //stores value into varible year
	}
	public void set_id(String student_id)
	{
		this.student_id = student_id; //stores value into variable student_id
	}
	public void set_missed(int missed)
	{
		this.missed = missed; //stores value into variable missed
	}

}

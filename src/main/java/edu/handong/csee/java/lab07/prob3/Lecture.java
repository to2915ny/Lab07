package edu.handong.csee.java.lab07.prob3;
import java.util.Random; //import java utility Random so we can create random value.
/** This is the main class Lecture. Here we calculate we send information to class Attendance (setter) and we get
 * the return value from Attendance (getter) and we print out if the student failed or not.
 * @author to291
 *
 */
public class Lecture {



		public static void main(String[] args) {
			Attendance s_1 = new Attendance(); //instantiate Attendance in this main class lecture 4times
			Attendance s_2 = new Attendance(); // so 4 students can be evaluate whether the student failed or not
			Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); //notice the first 2's been instatiated with no parameter give
			Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);//and the other 2 has been given parameters. Java will automatically 
			// choose which function to send it to by overloading

			s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0); //set the 2 instance variable thats has no value
			s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);

			Random randomGenerator = new Random(); //instatiate randomGenerator - this will be used to generate a random number

			s_1.set_missed(randomGenerator.nextInt(10)); //set no. of absent days with random instance
			s_2.set_missed(randomGenerator.nextInt(10)); //nextInt(10) means it will generate any number between 0 to 10
			s_3.set_missed(randomGenerator.nextInt(10));
			s_4.set_missed(randomGenerator.nextInt(10));
			if(s_1.get_missed() > 6) //if student 1 missed more than 6 days
			{
				System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); //print out the name and fail
				System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());//print out number of days as well
			}
			else
				System.out.println("We'll see about the grade, " + s_1.get_name()); // if not print out "We'll see about the grade" and the name
			if(s_2.get_missed() > 6)//if student 2 missed more than 6 days
			{
				System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//print out the name and fail
				System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//print out number of days as well
			}
			else
				System.out.println("We'll see about the grade, " + s_2.get_name());// if not print out "We'll see about the grade" and the name
			if(s_3.get_missed() > 6)//if student 3 missed more than 6 days
			{
				System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//print out the name and fail
				System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//print out number of days as well
			}
			else
				System.out.println("We'll see about the grade, " + s_3.get_name());//if not print out "We'll see about the grade" and the name
			if(s_4.get_missed() > 6)//if student 3 missed more than 6 days
			{
				System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//print out the name and fail
				System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());//print out the number of days as well
			}
			else
				System.out.println("We'll see about the grade, " + s_4.get_name());//if not print out "We'll see about that " and the name

		}

	

}



package edu.handong.csee.java.lab07.prob2;
/**Here in the main Menu class we instantiate class Chicken so we can use the getter and setters to 
 * set values and get values and print out the name and the corresponding stars.
 * @author to291
 *
 */
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //instantiate class menu 
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//for each dish set parameters =
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);// name of the dish, price and rating(stars)

		menu1.set_stars(3); //change the rating with setter set_stars
		menu2.set_stars(4);
		menu3.set_stars(1);

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); // now print out the name and the stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//you can notice the first menu cheese mustards
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//rating has changed from 5 to 3
	}

}

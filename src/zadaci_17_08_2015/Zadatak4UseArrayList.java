package zadaci_17_08_2015;

import helpClasses.Circle;
import helpClasses.Loan;

import java.util.ArrayList;
import java.util.Date;

/**
 * (Use ArrayList) Write a program that creates an ArrayList and adds
 *  a Loan object, a Date object, a string, and a Circle object to the list, 
 *  and use a loop to display all the elements in the list by invoking the object’s toString() method.
 * @author Nikola Lisicic
 *
 */
public class Zadatak4UseArrayList {

	public static void main(String[] args) {
		//instance of array list which will hold a list of objects
		ArrayList<Object> list = new ArrayList<Object>();
		
		//adding instances to the list
		list.add(new Loan());
		list.add(new Date());
		list.add("Nikola");
		list.add(new Circle());
		
		//printing instances via toString
		for(Object e:list){
			System.out.println(e);
		}
		
	}

}

package zadaci_25_08_2015;

import helpClasses.ComparableCircle;

/**
 * (The ComparableCircle class) Define a class named ComparableCircle
 * that extends Circle and implements Comparable. Draw the UML diagram and
 * implement the compareTo method to compare the circles on the basis of area.
 * Write a test class to find the larger of two instances of ComparableCircle objects.
 * @author Nikola
 *
 */
public class Zadatak03ComparableCircle {

	public static void main(String[] args) {
		
		ComparableCircle c1 = new ComparableCircle(2); // circle with radius 2
		ComparableCircle c2 = new ComparableCircle(5); // circle with radius 5
		
		// print a message depending on the compareTo method
		if(c1.compareTo(c2)>0){
			System.out.println("Larger is first circle.");
		} else if(c1.compareTo(c2) <0){
			System.out.println("Larger is second circle.");
		} else {
			System.out.println("Circles are equal.");
		}
	}

}

	


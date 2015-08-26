package zadaci_25_08_2015;

import helpClasses.Circle;
import helpClasses.Colorable;
import helpClasses.GeometricObject;
import helpClasses.Square;

/**
 * (The Colorable interface) Design an interface named Colorable with a void method named howToColor(). 
 * Every class of a colorable object must implement the Colorable interface. 
 * Design a class named Square that extends GeometricObject and implements Colorable. 
 * Implement howToColor to display the message Color all four sides.
 * Draw a UML diagram that involves Colorable, Square, and GeometricObject.
 * Write a test program that creates an array of five GeometricObjects. 
 * For each object in the array, display its area and invoke its howToColor method if it is colorable.
 * 
 * Square and Circle classes are in package helpClasses, Square implements Colorable interface, but Circle doesn't
 * Colorable interface is also located in package helpClasses
 * @author Nikola
 *
 */
public class Zadatak04ColorableInterface {

	public static void main(String[] args) {
		// array of 5 GeometricObject
		GeometricObject[] array = new GeometricObject[5];
		array[0] = new Square(2); //square with side length 2
		array[1] = new Circle(2.5); //circle with radius 2.5
		array[2] = new Square(3); //square with side length 3
		array[3] = new Circle(5);  //circle with radius 5
		array[4] = new Square(5); //square with side length 5
		
		// loop through all objects in the array
		for(GeometricObject object: array){
			// print area of the object
			System.out.printf("\nArea of the object is: %.2f",object.getArea());
			
			// if the object is instance of Colorable call its howToColor method
			// else print message "Object can't be colored."
			if(object instanceof Colorable){
				System.out.println();
				((Colorable) object).howToColor();
			}
			else {
				System.out.println("\nObject can't be colored.");
			}
		}
		
	}

}

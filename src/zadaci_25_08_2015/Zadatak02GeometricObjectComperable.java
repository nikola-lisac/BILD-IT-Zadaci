package zadaci_25_08_2015;

import helpClasses.Circle;
import helpClasses.GeometricObject;
import helpClasses.Rectangle;

/**
 * (Enable GeometricObject comparable) Modify the GeometricObject class to
 * implement the Comparable interface, and define a static max method in the
 * class for finding the larger of two GeometricObject objects. Draw the UML
 * diagram and implement the new GeometricObject class. Write a test program
 * that uses the max method to find the larger of two circles and the larger of
 * two rectangles.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak02GeometricObjectComperable {

	public static void main(String[] args) {
		GeometricObject c1 = new Circle(4); // new Circle with radius 4
		GeometricObject c2 = new Circle(10); // new Circle with radius 10

		// finding larger circle and printing its properties
		GeometricObject c3 = GeometricObject.max(c1, c2);
		System.out.println("Larger circle is:\n" + c3.toString());

		GeometricObject r1 = new Rectangle(3, 7); // new Rectangle with width 3 and height 7
		GeometricObject r2 = new Rectangle(1, 4.2); // new Ractangle with width 1 and height 4.2

		// finding the larger rectangle and printing its properties
		GeometricObject r3 = GeometricObject.max(r1, r2);
		System.out.println("\nLarger rectangle is:\n" + r3.toString());

	}

}

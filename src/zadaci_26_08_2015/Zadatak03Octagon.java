package zadaci_26_08_2015;

import helpClasses.GeometricObject;

/**
 * (The Octagon class) Write a class named Octagon that extends GeometricObject
 * and implements the Comparable and Cloneable interfaces. Assume that all eight
 * sides of the octagon are of equal length. The area can be computed using the
 * following formula: area = (2 + 4 / Math.sqrt(2)) * side * side; Draw the UML
 * diagram that involves Octagon, GeometricObject, Comparable, and Cloneable.
 * Write a test program that creates an Octagon object with side value 5 and
 * displays its area and perimeter. Create a new object using the clone method
 * and compare the two objects using the compareTo method.
 * 
 * @author Nikola
 *
 */
public class Zadatak03Octagon {

	public static void main(String[] args) {
		Octagon o1 = new Octagon(5); // octagon with side length 5

		System.out.printf("Area of the octagon: %.2f", o1.getArea());
		System.out.println("\nPerimeter of the octagon: " + o1.getPerimeter());

		Octagon o2 = o1.clone(); // clone of octagon with side length 5

		// printing results of comparision between octagon and its clone
		if (o1.compareTo(o2) < 0) {
			System.out.println("Second octagon is bigger.");
		} else if (o1.compareTo(o2) > 0) {
			System.out.println("First octagon is bigger.");
		} else {
			System.out.println("Octagons are equal.");
		}
	}

}

class Octagon extends GeometricObject implements Cloneable {

	private double side = 1.0; // side of the octagon

	/** default constructor */
	Octagon() {

	}

	/** Constructor which creats instance with defined side */
	Octagon(double side) {
		this.side = side;
	}

	/**
	 * Calculate area of the octagon
	 * 
	 * @return area
	 */
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	/**
	 * Calculate perimeter of the octagon
	 * 
	 * @return perimeter
	 */
	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	/** Implementation of Comparable interface */
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;

	}

	/** implemantation of Cloneable inteface */
	public Octagon clone() {
		Octagon clone = new Octagon(this.side);
		return clone;

	}

	/** getter for side */
	double getSide() {
		return side;
	}
}
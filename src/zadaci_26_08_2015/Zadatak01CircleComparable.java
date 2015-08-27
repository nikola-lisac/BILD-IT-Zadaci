package zadaci_26_08_2015;

import helpClasses.GeometricObject;

/**
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend 
 * GeometricObject and implement the Comparable interface.
 * Override the equals method in the Object class. 
 * Two Circle objects are equal if their radii are the same. 
 * Draw the UML diagram that involves Circle, GeometricObject, and Comparable.
 * GeometricObject already implements Comparable
 * @author Nikola
 *
 */
public class Zadatak01CircleComparable {

	public static void main(String[] args) {
		Circle c1 = new Circle(5); //circle with radius 5
		Circle c2 = new Circle(6); //circle with radius 6
		
		// print message depanding on the equalty of circles
		if(c1.equals(c2)){
			System.out.println("Circles are equal!");
		}
		else {
			System.out.println("Circles are not equal!");
		}
	}

}

class Circle extends GeometricObject {

	// radius of the circle
	private double radius = 1.0;

	public Circle() {

	}

	/** Constructor creates an instance wih defined radius */
	public Circle(double newRadius) {
		radius = newRadius;
	}

	/**
	 * calculating the area of the circle
	 * 
	 * @return area of the circle
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * calculating the perimeter of the circle
	 * 
	 * @return perimeter of the circle
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** overriden toString method */
	@Override
	public String toString() {
		return "Circle radius: " + radius + "\nCircle area: " + getArea()
				+ "\nCircle perimeter: " + getPerimeter();
	}

	/**
	 * If two circle object have the same radius, they are equal
	 * @param o  Circle instance
	 * @return  true if equal, else false
	 */
	public boolean equals(Circle o){
		if( this.radius == o.radius){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}
	

}

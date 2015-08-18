package helpClasses;
/**
 * Circle class
 * @author Nikola Lisicic
 *
 */
public class Circle {
	// radius of the circle
	private double radius = 1.0;

	public Circle () {
		
	}
	
	/** Constructor creates an instance wih defined radius */
	public Circle(double newRadius) {
		radius = newRadius;
	}

	/**
	 * calculating the area of the circle
	 * @return area of the circle
	 */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * calculating the perimeter of the circle
	 * @return  perimeter of the circle
	 */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/** overriden toString method */
	@Override
	public String toString() {
		return "Circle radius: "+radius +"\nCircle area: "+getArea()+"\nCircle perimeter: "+getPerimeter();
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}
}

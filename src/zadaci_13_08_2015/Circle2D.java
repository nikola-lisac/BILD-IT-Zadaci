package zadaci_13_08_2015;


/**
 * 
 * @author Nikola Lisicic Zadatak br. 10.11
 *
 */
public class Circle2D {
	private double x; // x-coordinate of the center of the circle
	private double y; // y-coordinate of the center of the circle
	private double radius; // radius of the circle

	/** default constructor */
	Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	/** Constructor with defined values for x,y and radius */
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * Calculating area
	 * @return area
	 */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * Calculating perimeter
	 * @return perimeter
	 */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/**
	 * Calculating is the specified point inside the circle using the formula 
	 * (x - center_x)^2 + (y - center_y)^2 < radius^2
	 * 
	 * @param x
	 *            x coordinate of the point
	 * @param y
	 *            y coordinate of the point
	 * @return true if the point is inside the circle, false if it isn't
	 */
	boolean contains(double x, double y) {
		if ((Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2)) < Math
				.pow(this.radius, 2)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking if the circle contains specified circle
	 * @param otherCircle  Circle2D instance to check if its inside the calling circle
	 * @return  true if it does contain it, false if it doesn't
	 */
	boolean contains(Circle2D otherCircle){
		double distance = this.distance(otherCircle);
		if(distance +otherCircle.radius <= radius){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Checking if calling circle overlaps with the specified circle
	 * @param otherCircle  Circle2D instance to check for overlaping
	 * @return  true if they overlap, false if the dont
	 */
	boolean overlaps(Circle2D otherCircle) {
		double distance = this.distance(otherCircle);
		if(distance < (this.radius + otherCircle.radius) && Math.abs(radius - otherCircle.radius) <= distance){
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Calculating distance between two circles
	 * @param otherCircle
	 *            Circle2D instance that we want to check the distance in
	 *            relation to calling instance
	 * @return distance between those two circles
	 */
	double distance(Circle2D otherCircle) {
		return Math.sqrt(Math.pow(otherCircle.getY() - this.getY(), 2)
				+ Math.pow(otherCircle.getX() - this.getX(), 2));
	}

	/** getters */
	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getRadius() {
		return radius;
	}
	public static void main(String[] args){
//		Circle2D c1 = new Circle2D(2, 2, 5.5);
//		System.out.println(c1.contains(3,3));
//		System.out.println(c1.contains(new Circle2D(2, 5, 10.5)));
//		System.out.println(c1.overlaps(new
//				Circle2D(3, 5, 2.3)));
		
		Circle2D c1 = new Circle2D(5,6,2);
		Circle2D c2 = new Circle2D(8,9,3);
		Circle2D c3 = new Circle2D(4,6,0.5);
		Circle2D c4 = new Circle2D(13,4,2);
		System.out.println(c1.overlaps(c2));
		System.out.println(c1.contains(c3));
		System.out.println(c1.contains(7,4));
		System.out.println(c1.contains(c4));
		System.out.println(c1.overlaps(c4));
		
	}
}

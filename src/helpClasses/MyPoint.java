package helpClasses;

/**
 * Zadatak br. 10.4 (The MyPoint class) Design a class named MyPoint to
 * represent a point with x- and y-coordinates. The class contains: The data
 * fields x and y that represent the coordinates with getter methods. A no-arg
 * constructor that creates a point (0, 0). A constructor that constructs a
 * point with specified coordinates. A method named distance that returns the
 * distance from this point to a specified point of the MyPoint type. A method
 * named distance that returns the distance from this point to another point
 * with specified x- and y-coordinates.
 */
public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Calculating distance between two MyPoint instances
	 * @param point  MyPoint instance that we want to check the distance in relation to calling instance
	 * @return  distance betwwen those two points
	 */
	public double distance(MyPoint point) {
		return Math.sqrt(Math.pow(point.getY() - this.getY(), 2)
				+ Math.pow(point.getX() - this.getX(), 2));
	}

	/**
	 * Calculating distance between MyPoint instance and another point 
	 * whose coordinates are passed as parametars
	 * @param x  x-coordinate of a point
	 * @param y  y-coordinate of a point
	 * @return   distance betwwen those two points
	 */
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(y - this.getY(), 2)
				+ Math.pow(x - this.getX(), 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
	public static void main(String[] args) {
		MyPoint pointOne = new MyPoint(); //default MyPoint instance (0,0)
		MyPoint pointTwo = new MyPoint(10,30.5); //instance with defined coords
		
		//printing distance
		System.out.printf("Distance between pointOne and pointTwo is: %.4f",pointOne.distance(pointTwo));
	}
}

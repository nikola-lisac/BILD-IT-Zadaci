package zadaci_13_08_2015;


public class MyRectangle2D {
	private double x; //x coordinate 
	private double y; //y coordinate 
	private double height; //height
	private double width; //width

	/** Default constructor */
	MyRectangle2D() {
		x = 0;
		y = 0;
		height = 1;
		width = 1;
	}

	/**Constructor with defined coordinates, width and height of the rectangle */
	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	/**
	 * Calculating area
	 * @return area
	 */
	double getArea() {
		return height * width;
	}

	/**
	 * Calculating perimeter
	 * @return perimeter
	 */
	double getPerimeter() {
		return 2 * (height + width);
	}

	/**
	 * Checking if calling instance contains a specified point
	 * @param x  x-coordinates of the point
	 * @param y  y-coordinates of the point
	 * @return  true if the instance contains the point, false if it doesn't
	 */
	boolean contains(double x, double y) {
		//cordinate of the left edge
		double xLeftEdge = this.getX() - this.width / 2;
		//cordinate of the right edge
		double xRightEdge = this.getX() + this.width / 2;
		////cordinate of the top edge
		double yTopEdge = this.getY() + this.height / 2;
		//cordinate of the bottom edge
		double yBottomEdge = this.getY() - this.height / 2;

		//if the point is between the edges it is inside the rectangle
		return (x < xRightEdge) && (x > xLeftEdge) && (y < yTopEdge)
				&& (y > yBottomEdge) ? true : false;
	}

	/**
	 * Checking if the calling instance contains specified MyRectangle2D instance
	 * @param r MyRectangle2D instance with specified coords, width and height
	 * @return true if calling instance contains r, false if it doesnt
	 */
	boolean contains(MyRectangle2D r) {
		// check if 1 pair of diagonal corner points
		// are contained in this rectangle

		double x1 = r.getX() - (r.getWidth() / 2);
		double y1 = r.getY() + (r.getHeight() / 2);

		double x2 = r.getX() + (r.getWidth() / 2);
		double y2 = r.getY() - (r.getHeight() / 2);
		
		//if diagonal corners are inside, the whole rectangle is contained
		return this.contains(x1, y1) && this.contains(x2, y2) ? true : false;
	}

	/**
	 * Checking if calling rectangle is overlaping with parametar rectangle
	 * @param r  MyRectangle2D instance with specified coords, width and height
	 * @return  true if they overlap, false if they dont
	 */
	boolean overlaps(MyRectangle2D r) {
		//cordinates of the first corner of the parametar's rectangle
		double x1 = r.getX() - (r.getWidth() / 2);
		double y1 = r.getY() + (r.getHeight() / 2);

		//cordinates of the second corner of the parametar's rectangle
		double x2 = r.getX() + (r.getWidth() / 2);
		double y2 = r.getY() - (r.getHeight() / 2);

		//cordinates of the third corner of the parametar's rectangle
		double x3 = r.getX() - (r.getWidth() / 2);
		double y3 = r.getY() - (r.getHeight() / 2);

		//cordinates of the fourth corner of the parametar's rectangle
		double x4 = r.getX() + (r.getWidth() / 2);
		double y4 = r.getY() + (r.getHeight() / 2);

		//checking if calling rectangle has any of the corners inside itself
		boolean corner1Overlaps = this.contains(x1, y1);
		boolean corner2Overlaps = this.contains(x2, y2);
		boolean corner3Overlaps = this.contains(x3, y3);
		boolean corner4Overlaps = this.contains(x4, y4);

		//if it does contain any of the corners they overlap
		return corner1Overlaps || corner2Overlaps || corner3Overlaps
				|| corner4Overlaps ? true : false;
	}
	
	/** getters and setters */

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getHeight() {
		return height;
	}

	double getWidth() {
		return width;
	}

	void setX(double x) {
		this.x = x;
	}

	void setY(double y) {
		this.y = y;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void setWidth(double width) {
		this.width = width;
	}

	public static void main(String[] args) {
		//new MyRectangle2D instance
		MyRectangle2D recOne = new MyRectangle2D(2, 2, 5.5, 4.9);
		//print area
		System.out.printf("Area of the rectangle is: %.2f", recOne.getArea());
		System.out.println();
		//print perimeter
		System.out.printf("Perimeter of the rectangle is: %.2f",
				recOne.getPerimeter());

		//checking if the rectangle contains a point
		System.out.println("\nRectangle contains point (3,3): "
				+ recOne.contains(3, 3));
		//checking if the rectangle contains another rectangle
		System.out.println("Rectangle containse rectangle (4, 5, 10.5, 3.2): "
				+ recOne.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		//checking if the rectangle overlaps another rectangle
		System.out.println("Rectangle overlaps rectangle (3, 5, 2.3, 5.4): "
				+ recOne.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
		
	}

}

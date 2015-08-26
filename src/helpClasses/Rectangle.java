package helpClasses;

public class Rectangle extends GeometricObject {

	double width = 1;
	double height = 1;
	
	/** default constructor */
	Rectangle() {

	}
	/** constructor with defined width and height*/
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	/** implemented abstract getArea method from GeometricObject */
	public double getArea() {
		return width * height;
	}

	/** implemented abstract getPerimeter method from GeometricObject */
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public String toString(){
		return "Rectangle width: "+width + "\nRectangle height: "+height +"\nRectangle area: "+this.getArea();
	}
}

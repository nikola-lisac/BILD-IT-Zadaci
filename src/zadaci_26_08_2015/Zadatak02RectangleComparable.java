package zadaci_26_08_2015;

import helpClasses.GeometricObject;

/**
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal
 * if their areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable
 * @author Nikola
 *
 */
public class Zadatak02RectangleComparable {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(1,5); // rectangle with width 1, height 5
		Rectangle r2 = new Rectangle(2,5); //rectangle with width 2, height 5
		
		// print message depending on their equality
		if(r1.equals(r2)){
			System.out.println("Rectangles are equal.");
		}
		else {
			System.out.println("Rectangles are not equal.");
		}
	}

}

class Rectangle extends GeometricObject {
	
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
	
	/**
	 * Checking if calling instance is equal to some other instance of Rectangle
	 * they are equal if their areas are the same
	 * @param o other instance of rectangle
	 * @return  true if they are equal, false otherwise
	 */
	public boolean equals(Rectangle o){
		if(this.getArea() == o.getArea()){
			return true;
		}
		else {
			return false;
		}
	}
}

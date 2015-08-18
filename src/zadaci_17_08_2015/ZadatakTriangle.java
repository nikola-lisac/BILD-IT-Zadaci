package zadaci_17_08_2015;

import helpClasses.Methods;

import java.util.Date;
import java.util.Scanner;
/**
 * Write a test program that prompts the user to enter :
 * three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. 
 * The program should create a Triangle object with these sides and 
 * set the color and filled properties using the input. 
 * The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * @author Nikola Lisicic
 *
 */
public class ZadatakTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle: ");
		//entering 3 sides of the triangle using protected method from Methods class
		double side1 = Methods.inputDouble();
		double side2 = Methods.inputDouble();
		double side3 = Methods.inputDouble();
		
		System.out.print("Enter the color of the triangle: ");
		//color of the triangle
		String color = input.nextLine();
		
		System.out.print("Is the triangle filled (true/false): ");
		//is the triangle filled
		boolean filled = input.nextBoolean();
		input.close();
		
		//creating triangle object with specified properties
		Triangle triangle = new Triangle (color,filled,side1,side2,side3);
		
		//printing area, perimeter, color and isFilled of the triangle
		System.out.printf("\nArea: %.2f",triangle.getArea());
		System.out.println("\nPerimeter: "+triangle.getPerimeter());
		System.out.println("Color: "+triangle.getColor());
		System.out.println("Is filled? "+triangle.isFilled());
		
	}

}

/**
 * Triangle class which extends GeometricObject, with data fiels representing sides of the triangle.
 * Methods getArea and getPerimeter calculate and returns the area and  the perimeter of the triangle 
 */
class Triangle extends GeometricObject {
	
	//sides of the triangle
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/** Constructor which creates default triangle */
	Triangle(){
		
	}
	
	/** Constructor which creates a triangle with specified length of the sides */
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Constructor which creates a triangle with specified 
	 *  sides, color and the condition on is the triangle filled or not  
	 */
	Triangle(String color, boolean isFilled, double side1, double side2, double side3) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**
	 * Calculate the area of the triangle
	 * @return  area
	 */
	public double getArea() {
		double s = getPerimeter() / 2;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/**
	 * Calculate the perimeter of the triangle
	 * @return perimeter
	 */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Overriden toString method */
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}
	
	
	
	/** Getters for all sides */

	double getSide1() {
		return side1;
	}

	double getSide2() {
		return side2;
	}

	double getSide3() {
		return side3;
	}
	
	
	
	
}

/**
 * Geometric object class with the data fiels: color of the object, is the object filled and
 * date when the object is created
 */
class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Default constructor */
	public GeometricObject() {
		dateCreated = new Date();
	}

	/** Constructor which creates an object with specifed color and the condition in it's filling */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** overriden toString method */
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}
	
	
	/** Getters and setters for data fields */
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

}


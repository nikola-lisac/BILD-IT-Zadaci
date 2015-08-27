package zadaci_26_08_2015;

import helpClasses.GeometricObject;

/**
 * (Sum the areas of geometric objects) Write a method that sums the areas of all the geometric objects in an array. 
 * The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects 
 * (two circles and two rectangles) and computes their total area using the sumArea method.
 * @author Nikola
 *
 */
public class Zadatak04SumOfArea {
	
	/**
	 * Calculating sum of areas of the GeometricObject instances in the array a
	 * @param a array of GeometricObject instances
	 * @return sum
	 */
	public static double sumArea(GeometricObject[] a){
		double sum = 0; // variable to store sum of areas
		
		// find sum of each GeometricObject instance in the array and add it to the sum
		for(GeometricObject o: a){
			sum += o.getArea();
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		GeometricObject c1 = new Circle(5); // circle with radius 5
		GeometricObject c2 = new Circle(2); // circle with radius 2
		GeometricObject r1 = new Rectangle(2,3); // rectangle with side lengths 2 and 3
		GeometricObject r2 = new Rectangle(3,6); // rectangle with side lengths 3 and 6
		
		GeometricObject[] array = {c1,c2,r1,r2}; // array of GeometricObject-s
		
		// printing individual areas
		for(GeometricObject o: array){
			if(o instanceof Circle) {
				System.out.printf("\nArea of the circle is: %.2f",o.getArea());
			} else {
				System.out.printf("\nArea of the rectangle is: %.2f",o.getArea());
			}
		}
		
		//printing sum of areas
		System.out.printf("\nSum of areas of two circles and two rectangles: %.2f",sumArea(array));
	}

}

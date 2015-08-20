package zadaci_20_08_2015;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Area of a convex polygon) A polygon is convex if it contains any line
 * segments that connects two points of the polygon. Write a program that
 * prompts the user to enter the number of points in a convex polygon, then
 * enter the points clockwise, and display the area of the polygon.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak01AreaOfPolygon {

	/**
	 * Calculating the area of the convex polygon using the formula: area = |
	 * ((x1*y2 - y1*x2)+(x2*y3 - y2*x3)+...+(xn*y1 - yn*x1)) / 2|
	 * 
	 * @param points
	 *            coordinates of the points of the polygon
	 * @return area
	 */
	public static double getArea(double[][] points) {
		// x coordinates of points
		ArrayList<Double> x = new ArrayList<Double>();
		// y coordinates of points
		ArrayList<Double> y = new ArrayList<Double>();
		// entering coordinates in the list from 2D array
		for (int k = 0; k < points.length; k++) {
			x.add(points[k][0]);
			y.add(points[k][1]);

		}

		// variable to store sum (x1*y2 - y1*x2)+(x2*y3 - y2*x3)+...+(xn*y1 - yn*x1)
		double sum = 0;
		//calculating sum of dividend
		for (int i = 0; i < x.size(); i++) {
			if (i == x.size() - 1) {
				sum += (x.get(i) * y.get(0) - y.get(i) * x.get(0));
			} else {
				sum += (x.get(i) * y.get(i + 1) - y.get(i) * x.get(i + 1));
			}
		}
		//calculating area
		double area = Math.abs(sum / 2);
		//returning area
		return area;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of points: ");
		int numberOfPoints = input.nextInt(); //number of points of the polygon
		double[][] points = new double[numberOfPoints][2]; //coordinates of the points
		//entering coordinates of the points
		System.out.println("Enter coordinates of the points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		//geting area
		double area = getArea(points);
		//printing area
		System.out.printf("\nArea: %.4f",area);
	}

}

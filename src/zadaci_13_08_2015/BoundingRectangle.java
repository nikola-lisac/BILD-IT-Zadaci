package zadaci_13_08_2015;

import java.util.Scanner;
/**
 * Zadatak 10.15
 * @author Nikola Lisicic
 *
 */
public class BoundingRectangle {
	/**
	 * Calculating the center of the rectangle, it's width and height 
	 * based on 5 points of the rectangle
	 * @param points 5 points of the rectangle
	 * @return MyRectangle2D object with calculated center coordinates, width and height
	 */
	public static MyRectangle2D getRectangle(double[][] points) {

		// max and min x-coordinate
		double xMax = points[0][0];
		double xMin = points[0][0];

		// max and min y-coordinate
		double yMax = points[0][1];
		double yMin = points[0][1];

		// finding max and min coordinates
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > xMax) {
				xMax = points[i][0];
			}
			if (points[i][0] < xMin) {
				xMin = points[i][0];
			}
			if (points[i][1] > yMax) {
				yMax = points[i][1];
			}
			if (points[i][1] < yMin) {
				yMin = points[i][1];
			}
		}

		// width is the difference between max and min x-coordinates
		double width = xMax - xMin;
		// height is the difference between max and min y-coordinates
		double height = yMax - yMin;

		//x coordinate of the center
		double xCenter = xMax - (width / 2);
		//y coordinate of the center
		double yCenter = yMax - (height / 2);

		return new MyRectangle2D(xCenter, yCenter, width, height);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];

		System.out.println("Enter five points: ");
		//entering the coordinates of 5 points that belong to a rectangle
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		input.close();

		//getting rectangle object
		MyRectangle2D rectangle = getRectangle(points);
		//printing its properties
		System.out.println("The bounding rectangle's center ("
				+ rectangle.getX() + ", " + rectangle.getY() + "), width "
				+ rectangle.getWidth() + ", height " + rectangle.getHeight());
	}

}

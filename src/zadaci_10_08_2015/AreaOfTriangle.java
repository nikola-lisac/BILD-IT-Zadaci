package zadaci_10_08_2015;

import java.util.Scanner;

/*
 * Zadatak 8.32
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle using the following header:
 * public static double getTriangleArea(double[][] points)
 * The points are stored in a 3-by-2 two-dimensional array points 
 * with points[0][0] and points[0][1] for (x1, y1). 
 * The triangle area can be computed using the formula in Programming Exercise 2.19. 
 * The method returns 0 if the three points are on the same line. 
 * Write a program that prompts the user to enter three points of a triangle and displays the triangle's area
 * area of a triangle given the coordinates of the three vertices
 * area = |(ax*(by-cy) + bx(cy - ay) + cx(ay- by))/2|
 */
public class AreaOfTriangle {

	/*
	 * Metoda racuna povrsinu trougla na osnovu koordinata njegovih tjemena 
	 * koje su smjestene u 2d matricu points
	 * Formula je: area = |(ax*(by-cy) + bx(cy - ay) + cx(ay- by))/2|
	 * gdje je ax = x1, ay = y1,...
	 * |...| znaci da je apsolutna vrijednost
	 * Metoda vraca izracunatu povrsinu
	 */
	public static double getTriangleArea(double[][] points) {
		
		//racunanje povrsine trougla po formuli
		double area = Math.abs((points[0][0] * (points[1][1] - points[2][1])
				+ points[1][0] * (points[2][1] - points[0][1]) + points[2][0]
				* (points[0][1] - points[1][1])) / 2);
		
		//vracanje povrsine
		return area;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[3][2];
		
		System.out.print("Enter three points for a triangle: ");
		
		//smjestanje koordinata tjemena u 2d niz
		for(int i = 0;i<points.length;i++){
			for(int j = 0;j<points[i].length;j++){
				points[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		//dobije povrsine pomocu metode za racunanje
		double area = getTriangleArea(points);
		
		//ako je povrsina nula, tjemena su na istoj liniji
		if(area==0){
			System.out.println("The three points are on the same line.");
		}
		
		//ako nije 0, isisuje povrsinu trougla
		else {
			System.out.printf("The area of the triangle: %.2f",area);
		}
	}

}

package zadaci_10_08_2015;

import java.util.Scanner;

/*
 * Zadatak br.8.31
 * (Geometry: intersecting point) Write a method that returns the intersecting point of two lines. 
 * The intersecting point of the two lines can be found by using the formula  shown in Programming Exercise 3.25. 
 * Assume that (x1, y1) and (x2, y2) are the two points on line 1 and 
 * (x3, y3) and (x4, y4) are on line 2. 
 * The method header is public static double[] getIntersectingPoint(double[][] points)
 * The points are stored in a 4-by-2 two-dimensional array points with (points[0][0], points[0][1]) for (x1, y1). 
 * The method returns the intersecting point or null if the two lines are parallel.
 * Write a program that prompts the user to enter four points and displays the intersecting point
 * The intersecting point can be found by solving linear equation:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * System of linear equations:
 *  a1x + b1y = c1
 *  a2x + b2y = c2
 * x =c1 * b2 - c2 * b1 / a1 * b2 - b1 *a2
 * y =c2 * a1 - c1 * a2 / a1 * b2 - b1 *a2
 */
public class IntersectingPoint {
	
	/*
	 * Metoda za racunanje tacke presjeka dve prave
	 * koordinate tacaka pravih su date u dvodimenzionalnom nizu koje je prosljedjen kao parametar
	 * metoda vraca niz u kome se nalaze x i y koordinate presjecne tacke
	 * odnosno vraca null ako nema presjecne tacke
	 */
	public static double[] getIntersectingPoint(double[][] points) {

		/*
		 * Racunanje vrijednosti za dobijanje sistema linearnih jednacina cije rjesenje je tacka presjeka dvije linije
		 */
		
		// c1 = (y1 - y2)x1 - (x1 - x2)y1
		double c1 = (points[0][1] - points[1][1]) * points[0][0]
				- (points[0][0] - points[1][0]) * points[0][1];

		// c2 = (y3 - y4)x3 - (x3 - x4)y3
		double c2 = (points[2][1] - points[3][1]) * points[2][0]
				- (points[2][0] - points[3][0]) * points[2][1];

		// a1 = (y1 - y2)
		double a1 = points[0][1] - points[1][1];

		// b1 = (x1 - x2)
		double b1 = points[0][0] - points[1][0];

		// a2 = (y3 - y4)
		double a2 = points[2][1] - points[3][1];

		// b2 = (x3 - x4)
		double b2 = points[2][0] - points[3][0];

		double divisor = a1 * b2 - b1 * a2;// djelilac se izracunava po ovoj formuli i zajednicki je za x i y

		if (divisor != 0) {
			// x koordinata presjeka
			double x = (c1 * b2 - c2 * b1) / divisor;

			// y koordinata presjeka
			double y = (c2 * a1 - c1 * a2) / divisor;

			// rezultat (niz sa koordinatama
			double[] xy = { x, y };

			return xy;
		}
		//ako je divisor nula, linije se ne presjecaju
		else {
			return null;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[4][2];
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		//smjestanje koordinata tacki koje pripadaju linijama u matricu
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		//smjestamo koordinate tacke presjeka u niz
		double[] coordinates = getIntersectingPoint(points);
		
		//ako je niz sa koordinatama null, linije su paralelne
		if (coordinates == null) {
			System.out.println("The lines are parallel.");
		} 
		//ako nije, ispisujemo presjecnu tacku
		else {
			System.out.printf("Intersecting point is at: (%.4f,%.4f)",coordinates[0],coordinates[1]);
		}
	}

}

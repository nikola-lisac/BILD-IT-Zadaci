package zadaci_10_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 8.30
 * (Algebra: solve linear equations) Write a method that solves the following
 * 2 * 2 system of linear equations:
 * a00x + a01y = b0
 * a10x + a11y = b1
 * x =b0 * a11 - b1 * a01 / a00 * a11 - a01 *a10
 * y =b1 * a00 - b0 * a10 / a00 * a11 - a01 *a10
 * The method header is
 * public static double[] linearEquation(double[][] a, double[] b)
 * The method returns null if a00a11 - a01a10 is 0. 
 * Write a test program that prompts the user to enter a00, a01, a10, a11, b0, and b1, 
 * and displays the result. 
 * If a00a11 - a01a10 is 0, report that “The equation has no solution.”
 */
public class LinearEquations {
	
	/*
	 * Metoda rjesava sistem linearnih jednacina prema Kramerovom pravilu
	 * Metoda vraca jednodimenzionalni niz, u kome je vrijednost x na indeksu 0, a y na indeksu 1,
	 * ako sistem ima rjesenje, odnosno vraca null ako sistem nema rijesenje
	 * Sistem nema rjesenje ako je divisor = a[0][0] * a[1][1] - a[0][1] * a[1][0] jednak nuli
	 */
	public static double[] linearEquation(double[][] a, double[] b) {
		double x;//rjesenje po x
		double y;//rjesenje po y
		
		//djelilac (ako je nula sistem nema rjesenje)
		double divisor = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		
		if (divisor == 0.0) {
			return null;
		} else {
			// x prema kramerovom pravilu
			x = (b[0] * a[1][1] - b[1] * a[0][1]) / divisor;

			// y prema kramerovom pravilu
			y = (b[1] * a[0][0] - b[0] * a[1][0]) / divisor;
			
			//niz sa x i y vrijednostima
			double[] xy = {x,y};
			
			//vracanje niza
			return xy;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] a = new double[2][2];//niz sa a parametrima
		double[] b = new double[2];//niz sa b parametrima
		
		System.out.print("Enter \"a\" coeficients for both linear equations: ");
		
		//unosenje a parametara u dvodimenzionalni niz
		for(int i = 0; i<a.length;i++){
			for(int j = 0;j<a[0].length;j++){
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter \"b\" coeficients for both equations: ");
		
		//unosenje b parametara u jednodimenzionalni niz
		for(int i=0;i<b.length;i++){
			b[i] = input.nextDouble();
		}
		
		input.close();
		
		//niz koji sadrzi rjesenja sistema jednacina
		double[] result = linearEquation(a, b);
		
		//ako je rezultat null, jednacine nemaju rjesenje
		if(result == null){
			System.out.println("The equations have no solution.");
		}
		
		//ako nije, ispisujemo rjesenje
		else {
		System.out.println("x = "+result[0]+"\ny = "+result[1]);
		}
	}

}

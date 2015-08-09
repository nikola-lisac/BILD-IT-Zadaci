package zadaci_09_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 8.26
 * Implement the following method to sort the rows in a twodimensional array. 
 * A new array is returned and the original array is intact.
 * public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix. 
 */
public class SortingRows {

	/*
	 * Metoda sortira proslijedjenu matricu po redovima i vraca sortiranu matricu
	 */
	public static double[][] sortRows(double[][] m) {

		for (int row = 0; row < m.length; row++) {//prolazi svaki red
			for (int column = 0; column < m[0].length; column++) {//prolazi svaki kolonu
				for (int nextColumn = column + 1; nextColumn < m[0].length; nextColumn++) {//prolazi sledecu kolonu u redu
					
					//ako je element sledece kolone manji od elementa trenutne kolone, mijenja im mjesta
					if (m[row][nextColumn] < m[row][column]) {
						double temp = m[row][column];
						m[row][column] = m[row][nextColumn];
						m[row][nextColumn] = temp;
					}
				}
			}
		}
		//vraca sortiranu matricu
		return m;

	}

	/*
	 * metoda stampa proslijedjenu matricu
	 */
	public static void printMatrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];//matrica 3*3
		
		System.out.println("Enter a 3-by-3 matrix: ");
		//unos elemenata u matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		//novoj matrici dodjeljujemo vrijednost sortiranje originalne matrice
		double[][] sortedMatrix = sortRows(matrix);
		
		//printamo sortiranu matricu
		printMatrix(sortedMatrix);
	}

}

package zadaci_07_08_2015;

import java.util.Scanner;

/*
 * Zadatak 8.1
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 */
public class SumElementsInColumn {

	/*
	 * Metoda racuna i vraca sumu svih elemenata matrice m u koloni columnIndex
	 */
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;//suma
		
		for (int row = 0; row < m.length; row++) {//prolazi kroz sve redove
			
			for (int column = 0; column < m[row].length; column++) {//prolazi sve kolone
				
				if (column == columnIndex) {//ako je broj kolone jednak prosledjenom indeksu
					
					sum += m[row][column];//sabira element te kolone sa prethodnim iznosom sume
				}
			}
		}
		
		//vracanje sume
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];//matrica
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		//unos elemenata u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		input.close();
		
		//ispis rezultata sume svake kolone
		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of the elements at column " + i + " is: "
					+ sumColumn(matrix, i));

		}
	}

}

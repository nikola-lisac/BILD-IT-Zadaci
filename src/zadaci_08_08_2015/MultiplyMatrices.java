package zadaci_08_08_2015;
/*
 * Zadatak br. 8.6
 * Write a method to multiply two matrices. The header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 */
import java.util.Scanner;

public class MultiplyMatrices {

	/*
	 * Metoda pravi novu matricu ciji je broj redova rows, a broj kolona columns
	 * i popunjava je unosom iz konzole Metoda vraca unesenu matricu
	 */
	public static double[][] enterAMatrix(int rows, int columns) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[rows][columns];

		System.out.println("Enter " + rows + "-by-" + columns + " matrix: ");

		// unosenje vrijednosti u matricu
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				matrix[row][column] = input.nextDouble();
			}
		}

		// vracanje matrice
		return matrix;
	}

	/*
	 * Metoda mnozi dve matrice koje smo proslijedjene kao parametri a i b,
	 * pravi trecu matricu od sume proizvoda elemenata i vraca je
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		// matrica cije je duzina jednaka duzini prve matrice
		double[][] matrix = new double[b.length][a[0].length];

		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < b[row].length; column++) {
				for (int k = 0; k < a[0].length; k++)
					matrix[row][column] += a[row][k] * b[k][column];
			}
		}

		// vracanje matrice
		return matrix;
	}

	/*
	 * metoda stampa proslijedjenu matricu
	 */
	public static void printMatrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%.1f ", matrix[row][column]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// prva matrica
		double[][] matrixOne = enterAMatrix(3, 3);

		// druga matrica
		double[][] matrixTwo = enterAMatrix(3, 3);

		// matrica koja je rezultat mnozenja dve matrice
		double[][] multipliedMatrix = multiplyMatrix(matrixOne, matrixTwo);

		// stampanje matrica i rezultantne matrice
		System.out.println();
		printMatrix(matrixOne);
		System.out.println("     *");
		printMatrix(matrixTwo);
		System.out.println("     = ");
		printMatrix(multipliedMatrix);

	}

}

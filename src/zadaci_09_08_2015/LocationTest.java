package zadaci_09_08_2015;
/*
 * Zadatak 9.13
 * Write a test program that prompts the user to enter a two-dimensional array 
 * and displays the location of the largest element in the array.
 */
import java.util.Scanner;

public class LocationTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and column in the matrix: ");
		int numOfRows = input.nextInt();//broj redova
		int numOfColumns = input.nextInt();//broj kolona

		double[][] matrix = new double[numOfRows][numOfColumns];//nova matrica sa tim brojem redova i kolona
		System.out.println("Enter the matrix: ");
		// unos elemenata u matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();

		//lokacija i vrijednosti najveceg elementa matrice
		Location location = Location.locateLargest(matrix);
		
		//stampanje lokacije i vrijednosti najveceg elementa
		System.out.println("The location of the largest element is "
				+ location.maxValue + " at (" + location.row + ","
				+ location.column + ")");

	}

}

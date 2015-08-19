package zadaci_18_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;

/**
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with
 * the most 1s. (Hint: Use two ArrayLists to store the row and column indices
 * with the most 1s.)
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak01LargestRowsAndColumns {

	/**
	 * Finding indices of rows with the largest number of 1's in the 2D array
	 * and adding them to the array list
	 * 
	 * @param matrix
	 *            2D array to go through and find index or indices of row/s with
	 *            the largest number of 1's
	 * @return array list consisted of indices of the rows with most 1's
	 */
	public static ArrayList<Integer> findRowsIndicesWithMostOnes(int[][] matrix) {
		int numberOfOnes = 0;
		int maxNumberOfOnes = 0;
		ArrayList<Integer> rowIndex = new ArrayList<>();
		// finding the indices of the rows with largest numbers of 1's
		for (int i = 0; i < matrix.length; i++) {
			numberOfOnes = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					numberOfOnes++;
				}
			}
			
			if (numberOfOnes > maxNumberOfOnes) {
				maxNumberOfOnes = numberOfOnes;
				rowIndex.clear();
				rowIndex.add(i);
			} else if (numberOfOnes == maxNumberOfOnes) {
				rowIndex.add(i);
			}

		}

		return rowIndex;
	}

	/**
	 * Finding indices of columns with the largest number of 1's in the 2D array
	 * and adding them to the array list
	 * 
	 * @param matrix
	 *            2D array to go through and find index or indices of column/s
	 *            with the largest number of 1's
	 * @return array list consisted of indices of the columns with most 1's
	 */
	public static ArrayList<Integer> findColumnIndicesWithMostOnes(
			int[][] matrix) {
		int numberOfOnes = 0;
		int maxNumberOfOnes = 0;
		ArrayList<Integer> columnIndex = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			numberOfOnes = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[j][i] == 1) {
					numberOfOnes++;
				}
			}
			if (numberOfOnes > maxNumberOfOnes) {
				maxNumberOfOnes = numberOfOnes;
				columnIndex.clear();
				columnIndex.add(i);
			} else if (numberOfOnes == maxNumberOfOnes) {
				columnIndex.add(i);
			}
		}

		return columnIndex;
	}

	/** main method */
	public static void main(String[] args) {
		System.out.print("Enter the array size n: ");
		int n = Methods.inputInt(); // length of the 2D array
		int[][] matrix = new int[n][n];

		System.out.println("\nThe random array is: ");
		// filling the matrix with 0's and 1's and printing it
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

		// array list consisted of indices of rows with most 1's
		ArrayList<Integer> maxRowIndices = findRowsIndicesWithMostOnes(matrix);
		// array list consisted of indices of columns with most 1's
		ArrayList<Integer> maxColumnIndices = findColumnIndicesWithMostOnes(matrix);

		System.out.print("\nThe largest row index: ");
		// printing array list of indices of rows using a method from class
		// Methods
		Methods.printArrayList(maxRowIndices);

		System.out.print("\nThe largest column index: ");
		// printing array list of indices of columns using a method from class
		// Methods
		Methods.printArrayList(maxColumnIndices);

	}

}

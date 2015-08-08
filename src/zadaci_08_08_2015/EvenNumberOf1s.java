package zadaci_08_08_2015;
/*
 * Zadatak br. 8.22
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s.
 */
public class EvenNumberOf1s {
	
	/*
	 * Metoda generise 6*6 matricu, smjesta 0 i 1 u nju i vraca je
	 */
	public static int[][] generateMatrix() {
		int[][] matrix = new int[6][6];

		// unosenje vrijednosti u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}

		// vracanje matrice
		return matrix;
	}
	
	/*
	 * Metoda provjerava da li postoji jednak broj jedinica u svakom redu i koloni matrice
	 * i zavisno od toga printa poruku
	 */
	public static void evenOnes(int[][] matrix){
		int sumRow = 0;//suma reda
		int sumColumn = 0;//suma kolone
		boolean even = true;
		for (int row = 0; row < matrix.length; row++) {
			
			//racunanje sume u redu i koloni
			for (int column = 0; column < matrix[row].length; column++) {
				sumRow += matrix[row][column];
				sumColumn += matrix[column][row];
			}
			
			//ako suma reda ili kolone nije djeljiva sa 2 znaci da nema jednak broj jedinica
			if(sumRow % 2!=0 || sumColumn % 2!=0){
				even = false;
				break;
			}
			sumRow = 0;
			sumColumn = 0;
			
		}
		if(even){// zavisno od rezultata printamo poruku i matricu
			System.out.println("Number of 1s in rows and columns is even");
			printMatrix(matrix);
		}
		else {
			System.out.println("Number of 1s in rows and columns is not even");
		}
	}
	
	/*
	 * metoda stampa proslijedjenu matricu
	 */
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
			int[][] matrix = generateMatrix();
			evenOnes(matrix);
			
		
	}

}

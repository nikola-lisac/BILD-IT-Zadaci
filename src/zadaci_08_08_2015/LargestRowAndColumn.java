package zadaci_08_08_2015;

/*
 * Zadatak br. 8.10
 *  Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix,
 *  prints the matrix, and finds the first row and column with the most 1s
 */
public class LargestRowAndColumn {

	/*
	 * Metoda generise 4*4 matricu, smjesta 0 i 1 u nju i vraca je
	 */
	public static int[][] generateMatrix() {
		int[][] matrix = new int[4][4];

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

	public static void findLargestRowAndColumn(int[][] matrix) {

		int rowIndex = 0;//indeks najveceg reda
		int sumRow = 0;//suma najveceg reda
		
		int columnIndex = 0;//indeks najvece kolone
		int sumColumn = 0;//suma najvece kolone
		
		/*
		 * postavljanje sume najveceg reda na nulti red, a
		 * najvece kolone na nultu kolonu
		 */
		for (int i = 0; i < matrix[0].length; i++) {
			sumRow += matrix[0][i];
			sumColumn += matrix[i][0];
		}

		for (int row = 0; row < matrix.length; row++) {
			int sumRowTemp = 0;//privremena suma redova
			int sumColumnTemp = 0;//privremena suma kolona
			
			//racunanje sume u redu i koloni
			for (int column = 0; column < matrix[row].length; column++) {
				sumRowTemp += matrix[row][column];
				sumColumnTemp += matrix[column][row];
			}
			
			/*
			 * ako je suma u trenutnom redu veca od najvece sume u redu
			 * postavljamo najvecu sumu na trenutnu
			 * a najveci red na trenutni red
			 */
			if (sumRowTemp > sumRow) {
				sumRow = sumRowTemp;
				rowIndex = row;
			}
			
			/*
			 * ako je suma u trenutnoj koloni veca od najvece sume u koloni
			 * postavljamo najvecu sumu na trenutnu
			 * a najvecu kolonu na trenutnu kolonu
			 */
			
			if (sumColumnTemp > sumColumn) {
				sumColumn = sumColumnTemp;
				columnIndex = row;
			}
		}

		//printanje indeksa najveceg reda i kolone
		System.out.println("Largest row index: " + rowIndex);
		System.out.println("Largest column index: " + columnIndex);

	}

	public static void main(String[] args) {
		int[][] matrix = generateMatrix();//genirisanje matrice
		printMatrix(matrix);//stampanje matrice
		findLargestRowAndColumn(matrix);//stampanje indeksa najveceg reda i kolone
	}

}

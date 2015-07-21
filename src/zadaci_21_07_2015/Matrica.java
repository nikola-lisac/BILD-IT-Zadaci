package zadaci_21_07_2015;
/*
 * Zadatak br. 4
 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
 * public static void printMatrix(int n)
 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno.
 * Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
 */
import java.util.Scanner;

public class Matrica {
	/*
	 * metoda za generesinje i stampanje matrice n*n
	 * ciji su elementi nasumicno generisane nule ili jedinice
	 */
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];//deklarisanje matrice ciji je broj redova i broj kolona jednak broju n
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 2);//dodjeljivanje 0 ili 1 elementu matrice
				System.out.print(matrix[i][j] + " ");//stampanje elemenata matrice
			}
			System.out.println();//prelazak u novi red
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite duzinu kvadratne matrice: ");
		int n = input.nextInt();//duzina matrice
		input.close();
		printMatrix(n);//pozivanje metode za stampanje matrice
	}

}

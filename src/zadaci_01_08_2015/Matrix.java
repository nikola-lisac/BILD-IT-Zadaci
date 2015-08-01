package zadaci_01_08_2015;
/*
 * Zadatak br. 5
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom:
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n 
 * te mu ispiše n x n matricu u konzoli.
 */
import java.util.Scanner;

public class Matrix {
	
	/*
	 * metoda za generesinje i stampanje matrice n*n
	 * ciji su elementi nasumicno generisane nule ili jedinice
	 */
	public static void printMatrix(int n) {
		
		//deklarisanje matrice ciji je broj redova i broj kolona jednak broju n
		int[][] matrix = new int[n][n];
		
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

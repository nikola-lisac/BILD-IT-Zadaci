package zadaci_09_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 8.28
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 *  identical if their corresponding elements are equal. 
 *  Write a method that returns true if m1 and m2 are strictly identical, 
 *  using the following header:
 *  public static boolean equals(int[][] m1, int[][] m2)
 *  Write a test program that prompts the user to enter two 3 * 3 arrays of
 *  integers and displays whether the two are strictly identical
 */
public class IdenticalArrays {

	/*
	 * Metoda provjerava da li su proslijedjeni 2D nizovi striktno jednaki,
	 * odnosno da li su im sve vrijednosti na istim pozicijama jednake
	 * Metoda vraca true, ako jesu jednaki, odnosno false ako nisu
	 */
	public static boolean equals(int[][] m1, int[][] m2) {
		
		for (int i = 0; i < m1.length; i++) {
			
			for (int j = 0; j < m1[i].length; j++) {
				
				/*
				 * ako element prvog niza na lokaciji i,j nije jednak elementu drugog niza na istoj lokaciji
				 * onda nizovi nizu jednaki
				 */
				if (m1[i][j] != m2[i][j]) {
					return false;
				}

			}
		}
		return true;
	}
	
	/*
	 * Metoda provjerava da li proslijedjeni 2D nizovi imaju isti broj redova i kolona
	 * ako imaju, vraca true, ako nemaju vraca false
	 */
	public static boolean sameDimensions(int[][] m1,int[][] m2){
		boolean areSameDimensions=false;
		
		if(m1.length == m2.length){
			for(int i = 0;i < m1.length;i++){
				if(m1[i].length != m2[i].length){
					areSameDimensions=false;
					break;
				}
				else {
					areSameDimensions = true;
				}
			}
		}
		else {
			areSameDimensions=false;
		}
		return areSameDimensions;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrixOne = new int[3][3];//prva matrica 3*3
		int[][] matrixTwo = new int[3][3];//druga matrica 3*3
		
		System.out.println("Enter first 3-by-3 matrix: ");
		//unos elemenata u prvu matricu
		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixOne[i].length; j++) {
				matrixOne[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter second 3-by-3 matrix: ");
		//unos elemenata u drugu matricu
		for (int i = 0; i < matrixTwo.length; i++) {
			for (int j = 0; j < matrixTwo[i].length; j++) {
				matrixTwo[i][j] = input.nextInt();
				}
		}
		input.close();
		
		if(sameDimensions(matrixOne,matrixTwo)){//ako su matrice istih dimenzija
			
			if (equals(matrixOne, matrixTwo)){//ako su matrice identicne ispisuje poruku da jesu
				System.out.println("The two matrices are identical.");
			}
			
			
			else {//ako nisu identicne, ispisuje da nisu
				System.out.println("The two matrices are not identical.");
			}
		}
		
		//ako nemaju site dimenzije
		else {
			System.out.println("The two matrices don't have the same dimensions.");
		}
		
		
	}

}

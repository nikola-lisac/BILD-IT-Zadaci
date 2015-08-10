package zadaci_10_08_2015;

import java.util.Arrays;
import java.util.Scanner;

/*
 * zadatak br. 8.29
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they have the same contents. 
 * Write a method that returns true if m1 and m2 are identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * and displays whether the two are identical.
 */
public class IdenticalArrays {

	/*
	 * Metoda provjerava da li su dve matrice iz parametara identicne i vraca
	 * true, ako jesu, odnosno false, ako nisu
	 */
	public static boolean equals(int[][] m1, int[][] m2) {
		int[] arrayOne = new int[m1.length * m1[0].length];//jednodimenzionalni niz u koji cemo smjestiti prvu matricu
		int[] arrayTwo = new int[m2.length * m2[0].length];//jednodimenzionalni niz u koji cemo smjestiti drugu matricu
		
		//ako duzine su duzine nizova razlicite, sigurno nisu jednaki
		if (arrayOne.length != arrayTwo.length) {
			return false;
		}

		//ubacujemo vrijednosti obe matrice u jednodimenzionalne nizove
		for (int i = 0, count = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				arrayOne[count] = m1[i][j];
				arrayTwo[count] = m2[i][j];
				count++;
			}
		}
		
		//sortiramo prvi niz
		Arrays.sort(arrayOne);
		//sortiramo drugi niz
		Arrays.sort(arrayTwo);
		
		//ako su nizovi jednaki vracamo true
		if(Arrays.toString(arrayOne).equals(Arrays.toString(arrayTwo))){
			return true;
		}
		//ako nisu vracamo false
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrixOne = new int[3][3];// prva matrica
		int[][] matrixTwo = new int[3][3];// druga matrica

		System.out.print("Enter first 3*3 matrix:");
		// unosenje vrijednosti u prvu matricu
		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixOne[0].length; j++) {
				matrixOne[i][j] = input.nextInt();
			}
		}

		System.out.print("Enter second 3*3 matrix:");
		// unosenje vrijednosti u drugu matricu
		for (int i = 0; i < matrixTwo.length; i++) {
			for (int j = 0; j < matrixTwo[0].length; j++) {
				matrixTwo[i][j] = input.nextInt();
			}
		}
		input.close();
		
		//ispis rezultata
		if (equals(matrixOne, matrixTwo)) {
			System.out.println("The two arrays are identical.");
		} else {
			System.out.println("The two arrays are not identical.");
		}

	}

}

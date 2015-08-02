package zadaci_02_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati program koji pita korisnika da unese cijeli broj 
 * te ispisuje piramidu svih brojeva do tog broja. 
 * 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, 
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3,
 * red ispod 4 3 2 1 2 3 4 itd.)
 */
public class Pyramid {

	/*
	 * Metoda printa piramidu u formatu:
	 * 
	 *        1
	 * 		2 1 2
	 *    3 2 1 2 3
	 *  4 3 2 1 2 3 4 
	 *  
	 *  ako je unijet broj 4
	 *  za bilo koji broj do 99
	 */
	public static void printPyramid(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			//petlja za spaceove
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			
			//petlja za stampanje lijeve strane piramide
			for (int k = i; k >= 1; k--) {
				if (k >= 10) {
					System.out.print(k + " ");
				} else {
					System.out.print(k + "  ");
				}
			}
			
			//petlja za stampanje desne strane piramide
			for (int m = 2; m <= i; m++) {
				if (m >= 10) {
					System.out.print(m + " ");
				} else {
					System.out.print(m + "  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		
		System.out.print("Unesite cijeli broj: ");
		int number = input.nextInt(); // broj za visinu piramide 
		
		input.close();
		//printanje piramide
		printPyramid(number);
	}

}

package zadaci_28_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 3
 * Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Takoðer, program ispisuje broj svih moguæih kombinacija. 
 *  Dakle, program treba da ispiše sve moguæe parove brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. 
 *  Broj moguæih kombinacija je 21.
 */
public class KombinacijeBrojeva {
	/*
	 * Metoda stampa sve jedinstvene kombinacije dva broja u definisanom rasponu
	 * @param start predstavlja donju granicu raspona
	 * @param stop predstavlja gornju granicu raspona
	 * metoda ispisuje 5 kombinacija po liniji
	 */
	public static void printCombinations(int start, int stop) {
		System.out.println("Kombinacije dva broja u rasponu od " + start
				+ " do " + stop + ", bez ponavljanja:");
		int combinationsCounter = 0;// broj mogucih kombinacija
		int countNumPerLine = 0;//brojac ispisa po liniji
		for (int i = start; i <= stop; i++) {
			for (int j = i; j <= stop; j++) {
				if (i != j) {
					countNumPerLine++;//povecavanje brojaca po liniji
					combinationsCounter++;//povecavanje broja kombinacija
					System.out.print("(" + i + "," + j + ") ");//ispis kombinacije
					if (countNumPerLine % 5 == 0) {// ako je ispisano 5 kombinacija prelazi u novu liniju
						System.out.println();
					}

				}
			}

		}
		System.out.println("\nBroj mogucih kombinacija je: "
				+ combinationsCounter);//ispis broja mogucih kombinacija
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Ispisivanje kombinacija brojeva u rasponu od prvog broja do krajnjeg.");
			
			System.out.print("Unesite prvi broj: ");
			int first = input.nextInt();//pocetni broj
			
			System.out.print("Unesite krajnji broj: ");
			int last = input.nextInt();//krajnji broj
			
			printCombinations(first, last);//ispis kombinacija u rasponu od pocetnog do krajnjeg broja
			
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		} finally {
			input.close();
		}
	}

}

package zadaci_30_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 
 * te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. 
 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje 
 * da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */
public class NumberOfRepetitions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;// broj

		int[] arrayOfRepetition = new int[101];// niz koji sluzi za brojanje unesenih brojeva

		System.out.print("Unesite niz cijelih brojeva (unos se prekida nulom, a brojevi su u rasponu od 1 do 100): ");
		
		//sve dok se ne unese 0
		while ((number = input.nextInt()) != 0) {
			//povecava brojac na indeksu number za 1
			arrayOfRepetition[number]++;
		}
		input.close();
		
		//stampanje rezultata brojanja
		for (int i = 0; i < arrayOfRepetition.length; i++) {
			if (arrayOfRepetition[i] != 0) {//ispisuje brojeve koji su se pojavili bar jednom
				System.out.println("Broj " + i + " se pojavljuje "
						+ arrayOfRepetition[i] + " puta.");
			}
		}

	}
}

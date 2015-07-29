package zadaci_22_07_2015;

import java.util.Scanner;

/*
 * 	Zadatak br. 1
 *  Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj 
 *  te printa sve proste brojeve u zadanom rangu.
 *	BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
 */
public class ProstiBrojevi {
	/*
	 * metoda za printanje prostih brojeva u odredjenom rasponu
	 * i sa odredjenim brojem prostih brojeva po liniji
	 */
	public static void printPrime(int startNumber, int stopNumber,
			int numsPerLine) {

		int count = 0;//brojac brojeva po liniji
		System.out.println("Prosti brojevi su: ");
		for (int i = startNumber; i <= stopNumber; i++) {//petlja se vrti u rasponu od startNumber do stopNumber
			boolean isPrime = true;//isPrime oznacava da li je broj prost ili ne
			/*	
			 * provjeravamo da li je broj prost tako sto ga dijelimo sa brojevima od 2 do tog broja
			 */
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {//ukoliko je broj djeljiv nekim brojem osim samim sobom, onda nije prost
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 0 && i != 1) {//ako je broj prost, i ako nije 0 i 1 onda ga stampamo
				count++;
				System.out.print(i + " ");
				if (count % numsPerLine == 0) {//ako je isprintan zadat broj brojeva po liniji, onda prelazi u novi red
					System.out.println();
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pocetni broj: ");
		int startNum = input.nextInt();//donja granica koja definise raspon
		System.out.print("Unesite krajnji broj: ");
		int stopNum = input.nextInt();//gornja granica koja definise raspon
		System.out
				.print("Unesite koliko brojeva zelite isprintati po liniji: ");
		int lineNum = input.nextInt();//broj prostih brojeva po liniji pri stampanju
		input.close();
		printPrime(startNum, stopNum, lineNum);//pozivanje metode za stampanje prostih brojeva
	}

}

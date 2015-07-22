package zadaci_22_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 3
 *  Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki.
 *  Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni.
 *  Koristiti sljedeæi header: public static boolean equals(int[ ] niz1, int[ ] niz2)
 *  Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva 
 *  te provjerava da li su striktno identièni.
 */
public class IdenticniNizovi {

	 /*
	  * metoda provjerava da li su nizovi identicni
	  * ukoliko su identicni vraca true
	  * u suprotnom vraca false
	  */
	public static boolean equals(int[] niz1, int[] niz2) {
		if (niz1.length != niz2.length) {//ako su nizovi razlicite duzine, sigurno nisu identicni
			return false;
		} else {//ukoliko su iste duzine provjeravmo jesu li im elementi isti
			for (int i = 0; i < niz1.length; i++) {
				if (niz1[i] != niz2[i]) {//ukoliko im elementi na istom indeksu imaju razlicite vrijednosti, nisu identicni
					return false;
				}
			}
			return true;//nizovi su identicni
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite duzinu prvog niza: ");
		int arrayOneLength = input.nextInt();//duzina prvog niza
		int[] arrayOne = new int[arrayOneLength];//deklaracija prvog niza zadane duzine
		System.out
				.print("Unesite elemente prvog niza (cjelobrojne vrijednosti): ");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = input.nextInt();//unos vrijednosti u prvi niz
		}
		System.out.print("Unesite duzinu drugog niza: ");
		int arrayTwoLength = input.nextInt();//duzina drugog niza
		int[] arrayTwo = new int[arrayTwoLength];//deklaracija prvog niza zadane duzine 
		System.out
				.print("Unesite elemente drugog niza (cjelobrojne vrijednosti): ");
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = input.nextInt();//unos vrijednosti u drugi niz
		}
		input.close();
		/*
		 * metoda equals vraca true/false
		 * ako vrati true, nizovi su identicni i izvrsava se kod iz if
		 * ako vrati false, nizovi nisu identicni i izvrsava se kod iz else
		 */
		if (equals(arrayOne, arrayTwo)) {
			System.out.println("\nNizovi su identicni.");
		} else {
			System.out.println("\nNizovi nisu identicni.");
		}

	}

}

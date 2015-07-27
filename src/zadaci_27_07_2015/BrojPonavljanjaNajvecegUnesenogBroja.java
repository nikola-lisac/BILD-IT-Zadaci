package zadaci_27_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio.  
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 
 * te ispisuje da se isti ponavlja 4 puta. 
 */
public class BrojPonavljanjaNajvecegUnesenogBroja {
	/*
	 * Metoda za pronalazenje najveceg broja u listi cijelih brojeva, 
	 * a zatim ispisivanje najveceg broja i broja puta koliko je on unijet u listu
	 */
	public static void findMaxAndNumberOfHisAppearances(ArrayList<Integer> list) {
		Integer max = list.get(0);// vrijednost najveceg broja postavljamo na nulti element arraylist-e
		int counter = 0;// brojac ponavljanja najveceg broja u arraylist-i
		/*
		 * petljom prolazimo kroz sve elemente u nizu i ako je postojeci najveci
		 * broj manji elementa sa indeksom "i", najvecem broju dodjeljujemo
		 * vrijednost tog broja sa indeksom i, a brojac postavljamo na 1;
		 * ukoliko je element niza jednak broju max, znaci da se najveci broj
		 * ponavlja i brojac povecavamo za 1
		 */
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
				counter = 1;
			} else if (max == list.get(i)) {
				counter++;
			}

		}
		// stampanje rezultata
		System.out.println("Najveci broj je " + max + " i ponavlja se "
				+ counter + " puta.");
	}

	public static void main(String[] args) {
		Scanner input = null;
		ArrayList<Integer> list = new ArrayList<>();// list u koju cemo
													// smjestiti brojeve
		int numInput = 0;
		try {
			input = new Scanner(System.in);
			System.out.println("Unesite niz brojeva (unos zavrsava nulom): ");
			// petljom unosimo brojeve iz konzole u arraylist sve dok se ne
			// unese 0
			do {
				numInput = input.nextInt();// uneseni broj
				if (numInput == 0) {// ako korisnik unese 0, petlja se prekida
					break;
				}
				list.add(numInput);// dodavanje brojeva u listu
			} while (numInput != 0);
			findMaxAndNumberOfHisAppearances(list);// pronalazenje najveceg i
													// stampanje broja njegovog
													// ponavljanja
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		} finally {
			input.close();
		}
	}
}

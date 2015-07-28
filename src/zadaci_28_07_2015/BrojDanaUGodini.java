package zadaci_28_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * Napisati metodu koja vraæa broj dana u godini. 
 * Metoda koristi sljedeæi header: public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu 
 * te ispisuje broj dana za svaku godinu u rasponu.
 */
public class BrojDanaUGodini {
	/*
	 * Metoda za odredjivanje broja dana u godini
	 * param year je godina za koju zelimo znati broj dana
	 * ako je godina prestupna, ona ima 366 dana
	 * ako nije, ima 365 dana
	 */
	public static int numberOfDaysInAYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return 366;
		} else {
			return 365;
		}
	}
	
	/*
	 * metoda za stampanje koliko ima dana u godinama u rasponu od pocetne godine do krajnje
	 * param startYear je pocetna godina raspona
	 * param lastYear je krajnja godina raspona
	 */
	public static void printNumOfDays(int startYear, int lastYear) {
		for (int i = startYear; i <= lastYear; i++) {
			System.out.println("Godina " + i + " ima " + numberOfDaysInAYear(i)
					+ ".");
		}

	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite pocetnu godinu: ");
			int firstYear = input.nextInt();//donja granica raspona
			System.out.print("Unesite krajnju godinu: ");
			int lastYear = input.nextInt();//gornja granica raspona
			printNumOfDays(firstYear, lastYear);//stampanje broja dana u godinama

		} catch (InputMismatchException e) {
			System.out.println("Unijeli ste pogresnu vrijednost!");
		} finally {
			input.close();
		}
	}
}

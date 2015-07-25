package zadaci_25_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 2
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. 
 */
public class PrestupneGodineURasponu {
	/*
	 * Metoda koja ispisuje prestupne godine u rasponu od firstYear do lastYear
	 * metoda ispisuje po 10 godina u liniji
	 */
	public static void printLeapYears(int firstYear, int lastYear) {
		int bottomBorder = 0;// donja granica
		int topBorder = 0;// gornja granica
		if (firstYear < lastYear) {// ako je pocetna godina manja od krajnje
			bottomBorder = firstYear;// donja granica je pocetna godina
			topBorder = lastYear;// gornja granica je krajnja godina
		} else {// ako nije
			bottomBorder = lastYear;// donja granica je krajnja godina
			topBorder = firstYear;// a gornja je pocetna godina
		}

		int counter = 0;// brojac ispisa po liniji
		System.out.println("\nPrestupne godine su: ");

		// Petlja prolazi kroz sve godine od pocetne godine do krajnje
		for (int i = bottomBorder; i <= topBorder; i++) {
			// godina je prestupna ako je djeljiva sa 4 i ako nije djeljiva sa
			// 100, ali jeste sa 400
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				if (counter % 10 == 0) {// ispisivanje 10 godina po liniji, kad ispise 10, prelazi u novi red
					System.out.print("\n" + i + " ");
				} else {
					System.out.print(i + " ");
				}
				counter++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite pocetnu godinu: ");
			int firstYear = input.nextInt();// donja granica raspona
			System.out.print("Unesite krajnju godinu: ");
			int lastYear = input.nextInt();// gornja granica raspona

			printLeapYears(firstYear, lastYear);//stampanje prestupnih godina u rasponu

		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		} finally {
			input.close();
		}
	}

}

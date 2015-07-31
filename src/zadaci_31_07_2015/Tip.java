package zadaci_31_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * (Izra�unavanje napojnice) 
 * Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti
 *  kao i procenat tog ra�una kojeg �elimo platiti kao napojnicu 
 *  te izra�unava ukupan ra�un i napojnicu. 
 *  Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu 
 *  program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. 
 */
public class Tip {
	/*
	 * metoda racuna i ispisuje iznos napojnice i ukupan iznos racuna
	 */
	public static void calculateTipAndPrintReceipt(double receipt, double tipPercent) {
		
		// iznos napojnice
		double valueOfTip = receipt * (tipPercent / 100);
		// iznos racuna
		double valueOfReceipt = receipt + valueOfTip;

		// stampanje rezultata
		System.out.println("Ukupna vrijednost racuna je: " + valueOfReceipt);
		System.out.println("Napojnica iznosi: " + valueOfTip);
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {

			input = new Scanner(System.in);

			// vrijednost racuna (kupljene robe)
			System.out.print("Unesite iznos racuna: ");
			double receipt = input.nextDouble();

			// vrijednost napojnice u procentima
			System.out.print("Unesite iznos napojnice u procentima: ");
			double tip = input.nextDouble();

			// racunanje i ispis iznosa napojnice i ukupnog racuna
			calculateTipAndPrintReceipt(receipt, tip);

		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		}
	}

}

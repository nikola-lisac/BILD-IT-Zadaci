package zadaci_31_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * (Izraèunavanje napojnice) 
 * Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti
 *  kao i procenat tog raèuna kojeg želimo platiti kao napojnicu 
 *  te izraèunava ukupan raèun i napojnicu. 
 *  Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu 
 *  program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5. 
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

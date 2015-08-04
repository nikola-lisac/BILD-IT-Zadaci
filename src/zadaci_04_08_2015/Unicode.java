package zadaci_04_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 2
 * Napisati program koji prima karakter te vraæa njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.
 */
public class Unicode {
	/*
	 * metoda stampa unicode i ASCII kod proslijedjenog karaktera
	 */
	public static void charToUnicode(char character) {
		
		//pretvaranje broja u unicode (heksadecimalnu vrijednost ascii coda i dodavanje nula na prva mjesta
		String unicode = String.format("\\u%04x", (int) character);
		
		//stampanje unicode koda
		System.out.println("Unicode za karakter " + character + " je: "+unicode);
		
		//stampanje ASCII koda
		System.out.println("ASCII kod za karakter " + character + " je: " + (int)character);
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite karakter: ");
		char c = input.next().charAt(0);// uneseni karakter
		input.close();
		
		charToUnicode(c);// stampanje unicode-a
	}

}

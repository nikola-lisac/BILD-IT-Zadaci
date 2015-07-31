package zadaci_31_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 2
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj 
 * koji joj je proslijeðen kao argument: public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. 
 * Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
 */
public class ReverseNumber {

	/*
	 * Metoda obrce cijeli broj, prva cifra postaje zadnja, druga predzadnja
	 * itd.. i stampa ga.
	 */
	public static void reverse(int number) {

		String str = Integer.toString(number);// smjestamo broj u string str
		String result = "";

		/*
		 * petlja ide od posljednjeg indeksa string u koji smo smjestili broj do
		 * prvog i smjesta cifre na indeksu u string result tako da dobijemo
		 * obrnut redoslijed cifara
		 */
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}

		// string sa obrnutim redoslijedom cifara pretvaramo u cijeli broj
		int reverseNumber = Integer.parseInt(result);

		// stampanje naopakog broja
		System.out.println("Broj sa obrnutim redoslijedom cifri: "
				+ reverseNumber);
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);

			System.out.print("Unesite cijeli broj: ");
			int number = input.nextInt();

			reverse(number);
			
		} catch (InputMismatchException e) {

			System.out.println("Pogresan unos.");
			
		} finally {
			
			input.close();
			
		}
	}

}

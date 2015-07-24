package zadaci_24_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati metodu koja broji slova u stringu. 
 * Metoda treba koristiti sljedeæi header: public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string 
 * te mu vrati koliko taj string ima slova.
 */
public class BrojSlova {
	/*
	 * Metoda koja racunanja i vraca broj slova u stringu
	 * parametar: string cija slova zelimo prebrojati
	 */
	public static int countLetters(String s) {
		String alfabet = "abcdefghijklmnopqrstuvwxwy";//sva mala slova alfabeta
		//str je jednak originalnom stringu samo su sva velika slova prebacena u mala radi lakseg racunanja
		String str = s.toLowerCase();
		int counter = 0;//brojac slova
		for (int i = 0; i < str.length(); i++) {//od 0 do kraja stringa
			for (int j = 0; j < alfabet.length(); j++) {//od 0 do 26 (ili kroz cijeli alfabet)
				if (str.charAt(i) == alfabet.charAt(j)) {//ako je karakter u stringu slovo iz alfabeta
					counter++;//povecaj broj slova za jedan
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String userString = input.nextLine();//string koji unese korisnik
		input.close();
		int numberOfLetters = countLetters(userString);//broj slova u tom string 
		System.out.println("Broj slova u vasem stringu je: " + numberOfLetters);//ispis rezultata
	}

}

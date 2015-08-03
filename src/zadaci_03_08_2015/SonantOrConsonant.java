package zadaci_03_08_2015;

import java.util.Scanner;

public class SonantOrConsonant {
	
	/*
	 * Metoda provjerava da li je proslijedjeni karakter samoglasnik,
	 * ako jeste vracu true, ako nije vraca false
	 */
	public static boolean isSonant(char c) {
		//niz samoglasnika
		char[] sonants = { 'a', 'e', 'i', 'o', 'u' };
		
		for (int i = 0; i < sonants.length; i++) {
			
			//ako je karakter jednak elementu niza samoglasnika, onda je on samoglasnik
			if (Character.toLowerCase(c) == sonants[i]) {
				return true;
			}
		}
		
		//ako je prosao kroz petlju i karakter nije samoglasnik, vraca false
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite karakter: ");
		//korisnik unosi karakter
		char character = input.next().charAt(0);
		input.close();
		
		//provjera da li je karakter samoglasnik ili suglasnik
		if (isSonant(character)) {
			System.out.println("Karakter je samoglasnik.");
		}
		else {
			System.out.println("Karakter je suglasnik.");
		}
	}

}

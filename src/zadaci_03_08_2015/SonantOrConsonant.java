package zadaci_03_08_2015;
/*
 * Zadatak br.3
 * Napisati program koji pita korisnika da unese slovo 
 * te provjerava da li je unijeti karakter samoglasnik ili suglasnik.
 *  Na primjer, ukoliko korisnik unese B, program vraæa da je dati karakter suglasnik. 
 *  Ukoliko unese A, program vraæa da je dati karakter samoglasnik.
 */
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
		
		//provjera da li je karakter samoglasnik
		if (isSonant(character)) {
			System.out.println("Karakter je samoglasnik.");
		}//ako nije samoglasnik i ako je slovo odna je samoglasnik
		else if (!isSonant(character) && Character.isLetter(character)){
			System.out.println("Karakter je suglasnik.");
		}
		else {//ako nije nijedno, onda je znak ili broj
			System.out.println("Karakter nije ni suglasnik, ni samoglasnik.");
		}
	}

}

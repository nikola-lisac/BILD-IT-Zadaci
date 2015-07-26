package zadaci_26_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 *  Neke web stranice forsiraju odreðena pravila za passworde.
 *   Napisati metodu koja provjerava da li je unijeti string validan password. 
 *   Pravila da bi password bio validan su sljedeæa: 
 *   1. Password mora biti saèinjen od najmanje 8 karaktera. 
 *   2. Password smije da se sastoji samo od slova i brojeva. 
 *   3. Password mora sadržati najmanje 2 broja. 
 *   Napisati program koji pita korisnika da unese password 
 *   te mu ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili 
 *   "password nije validan" ukoliko pravila nisu ispoštovana.
 */
public class ValidanPassword {
	/*
	 * metoda isValid provjerava da li je password validan na osnovu pravila iz zadatka i
	 * vraca true ako jeste, odnosno false ako nije
	 * parametar password je string ciju validnost zelimo provjeriti
	 */
	public static boolean isValid(String password) {
		boolean valid = false;//promjenljivu valid koristim za definisanje da li password validan
		if (password.length() >= 8) {//ako password ima vise od definisanog minimuma karaktera
			for (int i = 0; i < password.length(); i++) {
				if (Character.isLetter(password.charAt(i))
						|| Character.isDigit(password.charAt(i))) {//ako su svi karakteri u stringu password slova ili brojevi
					valid = true;//password je validan
				} else {//ako nisu, password nije validan
					valid = false;
					break;
				}
			}
		} else {//ako password ima manje od 8 karaktera, automatski nije validan
			valid = false;
		}
		return valid;//vracanje rezultata
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite password: ");
		String str = input.next();//password koji cemo provjeriti
		input.close();
		if (isValid(str)) {//ako je isValid metoda vrati true, password je validan
			System.out.println("Password je validan.");
		} else {//ako vrati false, password nije validan
			System.out.println("Password nije validan.");
		}
	}

}

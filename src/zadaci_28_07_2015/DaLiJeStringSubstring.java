package zadaci_28_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati program koji pita korisnika da unese dva stringa 
 * te provjerava i ispisuje da li je drugi string substring prvog stringa. 
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string
 *  program mu ispisuje da je BC substring ABCD stringa.
 */
public class DaLiJeStringSubstring {
	/*
	 * metoda provjerava da li je odredjeni string substring drugog stringa
	 * @param str je string u kome zelimo provjeriti da li postoji odredjeni substring
	 * @param substr je string za koji zelimo provjeriti da li je substring stringa str
	 * metoda vraca true ako jeste substring, a false ako nije
	 */
	public static boolean isStringASubstring(String str, String substr) {
		if (str.contains(substr) && !str.equals(substr)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String firstString = input.nextLine();//prvi string
		System.out.println("Unesite drugi string: ");
		String secondString = input.nextLine();//drugi string (moguci substring)
		input.close();
		if (isStringASubstring(firstString, secondString)) {//ako je drugi string substring prvog stringa ispisuje poruku
			System.out.println("String: " + secondString + " je substring stringa: "
					+ firstString);
		} else {//ako nije ispisuje drugu poruku
			System.out.println("String " + secondString + " nije substring stringa: "
					+ firstString);
		}
	}

}

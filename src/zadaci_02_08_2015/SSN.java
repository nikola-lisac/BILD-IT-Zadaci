package zadaci_02_08_2015;
/*
 * Zadatak br. 3
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) 
 * u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 * Program treba da provjerava da li je broj unesešen u ispravnom formatu. 
 * Ukoliko nije, program pita korisnika da pokuša ponovo. 
 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.
 */
import java.util.Scanner;

public class SSN {
	
	/*
	 * Metoda provjerava da li je proslijedjeni ssn validan ili ne
	 * i vraca true, ako jeste, odnosno false ako nije
	 */
	public static boolean isValid(String ssn) {
		//zadati format SSN-a 
		String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}"; 
		
		//ukoliko ssn odgovara zadatom formatu, vraca true
		if (ssn.matches(regex)) {
			return true;
		} 
		//ako ne odgovara, vraca false
		else {
			
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userSSN = "";
		
		 //petlja se vrti sve dok korisnik ne unese ssn u ispravnom formatu
		do {
			
			System.out.println("Unesite SSN u formatu DDD-DD-DDDD: ");
			userSSN = input.next(); // uneseni ssn
			
		} while (!isValid(userSSN)); //provjera da li je uneseni ssn validan
		
		input.close();
	}

}

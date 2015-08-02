package zadaci_02_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj 
 * te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */
public class ThreeDigitsPalindrome {
	

	/*
	 * Metoda ispituje da i je broj palindrom ili ne i u odnosu na to vraca vrijednost true ili false
	 * Broj je palindrom ako mu je ista vrijedost i kad se cita unaprijed i unazad.
	 */
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {//ako je broj jednak broju sa obrnutim ciframa onda je on palindrom
			return true;
		} else {//ako nije jednak onda nije palindrom
			return false;
		}
	}
	

	/*
	 * Metoda obrce cijeli broj, prva cifra postaje zadnja, druga predzadnja itd.. 
	 * i vraca ga.
	 */
	public static int reverse(int number) {

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

		return reverseNumber;
	}
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			
			//korisnik unosi trocifren broj
			System.out.print("Unesite trocifren cijeli broj: ");
			int number = input.nextInt();
			
			//ako je broj palindrom ispisuje poruku da je broj palindrom
			if(isPalindrome(number)){
				System.out.println("Uneseni broj je palindrom.");
			}
			
			//ako nije, ispisuje poruku da nije
			else {
				System.out.println("Uneseni broj nije palindrom.");
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println("Pogresan unos.");
			
		} finally {
			
			input.close();
		}
	}

}

package zadaci_25_07_2015;

/*
 * Zadatak br. 3
 * 3. Napisati metode sa sljedeæim headerima: 
 * public static int reverse(int number) 
 * public static boolean isPalindrome(int number) 
 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrom {
	/*
	 * Metoda obrce cijeli broj, prva cifra postaje zadnja, druga predzadnja itd..
	 */
	public static int reverse(int number) {
		String str = Integer.toString(number);//smjestamo broj u string str
		String result = "";//promjenljiva tipa string u koju cemo smjestiti obrnut broj
		for (int i = str.length() - 1; i >= 0; i--) {//petlja ide od posljednjeg indeksa string u koji smo smjestili broj do prvog i
			result += str.charAt(i);//smjesta cifre na indeksu u string result tako da dobijemo obrnut redoslijed cifara
		}
		int reverseNumber = Integer.parseInt(result);//string sa obrnutim redoslijedom cifara broja pretvaramo u cijeli broj
		return reverseNumber;//vraca cijeli broj sa obrnutim redoslijedom cifara
	}
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

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite cijeli broj: ");
			int number = input.nextInt();//broj koji korisnik unese
			if (isPalindrome(number)) {//ako isPalindrome vrati true
				System.out.println("Broj je palindrom.");
			} else {//ako vrati false
				System.out.println("Broj nije palindrom.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		}
	}

}

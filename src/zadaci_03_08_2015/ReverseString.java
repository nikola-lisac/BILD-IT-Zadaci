package zadaci_03_08_2015;
/*
 * Zadatak br. 1
 * Napisati program koji pita korisnika da unese neki string 
 * te mu vraæa taj isti string naopako.
 */
import java.util.Scanner;

public class ReverseString {

	/*
	 * Metoda koja obrce prosledjeni string i stampa ga
	 */
	public static void reverseString(String str) {
		String reverseStr = "";//obrnut string
		
		//dodavanje karaktera originalnog stringa od posljednjeg do prvog u novi string
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		
		//stampanje obrnutog stringa
		System.out.println("Obrnut string: " + reverseStr);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String userString = input.nextLine();//string koji unosi korisnik
		
		input.close();
		reverseString(userString);//stampanje obrnutog stringa
	}

}

package zadaci_20_07_2015;

import java.util.Scanner;
/*
 * Zadatak br. 2
 * Napisati program koji pita korisnika da unese string
 * te mu ispište broj samoglasnika i suglasnika u datom stringu.
 * 
 */
public class BrojSuglasnikaISamoglasnika {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String string = input.nextLine();
		
		//stringWithoutSpaces je string koji se sastoji iz karaktera originalnog stringa samo sa izbrisanim space-ovima
		String stringWithoutSpaces = string.replace(" ", "");
		
		//originalni string bez samoglasnika
		String removedVowels = stringWithoutSpaces.toLowerCase().replaceAll("a|e|i|o|u|", "");
		
		/*broj samoglasnika je razlika izmedju duzine stringa bez space-ova
		 * i duzine stringa sa uklonjenim samoglasnicima
		 */
		System.out.println("Broj samoglasnika je: "
				+ (stringWithoutSpaces.length() - removedVowels.length()));
		
		 //broj suglasnika je duzina stringa u kojem su izbaceni samoglasnici i space-ovi
		System.out.println("Broj suglasnika je: " + removedVowels.length());
		input.close();
	}

}

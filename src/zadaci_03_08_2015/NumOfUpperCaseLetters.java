package zadaci_03_08_2015;
/*
 * Zadatak br. 2
 * Napisati program koji pita korisnika da unese neki string 
 * te mu vraæa broj uppercase karaktera u unijetom stringu. 
 * Na primjer, ukoliko korisnik unese string "Dobrodošli u Dubai" 
 * program mu vraæa da je broj uppercase karaktera 2.
 */
import java.util.Scanner;

public class NumOfUpperCaseLetters {

	/*
	 * Metoda pronalazi i stampa broj velikih slova u proslijedjenom stringu
	 */
	public static void findNumberOfUpperCaseLetters(String str) {
		//brojac uppercase karaktera
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {//ako je karakter na indeksu "i" uppercase povecaj brojac za 1
				count++;
			}
		}
		
		//stampanje broja uppercase karaktera
		System.out.println("Broj velikih slova je: " + count);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite string: ");
		String userString = input.nextLine();// string koji unosi korisnik
		
		input.close();
		findNumberOfUpperCaseLetters(userString); //pronalazenje broja velikih slova
	}

}

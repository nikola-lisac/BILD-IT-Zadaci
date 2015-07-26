package zadaci_26_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 3
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
 * te mu ispiše broj dana u tom mjesecu.
 *  Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan,
 *  program mu ispisuje da Jan 2011 ima 31 dan.
 */
public class BrojDanaUMjesecuSlova {
	/*
	 * metoda koja provjerava da li je godina prosledjena kao argument,
	 * prestupna ili ne
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;// ako je prestupna vraca true
		} else {
			return false;// ako nije prestupna vraca false
		}
	}

	public static void printNumberOfDaysInAMonth(String monthName, int year) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul",
				"Avg", "Sep", "Okt", "Nov", "Dec" };// svi mjeseci u godini
		boolean validMonth = false;
		int month = 0;// broj mjeseca

		for (int i = 0; i < months.length; i++) {
			if (monthName.equals(months[i])) {// ukoliko je ime mjeseca jednakonazivu mjeseca
				validMonth = true;// mjesec je "validan"
				// broj mjeseca je indeks + 1 jer sam kopirao kod iz prethodnog zadatka pa mi se nije dalo mijenjati vrijednosti
				month = i + 1;
				break;
			}
		}

		if (!validMonth) {
			System.out.println("Niste unijeli odgovarajuci naziv mjeseca.");
		} 
		
		else {
			
			// ako je mjesec validan ako je broj mjeseca neka od ovih vrijednosti, ti mjeseci imaju 30 dana
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println(months[month - 1] + " " + year
						+ ". godine ima 30 dana.");
			}

			// drugi mjesec godine koja nije prestupna ima 28 dana
			else if (month == 2 && !isLeapYear(year)) {
				System.out.println(months[month - 1] + " " + year
						+ ". godine ima 28 dana.");
			}

			// drugi mjesec prestupne godine ima 29 dana
			else if (month == 2 && isLeapYear(year)) {
				System.out.println(months[month - 1] + " " + year
						+ ". godine ima 29 dana.");
			}

			// ostali mjeseci imaju 31 dan
			else {
				System.out.println(months[month - 1] + " " + year
						+ ". godine ima 31 dana.");
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite godinu: ");// godina
			int year = input.nextInt();// godina u kojoj zelimo znati broj dana u odredjenom mjesecu
			System.out.print("Unesite prva tri slova imena mjeseca (prvo slovo mora biti veliko): ");
			String month = input.next();// ime mjeseca (prva tri slova)
			
			printNumberOfDaysInAMonth(month, year);// ispis broja dana odredjenog mjeseca u godini
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		} finally {
			input.close();
		}
	}

}

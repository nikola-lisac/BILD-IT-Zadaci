package zadaci_26_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 2
 * Napisati program koji pita korisnika da unese mjesec i godinu 
 * te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, 
 * program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, 
 * program treba ispisati da je Mart 2015 imao 31 dan. 
 */
public class BrojDanaUMjesecuBrojevi {
	/*
	 * metoda ispisuje koliko ima dana u odredjenom mjesecu odredjene godine, 
	 * a taj mjesec i godina su proslijedjeni kao argumenti
	 */
	public static void printNumberOfDaysInAMonth(int month, int year) {
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj", "Jun",
				"Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar" };//svi mjeseci u godini
		
		//ako je uneseni mjesec neka od ovih vrijednosti, ti mjeseci imaju 30 dana
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(months[month - 1] + " " + year
					+ ". godine ima 30 dana.");
		} 
		
		//drugi mjesec godine koja nije prestupna ima 28 dana
		else if (month == 2 && !isLeapYear(year)) {
			System.out.println(months[month - 1] + " " + year
					+ ". godine ima 28 dana.");
		} 
		
		//drugi mjesec prestupne godine ima 29 dana
		else if (month == 2 && isLeapYear(year)) {
			System.out.println(months[month - 1] + " " + year
					+ ". godine ima 29 dana.");
		} 
		
		//ostali mjeseci imaju 31 dan
		else {
			System.out.println(months[month - 1] + " " + year
					+ ". godine ima 31 dana.");
		}
	}
	/*
	 * metoda koja provjerava da li je godina prosledjena kao argument, prestupna ili ne
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;//ako je prestupna vraca true
		} else {
			return false;//ako nije prestupna vraca false
		}
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite godinu: ");
			int year = input.nextInt();//godina u kojoj zelimo znati broj dana u odredjenom mjesecu
			System.out.print("Unesite broj mjeseca: ");
			int month = input.nextInt();//mjesec cije dane zelimo da ispisemo
			if (month > 0 && month <= 12) {//ako je korisnik unio mjesec izmedju 1 i 12 (sto bi bilo normalno da unese)
				printNumberOfDaysInAMonth(month, year);//ispis broja dana odredjenog mjeseca u godini
			} else {//ako je korisnik (idiot) unio neki broj koji ne odgovara broju mjeseci u godini
				System.out.println("Unijeli ste nepostojeci mjesec.");//ispis poruke 
			}
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		} finally {
			input.close();
		}
	}

}

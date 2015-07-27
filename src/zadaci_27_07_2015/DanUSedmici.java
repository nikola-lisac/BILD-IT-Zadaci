package zadaci_27_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg dana 
 * te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti,
 *  program mu ispisuje da je danas utorak a dan u buduænosti je petak.) 
 */
public class DanUSedmici {
	/*
	 * metoda pronalazi dan u buducnosti i stampa ga
	 * parametri su danasnji dan i broj dana od danasnjeg za koji zelimo znati koji je dan
	 */
	public static void printDayInFuture(int currentDay, int dayInFuture) {

		int dayNumber = (currentDay + dayInFuture) % 7;//pronalazenje dana koji odgovara broju dana u buducnosti
		String[] days = { "ponedeljak", "utorak", "srijeda", "cetvrtak",
				"petak", "subota", "nedelja" };//dani u sedmici

		System.out.println("Danas je " + days[currentDay]
				+ ", a dan u buducnosti je " + days[dayNumber] + ".");//ispis poruke korisniku
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite danasnji dan(0-ponedeljak, 1-utorak, 2-srijeda...): ");
			int today = input.nextInt();//danasnji dan
			
			System.out.print("Unesite broj dana u buducnosti: ");
			int futureDay = input.nextInt();//dan u buducnosti
			
			if (today >= 0 && today < 7) {//dani u sedmici su definisani od 0 do 6
				printDayInFuture(today, futureDay);//stampanje dana u buducnosti
			} 
			
			else {
				System.out.println("Unijeli ste nepostojeci dan.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		} finally {
			input.close();
		}
	}

}

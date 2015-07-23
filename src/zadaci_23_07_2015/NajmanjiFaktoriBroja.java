package zadaci_23_07_2015;
/*
 * Zadatak br. 1
 * Napisati program koji pita korisnika da unese neki cijeli broj 
 * te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. 
 * (2 * 2 * 2 * 3 * 5 = 120)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class NajmanjiFaktoriBroja {
	/*
	 * metoda za pronalazenje i stampanje najmanjih faktora broja
	 */
	public static void findAndPrintFactorsOfANumber(int number) {
		ArrayList<Integer> list = new ArrayList<>();//lista u kojoj ce biti smjesteni faktori
		int temp = number;//promjenljiva na kojoj vrsimo racunanje
		int i = 2;//promjenljiva koja oznacava potencijalne faktore
		while (temp != 1) {//sve dok broj ne bude imao vrijednost 1, odmosno dok ne izracunamo faktore
			if (temp % i != 0) {//ukoliko postoji ostatak pri djeljenju, broj i nije faktor unesenog broja
				i++;//povecavanje djelioca za 1
			} else {//ukoliko nema ostatka pri djeljenju, broj i je faktor broja number/temp
				temp /= i;//dijelimo broj sa i da bi nastavili racunanje sledec faktora
				list.add(i);//dodajemo faktor u listu
			}
		}
		System.out.println("Najmanji faktori za broj " + number + " su: ");
		for (int e : list) {//stampanje faktora
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite cijeli broj: ");
			int number = input.nextInt();//cijeli broj koji korisnik unese
			findAndPrintFactorsOfANumber(number);//pozivanje metode za pronalazenje faktora

		} catch (Exception e) {
			System.out.println("Doslo je do greske!");
			System.exit(0);
		} finally {
			input.close();
		}
	}

}

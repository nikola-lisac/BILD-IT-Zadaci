package zadaci_22_07_2015;
/*
 * Zadatak br. 2
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:
 * public static double min(double[ ] array)
 * Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class NajmanjiElement {
	/*
	 * metoda za pronalazenje najmanjeg elementa u nizu decimalnih brojeva
	 */
	public static double min(double[] array) {
		double min = array[0];//pocetna minimalna vrijednost jednaka nultom elementu niza
		for (int i = 0; i < array.length; i++) {//petlja se vrti do duzine niza koji smo proslijedili kao argument
			if (array[i] < min) {//ako je vrijednost na indeksu i manja od trenutne najmanje vrijednosti
				min = array[i];//onda je to nova minimalna vrijednost
			}
		}
		return min;//vracanje najmanje vrijednosti u nizu
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.println("Unesite 10 decimalnih vrijednosti:");
		/*
		 * unosenje 10 decimalnih vrijednosti u niz
		 * u slucaju pogresnog unosa (npr. slova)
		 * obavjestavam korisnika da je unio pogresnu vrijednost
		 * i prekidam izvrsenje programa
		 */
		try {
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextDouble();
			}
		} catch (InputMismatchException e) {
			System.out.println("Unijeli ste pogresnu vrijednost!");
			System.exit(0);
		}
		finally{
			input.close();
			}
		double result = min(array);//result promjenljivoj dodjeljujemo vrijednost najmanjeg elemnta kao return value min metode
		System.out.println("Najmanji element je: " + result);//stampanje rezultata

	}

}

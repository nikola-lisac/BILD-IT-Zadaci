package zadaci_24_07_2015;
/*
 * Zadatak br. 4
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObrnutiRedoslijed {
	/*
	 * Metoda za stampanje niza brojeva u obrnutom redoslijedu, od posljednjeg do prvog
	 * parametar: niz cijelih brojeva koji zelimo odstampati
	 */
	public static void printInReverse(int[] array) {
		System.out.println("Brojevi u obrnutom redoslijedu: ");
		for (int j = array.length - 1; j >= 0; j--) {//od posljednjeg indeksa do nutog
			System.out.print(array[j] + " ");//stampaj element na indeksu j
		}
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			int[] array = new int[10];//niz u koji cemo smjestiti 10 cijelih brojeva koje korisnik unese
			System.out.print("Unesite 10 cijelih brojeva: ");
			for (int i = 0; i < 10; i++) {
				array[i] = input.nextInt();//unos cijelih brojeva
			}
			printInReverse(array);//stampanje brojeva u obrnutom redoslijedu
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		} finally {
			input.close();
		}
	}

}

package zadaci_20_07_2015;

/*
 * 	Zadatak br. 5
 *  Napisati program koji uèitava niz brojeva,
 *  pronalazi najveæi broj te ispisuje koliko se puta taj broj ponavlja.
 *  Pretpostavimo da se unos brojeva završava sa nulom.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BrojacPonavljanjaNajvecegBroja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int numInput = 0;
		System.out.println("Unesite niz brojeva (unos zavrsava nulom): ");
		// petljom unosimo brojeve iz konzole u arraylist sve dok se ne unese 0
		do {
			numInput = input.nextInt();
			if (numInput == 0) {// ako korisnik unese 0, petlja se prekida
				break;
			}
			list.add(numInput);
		} while (numInput != 0);
		input.close();
		Integer max = list.get(0);// vrijednost najveceg broja postavljamo na
									// nulti element arraylist-e
		int counter = 0;// brojac ponavljanja najveceg broja u arraylist-i

		/*
		 * petljom prolazimo kroz sve elemente u nizu i ako je postojeci najveci
		 * broj manji elementa sa indeksom "i", najvecem broju dodjeljujemo
		 * vrijednost tog broja sa indeksom i, a brojac postavljamo na 1;
		 * ukoliko je element niza jednak broju max, znaci da se najveci broj
		 * ponavlja i brojac povecavamo za 1
		 */
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
				counter = 1;
			} else if (max == list.get(i)) {
				counter++;
			}

		}
		// stampanje rezultata
		System.out.println("Najveci broj je " + max + " i ponavlja se "
				+ counter + " puta.");
	}

}

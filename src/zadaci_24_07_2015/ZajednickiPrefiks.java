package zadaci_24_07_2015;

import java.util.Scanner;

/*
 * Zadatak br 3
 * Napisati program koji pita korisnika da unese 2 stringa 
 * te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. 
 * Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
 * program treba da ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */
public class ZajednickiPrefiks {
	public static void findAndPrintPrefix(String stringOne, String stringTwo) {
		//splitujemo prvi string po razmaku kako bi napravili niz rijeci u tom stringu
		String[] first = stringOne.split(" ");
		//splitujemo drugi string po razmaku kako bi napravili niz rijeci u tom stringu
		String[] second = stringTwo.split(" ");
		String commonPrefix = "";//zajednicki prefiks
		//pronalazimo koji je string manji, kako bi znali dokle ce se petlja vrtiti, da ne dodje do OutOfBoundsException
		int size = 0;
		if (first.length < second.length) {
			size = first.length;
		} else {
			size = second.length;
		}
		/*
		 * ako su rijeci jednake u nizovima rijeci oba stringa na istom indeksu,
		 *  onda smjestamo tu rijec u zajednicki prefiks
		 */
		for (int i = 0; i < size; i++) {
			if (first[i].equals(second[i])) {
				commonPrefix += (first[i] + " ");

			}
		}
		//ako je string sa zajednickim prefiksima prazan, znaci da nemaju zajednicke prefiks
		if (commonPrefix.isEmpty()) {
			System.out.println("Stringovi nemaju zajednicki prefiks!");
		} else {//ako imaju zajednicki prefiks, ispisujemo ga
			System.out.println("Zajednicki prefiks: " + commonPrefix);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String firstString = input.nextLine();//prvi string
		System.out.println("Unesite drugi string: ");
		String secondString = input.nextLine();//drugi string
		input.close();
		findAndPrintPrefix(firstString, secondString);//nalazenje i stampanje prefiksa
	}

}

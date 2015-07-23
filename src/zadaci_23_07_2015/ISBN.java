package zadaci_23_07_2015;

/*
 * Zadatak br. 2
 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10.
 * Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom.
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj.
 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */
import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[9];//niz u koji cemo smjestiti prvih 9 cifri ISBN broja
		System.out.println("Unesite prvih 9 brojeva ISBN broja: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();//korisnikov unos cifri
		}
		input.close();
		int checksum = (array[0] * 1 + array[1] * 2 + array[2] * 3 + array[3]
				* 4 + array[4] * 5 + array[5] * 6 + array[6] * 7 + array[7] * 8 + array[8] * 9) % 11;//racunanje checksum-a
		String result = "";//promjenljiva u kojoj ce biti smjesten konacan ISBN broj
		for (int a : array) {
			result += a;//ubacivanje prvi 9 cifri u rezultat
		}
		if (checksum == 10) {//ako je checksum 10, zadnji broj oznacavamo sa X
			result += "X";
		} else {
			result += checksum;//ako nije 10 onda je zadnji broj iznos checksum-a
		}
		System.out.println("ISBN broj je: " + result);//stampanje ISBN broja

	}

}

package zadaci_04_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 3
 * U javi, short vrijednost se sprema u samo 16 bita. 
 * Napisati program koji pita korisnika da unese short broj 
 * te mu ispiše svih 16 bita za dati cijeli broj.
 *  Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */
public class ShortToBinary {

	public static String shortToBinary(short number) {
		short width = 16;// duzina je 16 zato sto short zadzrzi 16 bita
		String formatedBinaryNumber = "";
		String binaryNumber = Integer.toBinaryString(number);// string broja

		// ubacuje potrebne nule
		for (int i = 0; i < width - binaryNumber.length(); i++) {
			formatedBinaryNumber += "0";
		}

		// dodajemo broj u formatirani string
		formatedBinaryNumber += binaryNumber;
		
		// vracamo formatirani string
		return formatedBinaryNumber;

	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);

			// unos broja
			System.out.print("Unesite pozitivan cijeli broj: ");
			short number = input.nextShort();

			// printanje formatiranog broja
			System.out.println("16-o bitna binarna vrijednost broja: "
					+ shortToBinary(number));

		} catch (Exception e) {
			System.out.println("Greska.");
		}
	}

}

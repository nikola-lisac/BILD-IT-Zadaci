package zadaci_04_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 1
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) 
 * te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, 
 * program mu ispisuje da je karakter sa tim brojem karakter E.
 */
public class ASCII {
	
	/*
	 * metoda printa karakter preko proslijedjenog ASCII koda
	 */
	public static void printCharFromASCII(int number) {
		// printanje karaktera
		System.out.println("Karakter sa ASCII kodom " + number + " je: "
				+ (char) number);
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi ASCII kod
		System.out.print("Unesite ASCII kod (broj od 0 do 127): ");
		int number = input.nextInt();
		input.close();
		
		// pozivanje metodu za printanje karaktera sa ascii kodom number
		printCharFromASCII(number);

	}

}

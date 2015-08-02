package zadaci_02_08_2015;
/*
 * Zadatak br. 2
 * Napisati program koji pita korisnika da unese neki string 
 * te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
 */
import java.util.Scanner;

public class LengthOfAStringAndAFirstLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite string: ");
		String str = input.nextLine();//uneseni string
		input.close();
		
		//ispisuje duzinu stringa
		System.out.println("Duzina stringa je: " + str.length());
		
		//ispisuje karakter na nultom indeksu stringa
		System.out.println("Prvo slovo je: " + str.charAt(0));
	}

}

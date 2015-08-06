package opcioni_zadaci_06_08_2015;

import java.util.Scanner;

/*
 * Zadatak 6.21*
 * (Phone keypads) The international standard letter/number mapping for telephones 
 * is shown in Programming Exercise 4.15. Write a method that returns a number,
 * given an uppercase letter, as follows:
 * int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters. The program translates a letter (uppercase
 * or lowercase) to a digit and leaves all other characters intact. Here is a sample run
 * of the program:
 * Enter a string: 1-800-Flowers
 * 1-800-3569377
 * Enter a string: 1800flowers
 * 18003569377
 * 
 */
public class PhoneKeypads {
	
	/*
	 * Metoda vraca string sa konvertovanim slovima u brojeve
	 * parametar str je originalni string koji zelimo konvertovati
	 */
	public static String convertToNumbers(String str) {
		String convertedStr = "";
		char character;
		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			if (Character.isLetter(character)) {
				//pozivanje metode za oretvaranje slova u broj
				convertedStr += getNumber(Character.toUpperCase(character));
			} else {
				convertedStr += character;
			}
		}
		return convertedStr;
	}
	
	/*
	 * Metoda koja pretvara veliko slovo u broj na osnovu rasporeda brojeva i slova na tastaturi telefona
	 * ulazni parametar je veliko slovo
	 * metoda vraca broj koji predstavlja slovo
	 */
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'A' || uppercaseLetter == 'B'
				|| uppercaseLetter == 'C') {
			
			return 2;
		} 
		
		else if (uppercaseLetter == 'D' || uppercaseLetter == 'E'
				|| uppercaseLetter == 'F') {
			
			return 3;
		} 
		
		else if (uppercaseLetter == 'G' || uppercaseLetter == 'H'
				|| uppercaseLetter == 'I') {
			
			return 4;
		} 
		
		else if (uppercaseLetter == 'J' || uppercaseLetter == 'K'
				|| uppercaseLetter == 'L') {
			
			return 5;
		} 
		
		else if (uppercaseLetter == 'M' || uppercaseLetter == 'N'
				|| uppercaseLetter == 'O') {
			
			return 6;
		} 
		
		else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q'
				|| uppercaseLetter == 'R' || uppercaseLetter == 'S') {
			
			return 7;
		} 
		
		else if (uppercaseLetter == 'T' || uppercaseLetter == 'U'
				|| uppercaseLetter == 'V') {
			
			return 8;
		} 
		
		else {
			
			return 9;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();//uneseni string
		input.close();
		//ispisivanje konvertovanog stringa
		System.out.println("Vas string je: " + convertToNumbers(str));

	}

}

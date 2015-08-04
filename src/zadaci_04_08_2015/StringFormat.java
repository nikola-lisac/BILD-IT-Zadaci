package zadaci_04_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati metodu sa sljede�im headerom: public static String format(int number, int width) 
 * koja vra�a string broja sa prefiksom od jedne ili vi�e nula. 
 * Veli�ina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vra�a 0034, 
 * ukoliko pozovemo format(34, 5) metoda vra�a 00034. 
 * Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */
public class StringFormat {
	
	/*
	 * Metoda vraca string broj ciji je broj cifara parametar width, u kome je smjesten broj number
	 */
	public static String format(int number, int width) {
		String formatedNumber = "";
		String numberString = Integer.toString(number);//string broja
		
		//ako je duzina stringa broja veca od proslijedjene duzine stringa
		if ( width > numberString.length()) {
			//ubacuje potrebne nule
			for (int i = 0; i < width - numberString.length(); i++) {
				formatedNumber += "0";
			}
		} 
		//dodajemo broj u formatirani string
		formatedNumber += numberString;
		
		//vracamo formatirani string
		return formatedNumber;

	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			
			//unos broja
			System.out.print("Unesite pozitivan cijeli broj: ");
			int number = input.nextInt();
			
			//unos broja cifara
			System.out.print("Unesite broj cifara: ");
			int numOfDigits = input.nextInt();
			
			//printanje formatiranog broja
			System.out.println("Formatirani broj: " + format(number,numOfDigits));
			
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		}
		
	}

}

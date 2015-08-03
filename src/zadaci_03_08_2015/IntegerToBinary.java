package zadaci_03_08_2015;
/*
 * Zadatak br. 4
 * Napišite program koji pita korisnika da unese cijeli broj 
 * i ispiše njegov ekvivalent u binarnom kodu. 
 * Za ovaj program NE smijemo koristiti Integer.toBinaryString(int) metodu.
 */
import java.util.Scanner;

public class IntegerToBinary {
	
	/*
	 * metoda za pretvaranje cijelog broja u binarni
	 * i vracanje rezultata
	 */
	public static String convertIntToBinary(int number) {
		String revBinary = "";//string gdje cemo smjestati binarni broj
		String binary = "";
		
		//dobijanje binarnog broja ciji je redoslijed obrnut
		while (number > 0) {
			revBinary += number % 2;
			number /= 2;
		}
		
		//obrtanje binarnog broja u pravi format
		for (int i = revBinary.length() - 1; i >= 0; i--) {
			binary += revBinary.charAt(i);
		}
		return binary;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite cijeli broj: ");
		int number = input.nextInt();//broj
		input.close();
		
		if (number > 0){
			//stampanje broja u binarnom brojnom sistemu
			System.out.println("Broj u binarnom zapisu: "
					+ convertIntToBinary(number));
		}
	}

}

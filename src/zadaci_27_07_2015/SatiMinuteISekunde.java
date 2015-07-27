package zadaci_27_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 * Metoda treba da koristi sljedeæi header: public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
public class SatiMinuteISekunde {
	/*
	 * metoda za pretvaranje milisekundi u sate, minute i sekunde
	 */
	public static String convertMillis(long millis) {
		
		int hours = (int) ((millis / (1000 * 60 * 60)) % 24); //pretvaranje milisekundi u sate
		int minutes = (int) ((millis / (1000 * 60)) % 60); //pretvaranje milisekundi u minute
		int seconds = (int) (millis / 1000) % 60; //pretvaranje milisekundi u sekunde
		
		return hours + ":" + minutes + ":" + seconds;//vracanje rezultata u stringu formatiran kao sati:minute:sekunde

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj milisekundi: ");
		long millis = input.nextLong();//broj milisekundi
		input.close();
		System.out.println(convertMillis(millis));//stampanje broja sati, minuta i sekundi

	}

}

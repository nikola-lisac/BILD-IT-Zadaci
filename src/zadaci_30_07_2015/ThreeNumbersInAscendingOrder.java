package zadaci_30_07_2015;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati program koji pita korisnika da unese 3 cijela broja 
 * te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente 
 * te vraæa brojeve u rastuæem redosljedu. 

 */
public class ThreeNumbersInAscendingOrder {
	/*
	 * metoda smjesta 3 cijela broja u niz, sortira niz u rastucem redoslijedu i vraca ga
	 */
	public static int[] sortNumbersInAscendingOrder(int a, int b, int c) {
		int[] array = { a, b, c };
		Arrays.sort(array);
		return array;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite tri cijela broja: ");
		
		int num1 = input.nextInt();// prvi broj
		int num2 = input.nextInt();// drugi broj
		int num3 = input.nextInt();// treci broj
		input.close();
		
		//niz brojeva koje je korisnik unio sortiranih u rastucem redoslijedu
		int[] arrayOfNumbersInAscendingOrder = sortNumbersInAscendingOrder(num1, num2, num3);
		
		System.out.println("Brojevi u rastucem redoslijedu su: ");
		
		//ispis brojeva iz niza
		for (int i : arrayOfNumbersInAscendingOrder) {
			System.out.print(i + " ");
		}

	}

}

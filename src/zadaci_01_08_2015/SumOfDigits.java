package zadaci_01_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
 * Koristite sljedeæi header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) 
 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
public class SumOfDigits {

	/*
	 * Metoda sabira sve cifre prolijedjenog broja n i vraca njihov zbir
	 */
	public static int sumDigits(long n) {
		
		int sum = 0;//suma brojeva
		
		/*
		 * petlja sabira cifru po cifru (n % 10 je prva desna cifra) 
		 * dok broj ne dodje do nule (n /= 10 dijeli broj sa 10 u svakoj iteraciji)
		 */
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		return sum;//vracanje rezultata
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite cijeli broj cije cifre zelite sabrati: ");
		// uneseni broj
		long number = input.nextLong();
		input.close();

		// ispis rezultata
		System.out.println("Zbir cifara je: " + sumDigits(number));
	}

}

package zadaci_31_07_2015;

import java.util.Scanner;

/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja 
 * te ispisuje koje pakovanje ima bolju cijenu.
 */
public class BetterPrice {

	/*
	 * Metoda odredjuje i ispisuje koje pakovanje ima bolju cijenu
	 * racunajuci odnos cijene i tezine pakovanja
	 * @param firstPrice - cijena prvog pakovanja
	 * @param firstWeight - tezina prvog pakovanja
	 * @param secondPrice - cijena drugog pakovanja
	 * @param secondWeight - tezina drugog pakovanja
	 */
	public static void betterPrice(double firstPrice, double firstWeight,
			double secondPrice, double secondWeight) {

		// odnos cijene i tezine prvog pakovanja
		double firstRatio = firstPrice / firstWeight;

		// odnos cijene i tezine drugog pakovanja
		double secondRatio = secondPrice / secondWeight;

		// stampanje rezultata
		if (firstRatio > secondRatio) {
			System.out.println("Prvo pakovanje ima bolju cijenu.");
		} else if (firstRatio == secondRatio) {
			System.out.println("Pakovanja imaju isti odnos cijene i tezine.");
		} else {
			System.out.println("Drugo pakovanje ima bolju cijenu.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite cijenu i tezinu prvog pakovanja (cijena u markama, tezina u gramima): ");
		double firstPrice = input.nextDouble();// cijena prvog pakovanja
		double firstWeight = input.nextDouble();// tezina prvog pakovanja

		System.out.println("Unesite cijenu i tezinu drugog pakovanja (cijena u markama, tezina u gramima): ");
		double secondPrice = input.nextDouble();// cijena drugog pakovanja
		double secondWeight = input.nextDouble();// tezina drugog pakovanja

		input.close();
		
		//pronalazenje i stampanje bolje cijene
		betterPrice(firstPrice, firstWeight, secondPrice, secondWeight);

	}

}

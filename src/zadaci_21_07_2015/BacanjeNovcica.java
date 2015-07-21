package zadaci_21_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta.
 *  Nakon što se simulacija završi,
 *  program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */
public class BacanjeNovcica {
	/*
	 * metoda simulira bacanje novcica numOfCoinFlips puta
	 *  i ispisuje koliko se puta pojavila glava, a koliko pismo
	 */
	public static void coinFlip(int numOfCoinFlips) {
		int numOfHeads = 0;//broj pojavljivanja glave
		for (int i = 0; i < numOfCoinFlips; i++) {
			int result = (int) (Math.random() * 2);//ishod bacanja novcica je 0 ili 1, tj glava ili pismo
			if (result == 0) {
				numOfHeads++;//ako je ishod 0 povecavam broj pojavljivanja glave za 1
			}
		}
		//broj pojavljivanja pisma je jednak razlici broja bacanja i broja pojavljivanja glave
		System.out.println("Glava je bila ishod bacanja " + numOfHeads
				+ " puta, a pismo " + (numOfCoinFlips - numOfHeads) + " puta.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite koliko puta ce novcic biti bacen: ");
		int number = input.nextInt();//broj bacanja
		input.close();
		coinFlip(number);//pozivanje metode za simulaciju bacanja
	}

}

package zadaci_28_07_2015;

/*
 * Zadatak br. 2
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 
 */
public class TwinPrimes {
	/*
	 * metoda provjerava da li je broj prost i vraca true ako jeste, odnosno false ako nije
	 * parametar number: broj za koji zelimo provjeriti je l' prost ili ne
	 */
	public static boolean isPrime(int number) {
		boolean prime = true;
		for (int i = 2; i < number; i++) {//petlja za djelioce broja
			prime = true;
			if (number % i == 0) {//ako nema ostatka, broj je djeljiv sa "i" i nije prost
				prime = false;
				break;
			}

		}
		return prime;

	}

	public static void main(String[] args) {
		int counter = 0;//brojac za stampanje po liniji
		for (int i = 0; i < 10000; i++) {//petlja ide do 10 000 (def u zadatku)
			//ako je broj prost i ako je njegov par prost, onda ih stampa zajedno
			if (isPrime(i) && isPrime(i + 2) && i != 0 && i != 1) {
				counter++;
				System.out.print("(" + i + " " + (i + 2) + ") ");
				if (counter % 10 == 0) {//ako je ispisano 10 parova prelazi u novu liniju
					System.out.println();
				}

			}
		}
	}

}

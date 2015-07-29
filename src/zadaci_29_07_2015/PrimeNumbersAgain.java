package zadaci_29_07_2015;
/*
 * Zadatak br. 2
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
 */
public class PrimeNumbersAgain {
	/*
	 * metoda za printanje prostih brojeva u odredjenom rasponu
	 * i sa odredjenim brojem prostih brojeva po liniji
	 */
	public static void printPrime(int startNumber, int stopNumber,
			int numsPerLine) {

		int count = 0;//brojac brojeva po liniji
		System.out.println("Prosti brojevi su: ");
		for (int i = startNumber; i <= stopNumber; i++) {//petlja se vrti u rasponu od startNumber do stopNumber
			boolean isPrime = true;//isPrime oznacava da li je broj prost ili ne
			/*	
			 * provjeravamo da li je broj prost tako sto ga dijelimo sa brojevima od 2 do tog broja
			 */
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {//ukoliko je broj djeljiv nekim brojem osim samim sobom, onda nije prost
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 0 && i != 1) {//ako je broj prost, i ako nije 0 i 1 onda ga stampamo
				count++;
				System.out.print(i + " ");
				if (count % numsPerLine == 0) {//ako je isprintan zadat broj brojeva po liniji, onda prelazi u novi red
					System.out.println();
				}

			}
		}
	}

	public static void main(String[] args) {
		 printPrime(2,1000,8);//printanje prostih brojeva od 2 do 1000, sa 8 brojeva po liniji
	}

}

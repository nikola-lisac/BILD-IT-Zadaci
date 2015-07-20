package zadaci_20_07_2015;

/*
 * Zadatak br. 4
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 
 * te ispisuje koliko se puta koji broj ponovio.
 */
public class BrojacNasumicnihBrojeva {

	public static void main(String[] args) {
		int number = 0;// promjenljiva kojoj cemo dodjeljivati vrijednost nasumicih brojeva
		int[] counter = new int[10];// brojac ponavljanja brojeva od 0 do 9
		for (int i = 0; i < 100; i++) {
			number = (int) (Math.random() * 10);

			/*
			 * povecavamo vrijednost brojaca za jedan na indeksu
			 *  koji pripada vrijednosti nasumicno generisanog broja
			 */
			counter[number]++;
		}
		// stampanje rezultata
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponovio " + counter[i]
					+ " puta.");
		}

	}

}

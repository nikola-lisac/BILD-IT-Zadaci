package zadaci_21_07_2015;

/*
 * Zadatak br. 1
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji,
 * od godine 101 do 2100, odvojene jednim spaceom.
 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 */
public class PrestupneGodine {

	public static void main(String[] args) {
		int counter = 0;// brojac prestupnih godina
		// 101 i 2100 su ogranicenja jer je u zadatku definisano da racuna
		// prestupne godine od 101. do 2100.
		for (int i = 101; i <= 2100; i++) {
			//godina je prestupna ako je djeljiva sa 4 i ako nije djeljiva sa 100, ali jeste sa 400
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				if (counter % 10 == 0) {//ispisivanje 10 godina po liniji, kad ispise 10, prelazi u novi red
					System.out.print("\n" + i + " ");
				} else {
					System.out.print(i + " ");
				}
				counter++;

			}

		}
		//ispis ukupnog broja prestupnih godina
		System.out.println("\nUkupan broj prestupnih godina je: " + counter);

	}

}

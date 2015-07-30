package zadaci_30_07_2015;
/*
 * Zadatak br. 1
 * Pretpostavimo da se registarska tablica za auto sastoji od 
 * tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 */
public class LicencePlate {

	public static void main(String[] args) {
		System.out.println("Program za generisanje registarske tablice.");
		String licencePlate = "";//promjenljiva u koju cemo smjetiti oznaku registarske table
		//dodavanje slova (prva tri znaka tablice su velika slova
		for (int i = 0; i < 3; i++) {
			licencePlate += (char) (65 + Math.random() * 26);
		}
		//dodavanje "-" i cetverocifrenog broja 
		licencePlate += "-" + ((int) (Math.random() * 9000) + 1000);
		//ispis tablice
		System.out.println("Oznaka registarske tablice je: " + licencePlate);

	}

}

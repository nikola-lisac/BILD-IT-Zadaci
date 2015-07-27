package zadaci_27_07_2015;

/*
 * Zadatak br. 3
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. 
 * Razmak izmeðu brojeva treba biti taèno jedan space. 
 */
public class BrojeviDjeljiviSa5I6 {
	/*
	 * metoda za ispisivanje brojeva u rasponu od 100 do 1000, djeljivih sa 5 i 6
	 */
	public static void printNumbersDivisibleBy5And6() {
		int counter = 1;// brojac brojeva po liniji
		System.out.println("Brojevi u rasponu od 100 do 1000, koji su djeljivi sa 5 i 6:\n");
		for (int i = 100; i < 1000; i++) {// u rasponu od 100 do 1000
			if (i % 5 == 0 && i % 6 == 0) {//ako je broj djeljiv i sa 5 i sa 6
				if (counter % 10 == 0) {//ako je broj brojeva po liniji 10
					System.out.println(i + " ");//ispisi broj u novoj liniji
				} else {
					System.out.print(i + " ");//u suprotnom ispis broj u istoj liniji
				}
				counter++;
			}
		}
	}

	public static void main(String[] args) {
		printNumbersDivisibleBy5And6();//ispisi brojeve djeljive sa 5 i 6
	}

}

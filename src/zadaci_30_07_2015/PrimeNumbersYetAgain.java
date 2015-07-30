package zadaci_30_07_2015;

/*
 * Zadatak br. 3
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) 
 * koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu 
 * i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
public class PrimeNumbersYetAgain {
	/*
	 * U zadatku metoda je definisana da vraca int vrijednost, mislim da nema
	 * potrebe za tim jer bih stavio da vraca 0 ili 1, a to mogu izvesti i sa
	 * boolean
	 * 
	 * metoda provjerava da li je broj n prost ili ne i vraca true, ako jeste,
	 * odnosno false ako nije
	 */
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n == 0 || n == 1) {// brojevi 0 i 1 nisu prosti
			isPrime = false;
		}
		return isPrime;
	}

	public static void main(String[] args) {

		int count = 0; // brojac ispisanih brojeva po liniji
		
		int numPerLine=15; //zeljeni broj ispisanih brojeva po liniji
		
		for (int i = 0; i < 100000; i++) {//petlja ide od 0 do 100 000 (definisano u zadatku)
			
			if (isPrime(i)) {//ako je broj prost ispisujemo ga
				count++;
				System.out.print(i + " ");
				
				if(count % numPerLine == 0){
					System.out.println();
				}
			}
		}
	}
}

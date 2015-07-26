package zadaci_26_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 1
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
 */
public class ZbirTriRandomBroja {
	/*
	 * Metoda za generisanje nasumicnog dvocifrenog cijelog broja
	 */
	public static int generateRandomNumber() {
		int number = (int) (Math.random() * 100);//prom. number dodjeljujemo random broj
		return number;//vracamo tu promjenljivu
	}

	public static void main(String[] args) {
		int num1 = generateRandomNumber();//prvi random broj
		int num2 = generateRandomNumber();//drugi random broj
		int num3 = generateRandomNumber();//terci random broj
		int sum = num1 + num2 + num3;//zbir ta tri broja
		
		boolean isCorrect = false;//promjenljiva za kontrolu petlje
		Scanner input = new Scanner(System.in);
		
		while (!isCorrect) {//dok je odgovor pogresan
			System.out.println("Koliko je " + num1 + " + " + num2 + " + "
					+ num3 + "?");//pitanje za korisnika
			
			int answer = input.nextInt();//odgovor korisnika
			
			if (answer != sum) {//ako odgovor nije jednak zbiru tj. ako je odgovor netacan
				System.out.println("Pogresan odgovor, pokusajte ponovo.");//ispisuje tu poruku
			} else {//ako je odgovor jednak sumi tj. ako je tacan
				System.out.println("Cestitamo, odgovor je tacan!");//ispisuje poruku
				isCorrect = true;//kontrolnu promjenljivu postavljamo na true kako bi izasli iz petlje
			}

		}
		input.close();
	}

}

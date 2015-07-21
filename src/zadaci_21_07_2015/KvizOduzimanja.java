package zadaci_21_07_2015;
/*
 * Zadatak br. 2
 * Napisati metodu koja prima jedan argument, broj pitanja,
 * te generiše toliko nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
 */
import java.util.Scanner;

public class KvizOduzimanja {
	//metoda za generisanje pitanja
	public static void quiz(int numberOfQuestions) {
		Scanner input = new Scanner(System.in);
		int counterOfCorrectAnswers = 0;//brojac tacnih odgovora
		for (int i = 0; i < numberOfQuestions; i++) {
			int numOne = (int) (Math.random() * 10);//prvi jednocifren random broj
			int numTwo = (int) (Math.random() * 10);//drugi jednocifren random broj
			
			//ukoliko je prvi broj manji od drugog, mijenjam im mjesta
			if (numOne < numTwo) {
				int temp = numOne;
				numOne = numTwo;
				numTwo = temp;
			}
			
			System.out.print("Koliko je " + numOne + " - " + numTwo + "? ");
			int userAnswer = input.nextInt();//odgovor korisnika
			//ukoliko je odgovor tacan, brojac tacnih odgovora se povecava za 1
			if (userAnswer == (numOne - numTwo)) {
				counterOfCorrectAnswers++;
			}
		}
		input.close();
		/*
		 * ispis broja tacnih i netacnih odgovora
		 * broj netacnih odgovora jednak je razlici broja pitanja i broja tacnih odgovora
		 */
		System.out.println("\nBroj tacnih odgovora: " + counterOfCorrectAnswers
				+ "\nBroj netacnih odgovora: "
				+ (numberOfQuestions - counterOfCorrectAnswers));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite zeljeni broj pitanja: ");
		int numOfQuestions = input.nextInt();//broj pitanja
		quiz(numOfQuestions);//pozivanje metode za generisanje pitanja
		input.close();
	}

}

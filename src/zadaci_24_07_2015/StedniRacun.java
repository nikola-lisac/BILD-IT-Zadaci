package zadaci_24_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje 
 * te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
 */
public class StedniRacun {
	/*
	 * Metoda racuna iznos na stednom racunu nakon odredjenog broja mjeseci
	 * parametar a: mjesecni iznos koji se uplacuje na racun
	 * parametar b: broj mjeseci koliko traje stednja
	 * metoda vraca stanje racuna
	 */
	public static double calculateSavings(int amount, int months) {
		double interestRate = 0.05;//godisnja kamata
		double monthlyInterestRate = interestRate / 12;//mjesecna kamata
		double savingsAmount = 0;//iznos na racunu
		for (int i = 0; i < months; i++) {
			savingsAmount = (amount + savingsAmount)
					* (1 + monthlyInterestRate);//formula za racunanje iznosa stednog racuna
		}
		return savingsAmount;
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite mjesecni iznos stednje: ");
			int amount = input.nextInt();//mjesecni iznos
			System.out.print("Unesite broj mjeseci: ");
			int months = input.nextInt();//broj mjeseci stednje
			
			double savingsAmount = calculateSavings(amount, months);//stanje racuna
			
			System.out.print("\nIznos na vasem racunu nakon " + months
					+ " mjeseci je: ");
			System.out.printf("%.3f", savingsAmount);//stampanje stanja racuna zaokruzeno na 3 decimale
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos. " + e);
		} finally {
			input.close();
		}
	}

}

package zadaci_25_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 1
 * 1. Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina 
 * te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko unesete kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu
 * i 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */
public class VrijednostInvesticije {
	
	/*
	 * Metoda za izracunavanje vrijednosti investicije nakon odredjenog broja godina
	 * parametar investment predstavlja vrijednost investicije
	 * parametar yearlyInterestRate je godisnja kamatna stopa
	 * parametar numOfYears je broj godina potrebnih za povrat investicije
	 */
	public static double calculateValueOfInvestment(double investment,
			double yearlyInterestRate, int numOfYears) {
		double monthlyInterestRate = (yearlyInterestRate / 100) / 12;//mjesecna kamatna stopa
		//izracunavanje vrijednosti investicije prema formuli iz zadatka
		double valueOfInvestment = investment
				* Math.pow((1 + monthlyInterestRate), (numOfYears * 12));
		return valueOfInvestment;//vracanje vrijednosti investicije
	}

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite iznos investicije: ");
			double investment = input.nextDouble();//pocetni iznos investicije
			System.out.print("Unesite godisnju kamatnu stopu u procentima: ");
			double yearlyInterestRate = input.nextDouble();//godisnja kamatna stopa
			System.out.print("Unesite broj godina: ");
			int years = input.nextInt();//broj godina za obrt
			
			double investmentValue = calculateValueOfInvestment(investment,
					yearlyInterestRate, years);//obracunavanje vrijednosti investicije
			
			System.out.print("Buduca vrijednost investicije je: ");
			System.out.printf("%.2f", investmentValue);//ispis rezultata
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		} finally {
			input.close();
		}
	}

}

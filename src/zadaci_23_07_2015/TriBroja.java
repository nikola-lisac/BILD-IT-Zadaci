package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 3
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */
public class TriBroja {
	/*
	 * Metoda za ispisivanje sortiranih brojeva
	 * Smjestam brojeve u niz, sortiram taj niz u rastucem redoslijedu i ispisujem ga
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3){
		double[] array={num1,num2,num3};//smjestanje brojeva u niz
		Arrays.sort(array);//sortiranje niza u rastucem redoslijedu
		System.out.print("\nSortirani brojevi u rastucem redoslijedu: ");
		for(double e:array){
			System.out.print(e+" ");//ispisivanje svakog elementa sortiranog niza
		}
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite tri decimalna broja: ");
		double num1=0;//prvi broj
		double num2=0;//drugi broj
		double num3=0;//treci broj
		/*
		 * koristim try-catch u slucaju da korisnik unese pogresnu vrijednost (npr. slovo)
		 * da ne dodje do neocekivanog(abnormalnog) prekida programa
		 */
		try{
			num1=input.nextDouble();
			num2=input.nextDouble();
			num3=input.nextDouble();
		}catch(InputMismatchException e){//u slucaju da korisnik unese pogresnu vrijednost, ispisuje mu poruku i prekida program
			System.out.println("Unijeli ste pogresnu vrijednost!");
			System.exit(0);
		}finally{
			input.close();//zatvaranje skenera
		}
		displaySortedNumbers(num1,num2,num3);//pozivanje metode za ispis sortiranih brojeva
	}

}

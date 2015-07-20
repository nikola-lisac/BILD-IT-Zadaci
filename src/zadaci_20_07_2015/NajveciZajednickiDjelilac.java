package zadaci_20_07_2015;

import java.util.Scanner;
/*
 * Zadatak br. 3
 * Napisati metodu koja prima dva cijela broja kao argumente
 * te vraæa najveæi zajednièki djelilac za ta dva broja.
 */
public class NajveciZajednickiDjelilac {
	//metoda za pronalazenje najveceg zajednickog djelioca
	public static int commonDivisor(int a, int b) {
		int result = 0;
		int limit = 0;//ogranicenje petlje
		if (a >= b) {
			limit = b;//ako je b manji broj, petlja ce se vrtiti do njegove vrijednosti
		} else {
			limit = a;//ako je a manji broj, petlja ce se vrtiti do njegove vrijednosti
		}
		for (int i = 1; i <= limit; i++) {
			//ako su i a i b djeljivi brojem i, onda je njihov zajednicki djelilac taj broj i
			if (a % i == 0 && b % i == 0) {
				result = i;//prom. result dodjeljujemo vrijednost i
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja: ");
		int numOne = input.nextInt();//prvi broj
		int numTwo = input.nextInt();//drugi broj
		input.close();
		
		int result = commonDivisor(numOne, numTwo);//promjenljivoj result dodjeljujemo vrijednost najveceg zajednickog djelioca
		//stampanje rezultata
		System.out.println("Najveci zajednicki djelilac za brojeve " + numOne
				+ " i " + numTwo + " je: " + result);
	}

}

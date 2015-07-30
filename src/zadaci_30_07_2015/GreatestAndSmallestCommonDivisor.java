package zadaci_30_07_2015;

/*
 * Zadatak br. 2
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja 
 * te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */
import java.util.Scanner;

public class GreatestAndSmallestCommonDivisor {
	/*
	 * Metoda pronalazi najveci zajednicki djelilac brojeva a i b i vraca ga
	 */
	public static int greatestCommonDivisor(int a, int b) {
		int gcd = 1;// najveci zajednicki djelilac

		for (int i = 2; i <= a && i <= b; i++) {
			// ako su i a i b djeljivi brojem i, onda je njihov zajednicki djelilac taj broj i
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	/*
	 * Metoda pronalazi najmanji zajednicki djelilac brojeva a i b i vraca ga
	 */
	public static int smallestCommonDivisor(int a, int b) {
		int scd = 1;// najmanji zajednicki djelilac

		for (int i = 2; i <= a && i <= b; i++) {
			// ako su i a i b djeljivi brojem prvim brojem i, onda je njihov najmanji zajednicki djelilac taj broj i
			if (a % i == 0 && b % i == 0) {
				scd = i;
				break;
			}
		}
		return scd;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite dva pozitivna cijela broja: ");
		// korisnik unosi brojeve
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		
		input.close();
		
		// najveci zajednicki djelilac
		int gcd = greatestCommonDivisor(firstNumber, secondNumber);

		// najmanji zajednicki djelilac
		int scd = smallestCommonDivisor(firstNumber, secondNumber);

		if (gcd == 1 && scd == 1) {
			System.out.println("Uneseni brojevi nemaju zajednicki djelilac.");
		}
		else if (gcd == scd ){
			System.out.println("Najveci i najmanji zajednicki djelilac su jednaki, i iznose: "+gcd);
		}
		else{
			System.out.println("Najmanji zajednicki djelilac je: "+scd+"\nNajveci zajednicki djelilac je: "+gcd);
		}
	}

}

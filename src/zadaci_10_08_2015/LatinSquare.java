package zadaci_10_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 8.36
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters, 
 * each occurring exactly once in each row and once in each column.
 * Write a program that prompts the user to enter the number n and the array of characters,
 * as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */
public class LatinSquare {

	/*
	 * Metoda povjerava da li je proslijedjeni 2d niz slova latinska kocka i vraca true ako jeste,
	 * odnosno false ako nije
	 * Latinska kocka je 2d niz u kome se svako pojavljuje samo jednom u svakom redu i svakoj koloni
	 */
	public static boolean isLatinSquare(char[][] square) {

		for (int i = 0; i < square.length; i++) {
			
			/*provjerava da li redovi niza imaju karaktere koji se ponavljaju
			 * ako imaju znaci da to nije latinska kocka i vraca false
			 */
			if (hasRepeatedChars(square[i])) {
				return false;
			}
			
			//jednodimenzionalni niz u kome ce biti smjestena slova svake kolone
			char[] col = new char[square[i].length];
			
			for (int j = 0; j < square[i].length; j++) {
				col[j] = square[j][i];//ubacujemo slova iz kolone u niz
			}
			
			//provjeravamo da li kolona ima slova koja se ponavljaju
			if (hasRepeatedChars(col)) {
				return false;
			}
		}
		
		return true;
	}

	/*
	 * Metoda provjeraa da li se u proslijedjenom nizu karaktera ponavljaju karakteri i
	 * vracu true, ako se ponavljaju, odnosno false ako se ne ponavljaju
	 */
	public static boolean hasRepeatedChars(char[] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return true;
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number n: ");
		//dimenzije kocke
		int n = input.nextInt();
		
		char[][] matrix = new char[n][n];
		System.out.println("Enter " + n
				+ " rows of letters separated by spaces: ");
		
		//unos slova u kocku
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				
				char character = input.next().charAt(0);
				character = Character.toUpperCase(character);
				
				//provjera da li je karakter van definisanih granica
				if ((int) character < 65 || (int) character > 65 + n) {
					System.out.println("Wrong input: the letters must be from A to " + (char) (65 + n));
					System.exit(0);
				}

				//dodavanje karaktera u kocku
				matrix[i][j] = character;
			}
		}
		input.close();
		
		//ispis rezultata
		if (isLatinSquare(matrix)) {
			System.out.println("The input array is a Latin square");
		}
		
		else {
			System.out.println("The input array is not a Latin square");
		}

	}

}

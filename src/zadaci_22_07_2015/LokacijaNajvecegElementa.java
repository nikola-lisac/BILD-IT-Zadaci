package zadaci_22_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. 
 * Metoda treba da koristi sljedeæi header:
 * public static int[ ] locateLargest(double[ ][ ] a)
 * Napisati test program koji pita korisnika da unese 2D niz 
 * te mu ispisuje lokaciju najveæeg elementa u nizu.
 */
public class LokacijaNajvecegElementa {
	public static int[] locateLargest(double[][] a) {
		double largestElement = a[0][0];//pocetni najveci element je element u nultom redu i nultoj koloni
		int[] largestElementCoords = new int[2];//niz u koji cemo smjestiti lokaciju najveceg elementa
		for (int i = 0; i < a.length; i++) {//petljama prolazimo sve redove i kolone
			for (int j = 0; j < a[i].length; j++) {
				/*
				 * ukoliko je element sa lokacijom[i][j] veci od trenutnog najveceg
				 * onda njega postavljamo kao najveceg, a njegovu lokaciju spremamo u largestElementCoords
				 */
				if (a[i][j] > largestElement) {
					largestElement = a[i][j];
					largestElementCoords[0] = i;//broj reda najveceg elementa
					largestElementCoords[1] = j;//broj kolone najveceg elementa
				}
			}
		}
		return largestElementCoords;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj redova matrice: ");
		int rowNum = input.nextInt();// broj redova
		System.out.print("Unesite broj kolona matrice: ");
		int columnNum = input.nextInt();// broj kolona
		double[][] matrix = new double[rowNum][columnNum];// deklaracija matrice sa zadanim brojem redova i kolona
		System.out.println("Unesite elemente matrice: ");
		/*unos elemenata u matricu*/
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		input.close();
		int[] coords = locateLargest(matrix);//promj. coords dodjeljujemo return locateLargest metode koja vraca lokaciju najveceg elementa
		System.out.println("Najveci element je: "
				+ matrix[coords[0]][coords[1]] + "\nNjegova lokacija je red: "
				+ coords[0] + "; kolona: " + coords[1]);//ispis najveceg elementa i njegove lokacije
	}
}

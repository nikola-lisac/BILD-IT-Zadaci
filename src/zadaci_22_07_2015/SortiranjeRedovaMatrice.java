package zadaci_22_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 5
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu
 * (ili da pita korisnika koliku matricu želi unijeti) 
 * te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
 */
public class SortiranjeRedovaMatrice {
	
	/*
	 * Metoda sortira redove matrice od najmanjeg elementa do najveceg
	 * i vraca sortiranu matricu
	 */
	public static double[][] sortRows(double[][] array) {
		double temp = 0;//promjenljiva koja sluzi za privremeno smjestanje vrijednosti
		for (int row = 0; row < array.length; row++) {//petlja koja prolazi sve redove
			for (int column = 0; column < array[row].length; column++) {//petlja koja prolazi sve kolone
				/*
				 * petlja prolazi sve naredne kolone u redu
				 * i poredi vrijednosti iz trenutne kolone sa svim ostalim vrijednostima u tom redu
				 * ukoliko element u narednoj koloni ima vecu vrijednost od elementa u trenutnoj koloni,
				 * mijenjamo im vrijedosti pomocu temp promjenljive
				 */
				for (int nextColumn = column + 1; nextColumn < array[row].length; nextColumn++) {
					if (array[row][nextColumn] < array[row][column]) {
						temp = array[row][column];
						array[row][column] = array[row][nextColumn];
						array[row][nextColumn] = temp;
					}
				}
			}
		}
		return array;//vracanje sortirane matrice
	}
	
	/*
	 *  metoda koja stampa sve elemente matrice
	 *  kad odstampa cijeli red prelazi u novi
	 */
	public static void printMatrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite duzinu kvadratne matrice: ");
		int matrixLength=input.nextInt();//duzina matrice
		double[][] matrix=new double[matrixLength][matrixLength];//deklaracija matrice
		System.out.println("Unesite elemente matrice: ");
		for (int row = 0; row < matrix.length; row++) {//petlje prolaze sve redove i kolone
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();//unos  elemenata u matricu
			}
		}
		input.close();
		double[][] sortedRowsMatrix=sortRows(matrix);//novoj promjenljivoj dodjeljujemo vrijednost matrice obradjene sortRows metodom
		System.out.println("\nMatrica sa sortiranim redovima: ");
		printMatrix(sortedRowsMatrix);//stampanje sortirane matrice
	}

}

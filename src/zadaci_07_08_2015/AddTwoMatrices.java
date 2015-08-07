package zadaci_07_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 8.5
 * (Algebra: add two matrices) Write a method to add two matrices. 
 * The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions 
 * and the same or compatible types of elements.
 *  Let c be the resulting matrix. Each element cij is aij + bij. 
 */
public class AddTwoMatrices {
	/*
	 * Metoda pravi novu matricu ciji je broj redova rows, a broj kolona columns
	 * i popunjava je unosom iz konzole
	 * Metoda vraca unesenu matricu
	 */
	public static double[][] enterAMatrix(int rows,int columns){
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[rows][columns];
		
		System.out.println("Enter "+rows+"-by-"+columns+" matrix: ");
		
		//unosenje vrijednosti u matricu
		for (int row = 0; row < matrix.length; row++) {
			
			for (int column = 0; column < matrix[row].length; column++) {
				
				matrix[row][column] = input.nextDouble();
			}
		}
		
		//vracanje matrice
		return matrix;
	}
	
	/*
	 * Metoda sabira dve matrice koje smo proslijedjene kao parametri a i b,
	 * pravi trecu matricu od zbira elemenata i vraca je
	 */
	public static double[][] addMatrix(double[][] a, double[][] b){
		
		//matrica cije je duzina jednaka duzini prve matrice
		double[][] matrix =  new double[a.length][a[0].length];
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int column = 0; column < matrix[row].length; column++) {
				
				//sabiranje elemenata na istim indeksima i unosenje u novu matricu na istom indeksu
				matrix[row][column] = a[row][column]+b[row][column];
			}
		}
		
		//vracanje matrice
		return matrix;
	}
	
	/*
	 * metoda provjerava da li matrice imaju iste dimenzije i
	 * vraca true ako imaju, odnosno false ako nemaju
	 */
	public static boolean haveSameDimensions(double[][] a, double[][] b){
		/*
		 * ako su brojevi redova i kolona dve matrice jednaki onda su matrice istih dimenzija
		 */
		for(int i=0;i<a.length;i++){
			if(a.length != b.length && a[i].length!=b[i].length){
				return false;
			}
		}
		return true;
	}
	
	public static void printMatrix(double[][] matrix){
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//prva matrica
		double[][] matrixOne = enterAMatrix(3, 3);
		
		//druga matrica
		double[][] matrixTwo = enterAMatrix(3, 3);
		
		double[][] addedMatrix;
		
		//ako su im dimenzije iste
		if(haveSameDimensions(matrixOne,matrixTwo)){
			
			//matrica koja je rezultat sabiranja dve matrice
			addedMatrix = addMatrix(matrixOne,matrixTwo);
			
			//stampanje matrica i rezultantne matrice
			System.out.println();
			printMatrix(matrixOne);
			System.out.println("     +");
			printMatrix(matrixTwo);
			System.out.println("     = ");
			printMatrix(addedMatrix);
		}
		else {
			System.out.println("Matrices don't have the same dimensions.");
		}
		
	
	}

}

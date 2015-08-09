package zadaci_09_08_2015;
/*
 * Zadatak br. 9.13
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue 
 * that store the maximal value and its indices in a two-dimensional array
 *  with row and column as int types and maxValue as a double type
 */
public class Location {
	
	public int row; //indeks reda
	public int column; // indeks kolone
	public double maxValue; // maksimalna vrijednosti
	
	Location(int row,int column,double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	/*
	 * Metoda koja prolazi kroz matricu, pronalazi najvecu vrijednost, 
	 * njene indekse reda i kolone, zatim vraca instancu klase Location 
	 * ciji su data fields indeksi i vrijednost najveceg elementa matrice
	 */
	public static Location locateLargest(double[][] a) {
		double maxValue = a[0][0];//najveca vrijednost matrice
		int row = 0;//indeks reda najvece vrijednosti
		int column = 0;//indeks kolone najvece vrijednosti
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				/*
				 * ako je element sa indeksima i,j veci od trenutne max vrijednosti
				 * onda je nova maksimalna vrijednost taj element
				 * a indeksi su njegovi indeksi i,j
				 */
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		//vracanje instance klase location sa indeksima i maksimalnom vrijednoscu
		return new Location(row, column, maxValue);
	}
	
}

package zadaci_08_08_2015;

import java.util.Arrays;

/*
 * Zadatak 8.10
 *  Write a method to sort a two-dimensional array using the following header:
 *  public static void sort(int m[][])
 *  The method performs a primary sort on rows and a secondary sort on columns.
 *  For example, the following array
 *  {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 *  will be sorted to
 *  {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
public class SortingMatrix {
	/*
	 * Metoda za sortiranje zadate matrice po datom kriterijumu
	 */
	public static void sort(int m[][]) {
		   String[] nums = new String[m.length];//niz u koji cemo smjestati redove
           Arrays.fill(nums, "");
           //smestamo redove u niz
           for (int i = 0; i < m.length; i++) {
                   for (int j = 0; j < m[i].length; j++) {
                           nums[i] += String.valueOf(m[i][j]) + " ";

                   }
           }
           
           Arrays.sort(nums);
           System.out.print("{");
           for (int i = 0; i < nums.length; i++) {
                   System.out.print("{"+nums[i].charAt(0)+","+nums[i].charAt(2)+"}");
           }
           System.out.print("}");

	}

	public static void main(String[] args) {
		int[][] matrix = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};//matrica
		sort(matrix);//sortiranje i ispis matrice

	}

}

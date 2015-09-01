package opcioni_zadaci_01_09_2015;

/**
 * (Sum series) Write a recursive method to compute the following series: m(i)
 * =1/2 + 2/3 + ... + i/(i+1) Write a test program that displays m(i) for i = 1,
 * 2, . . ., 10.
 * 
 * @author Nikola
 *
 */
public class Zadatak05SumSeries {

	/**
	 * Recursive method for computing the following series: 
	 * m(i) =1/2 + 2/3 + ... + i/(i+1)
	 * 
	 * @param i
	 *            number which defines the series
	 *            
	 * @return sum of the series
	 */
	public static double sum(int i) {
		// base case
		if (i == 0) {
			return 0.0;
		} else {
			return i / (double) (i + 1) + sum(i - 1);
		}
	}

	public static void main(String[] args) {

		// printing the sum of the series for i = 1, 2,..., 10
		for (int i = 1; i <= 10; i++) {
			System.out.printf("m(" + i + ") = %.2f", sum(i));
			System.out.println();
		}

	}

}

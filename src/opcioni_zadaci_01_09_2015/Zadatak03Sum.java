package opcioni_zadaci_01_09_2015;

/**
 * (Sum series) Write a recursive method to compute the following series: m(i) =
 * 1 + 1/2 + 1/3 + ... + 1/i Write a test program that displays m(i) for i = 1,
 * 2, . . ., 10
 * 
 * @author Nikola
 *
 */
public class Zadatak03Sum {

	/**
	 * Recursive method for calculation sum of the series 1 + 1/2 + 1/3 + ... +
	 * 1/i
	 * 
	 * @param i
	 *            the last number if serie
	 * @return sum of the series
	 */
	public static double sum(int i) {
		// base case
		if (i == 1) {
			return 1.0;
		} else {
			return 1.0 / i + sum(i - 1);
		}
	}

	public static void main(String[] args) {

		// printing sum of the series for i = 2,3,...,10
		for (int i = 1; i <= 10; i++) {
			System.out.printf("m(" + i + ") = %.2f", sum(i));
			System.out.println();
		}
	}

}

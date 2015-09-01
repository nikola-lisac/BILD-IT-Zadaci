package opcioni_zadaci_01_09_2015;

/**
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also be
 * defined recursively as follows: If m % n is 0, gcd(m, n) is n. Otherwise,
 * gcd(m, n) is gcd(n, m % n). Write a recursive method to find the GCD. Write a
 * test program that prompts the user to enter two integers and displays their
 * GCD.
 * 
 * @author Nikola
 *
 */
public class Zadatak02GreatestCommonDivisor {

	/**
	 * Finding greatest common divisor for two integers
	 * 
	 * @param m
	 *            first number
	 * @param n
	 *            second number
	 * @return gcd
	 */
	public static int gcd(int m, int n) {
		// base case
		if (m % n == 0) {
			return n;
		}
		return gcd(n, m % n);

	}

	public static void main(String[] args) {
		
		System.out.println("Enter two integers: ");
		// protected input from keyboard
		int number1 = helpClasses.Methods.inputInt();
		int number2 = helpClasses.Methods.inputInt();

		// print result
		System.out.println(
				"Greatest common divisor for " + number1 + " and " + number2 + " is: " + gcd(number1, number2));
	}

}

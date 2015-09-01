package opcioni_zadaci_01_09_2015;

/**
 * zadatak 18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
 * iterations. Hint: To compute fib(n) without recursion, you need to obtain
 * fib(n - 2) and fib(n - 1) first. Write a test program that prompts the user
 * to enter an index and displays its Fibonacci number.
 * 
 * @author Nikola
 *
 */
public class Zadatak01Fibonacci {

	/**
	 * Finding fibonacci number on index n
	 * 
	 * @param n
	 *            index of the fibonacci number
	 * @return fibonacci number
	 */
	public static int fib(int n) {

		// if index is 0 or 1 return 0 and 1
		if (n == 1 || n == 0) {
			return n;
		}

		int f0 = 0; // fibonacci number on (index - 2)
		int f1 = 1; // fibonacci number on (index -1)
		int currentFib = 0; // fibonacci on current index
		for (int i = 2; i <= n; i++) {
			currentFib = f0 + f1; // fib on current index
			f0 = f1;
			f1 = currentFib;
		}

		// return fibonacci number
		return currentFib;
	}

	public static void main(String[] args) {

		System.out.print("Enter the index for a Fibonacci number: ");
		int n = helpClasses.Methods.inputInt(); // protected input from keyboard

		// printing result
		System.out.println("The Fibonacci number at index " + n + " is: " + fib(n));
	}

}

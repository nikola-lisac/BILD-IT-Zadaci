package zadaci_12_08_2015;

/**
 * 
 * @author Nikola Lisicic
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order. 
 * For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * retrieve and display them in reverse order.
 *
 */
import java.util.Scanner;

public class PrimeFactors {

	/**
	 * Finding and printing smallest factors of a number
	 * 
	 * @param number
	 *            the number we want to find the smallest factors of
	 */
	public static void findAndPrintFactorsOfANumber(int number) {
		StackOfIntegers stack = new StackOfIntegers();
		int i = 2;// potencial factors
		while (number != 1) {// calculate factors until the number is 1
			if (number % i != 0) {// if there is remainder "i" is not a factor
				i++;
			} else {
				number /= i;// dividing the number so we can find other factors
				stack.push(i);// pushing a factor to the stack
			}
		}

		System.out.println("Smallest factors are:");
		// printing factors from the stack
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();//entered number
		input.close();
		findAndPrintFactorsOfANumber(number);//printing factors

	}

}

package opcioni_zadaci_02_09_2015;

/**
 * (Print the digits in an integer reversely) Write a recursive method that displays
 * an int value reversely on the console using the following header:
 * public static void reverseDisplay(int value)
 * For example, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal
 * @author Nikola
 *
 */
public class Zadatak01ReverseInteger {

	/**
	 * Recursive method which displays the number in reverse order
	 * 
	 * @param value
	 *            integer number to display in reverse order
	 */
	public static void reverseDisplay(int value) {
		// if the number is greater then 10, print right-most digit and
		// call the method again with the right most degit removed (number is
		// divided by 10)
		if (value >= 10) {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
		// if the number is smaller than 10, print the number (base case)
		else {
			System.out.print(value);
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter an integer: ");
		// getting protected input from keyboard
		int number = helpClasses.Methods.inputInt();

		System.out.println("Reverse number: ");
		// printing result
		reverseDisplay(number);
	}

}

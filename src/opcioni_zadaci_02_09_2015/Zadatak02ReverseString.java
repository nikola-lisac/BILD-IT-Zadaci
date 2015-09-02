package opcioni_zadaci_02_09_2015;


/**
 * (Print the characters in a string reversely) Write a recursive method that
 * displays a string reversely on the console using the following header: 
 * public static void reverseDisplay(String value) 
 * For example, reverseDisplay("abcd") displays dcba. 
 * Write a test program that prompts the user to enter a string
 * and displays its reversal.
 * 
 * @author Nikola
 *
 */
public class Zadatak02ReverseString {

	/**
	 * Recursive method for printing the string in reversed order Method prints
	 * last char of the string if the string is greater than 1, then calls
	 * itself again with the substring of the value string as parameter
	 * Substring is the string with last char removed
	 * 
	 * @param value
	 *            string to be printed in reverse order
	 */
	public static void reverseDisplay(String value) {
		// base case
		// if the length of the string is 1, print the string
		if (value.length() == 1) {
			System.out.print(value);
		}

		// if the length of the string is not 1, print the last char of the
		// string
		// and call the method again with substring of the value from char on
		// index 0 to the last but one char in the string
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter a string: ");
		// getting string input from kreyboard
		String string = helpClasses.Methods.inputNextLine();

		// printing reversed string
		System.out.println("Reversed string: ");
		reverseDisplay(string);
	}

}

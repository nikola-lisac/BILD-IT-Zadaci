package opcioni_zadaci_02_09_2015;

/**
 * (Occurrences of a specified character in a string) Write a recursive method
 * that finds the number of occurrences of a specified letter in a string using
 * the following method header: public static int count(String str, char a) For
 * example, count("Welcome", 'e') returns 2. Write a test program that prompts
 * the user to enter a string and a character, and displays the number of
 * occurrences for the character in the string.
 * 
 * @author Nikola
 *
 */
public class Zadatak03OccurencesOfALetter {

	/**
	 * Recursive method for counting the occurences of the defined character a,
	 * in the defined string str Method calls itself if the last index in string
	 * is defined character a and adds 1, and if the char on last index isn't
	 * the defined char but length of the string is greater than 0 when
	 * recursion is happening, the parametar that is passed is the substring of
	 * the defined string str with the last character removed
	 * 
	 * @param str
	 *            string in which the counting of occurences is done
	 * @param a
	 * @return
	 */
	public static int count(String str, char a) {
		// if the length is 0, it returns zero
		if (str.length() < 1) {
			return 0;
		}

		// if the length is greater than zero and the char last char is the
		// defined char
		// do recursion and add 1
		else if (str.length() >= 1 && str.charAt(str.length() - 1) == a) {
			return 1 + count(str.substring(0, str.length() - 1), a);
		}

		// if the last char isn't defined char, do recursion and add 0
		else {
			return 0 + count(str.substring(0, str.length() - 1), a);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter a string: ");
		// user inputs a string
		String str = helpClasses.Methods.inputNextLine();

		System.out.println("Enter a character to count it's occurences: ");
		// user inputs a char
		char ch = helpClasses.Methods.inputChar();

		// printing result
		System.out.println("Number of occurences: " + count(str, ch));
	}

}

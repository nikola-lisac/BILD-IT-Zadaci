package zadaci_15_08_2015;

import java.util.Arrays;

/**
 * 10.22
 * (Implement the String class) The String class is provided in the Java
 * library. Provide your own implementation for the following methods (name the
 * new class MyString1): public MyString1(char[] chars); public char charAt(int
 * index); public int length(); public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase(); public boolean equals(MyString1 s); public
 * static MyString1 valueOf(int i);
 * 
 * @author Nikola Lisicic
 */
public class MyString1 {
	public char[] value; // array where all characters are saved
	public int size; // number of characters in the value array

	/** Constructor which copies argument array in the value array */
	public MyString1(char[] chars) {
		this.size = chars.length;
		this.value = Arrays.copyOf(chars, size);
	}

	/**
	 * Finding the number of characters
	 * 
	 * @return number of characters
	 */
	public int length() {
		return this.size;

	}

	/**
	 * Finding character at defined index
	 * 
	 * @param index
	 *            position on which the desired character is
	 * @return character on defined position
	 */
	char charAt(int index) {
		if ((index < 0) || (index >= size)) {
			System.out.println("Unavailable index.");
			return ' ';
		} else {
			return this.value[index];
		}
	}

	/**
	 * Getting a substring from index begin to index end
	 * 
	 * @param begin
	 *            starting index of a substring
	 * @param end
	 *            ending index of a substring
	 * @return substring
	 */
	public MyString1 substring(int begin, int end) {
		char[] chars = new char[end - begin];
		for (int i = 0, j = begin; i < chars.length && j < end; i++, j++) {
			chars[i] = this.value[j];
		}
		return new MyString1(chars);
	}

	/**
	 * Converting uppercase characters to lower case
	 * 
	 * @return new string with lowercase characters
	 */
	public MyString1 toLowerCase() {
		char[] chars = new char[this.length()];
		for (int i = 0; i < this.length(); i++) {
			chars[i] = Character.toLowerCase(this.charAt(i));
		}

		return new MyString1(chars);
	}

	/**
	 * Checking if two strings are the same
	 * 
	 * @param s
	 *            string to compare to calling instance
	 * @return true if they are the same, otherwise false
	 */
	public boolean equals(MyString1 s) {
		if (this.length() != s.length()) {
			return false;
		}
		for (int i = 0; i < this.length(); i++) {
			if (this.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Converting an integer to string
	 * 
	 * @param number
	 *            integer to convert to string
	 * @return new MyString1 instance with converted digits to characters
	 */
	public static MyString1 valueOf(int i) {
		int numberOfDigits = 0;
		int number = i;

		// calculating number of digits of the number
		while (i > 0) {
			i /= 10;
			numberOfDigits++;
		}

		// char array with the length of number of digits
		char[] chars = new char[numberOfDigits];

		// adding all digits of the number to char array from right to left
		for (int j = chars.length - 1; j >= 0; j--) {
			if (number < 10) {
				chars[j] = (char) ('0' + number);
			} else {
				chars[j] = (char) ('0' + number % 10);
				number /= 10;
			}
		}

		// returning new string with digits
		return new MyString1(chars);
	}

	/** overriden toString method */
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.length(); i++) {
			str += this.charAt(i);
		}

		return str;
	}

	/** tests of the methods */
	public static void main(String[] args) {
		
		char[] c1 = { 'n', 'i', 'k', 'o', 'l', 'a' };
		MyString1 s1 = new MyString1(c1);
		System.out.println("Testing class constructor: " + s1.toString());

		MyString1 s2 = valueOf(5362);
		System.out.println("Testing valueOf 5326: " + s2.toString());

		char character = s1.charAt(2);
		System.out.println("Testing charAt, first string, index 2: "
				+ character);

		MyString1 substr = s1.substring(0, 4);
		System.out.println("Testing substring of the first string(0,4): "
				+ substr);

		MyString1 s3 = new MyString1(new char[] { 'T', 'e', 'S', 'T', 'i', 'N',
				'g' });
		System.out.println("String 3: " + s3.toString());
		MyString1 lowercase = s3.toLowerCase();
		System.out.println("Testing toLowerCase on string 3: " + lowercase);
		System.out.println("Testing length of the string 3: " + s3.length());

		char[] c2 = { 'n', 'i', 'k', 'o', 'l', 'i' };
		MyString1 s4 = new MyString1(c2);
		System.out.println("String 1: " + s1.toString());
		System.out.println("String 4: " + s4.toString());
		System.out.println("Testing equals on string 1 and string 4: "
				+ s1.equals(s4));
	}

}

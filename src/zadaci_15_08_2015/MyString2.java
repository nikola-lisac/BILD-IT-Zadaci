package zadaci_15_08_2015;

import java.util.Arrays;

/**
 * 
 * **10.23 (Implement the String class) The String class is provided in the Java
 * library. Provide your own implementation for the following methods 
 * (name the new class MyString2): 
 * public MyString2(String s); 
 * public int compare(String s); 
 * public MyString2 substring(int begin); 
 * public MyString2 toUpperCase();
 * public char[] toChars(); 
 * public static MyString2 valueOf(boolean b);
 * 
 * @author Nikola Lisicic
 *
 */
public class MyString2 {
	public char[] value; // array where all characters are saved
	public int size; // number of characters in the value array

	/** class constructor */
	public MyString2(String s) {
		size = s.length();
		value = new char[size];
		for (int i = 0; i < s.length(); i++) {
			value[i] = s.charAt(i);
		}

	}
	
	/** constructor with the char array as parameter */
	public MyString2(char[] chars){
		this.size = chars.length;
		this.value = Arrays.copyOf(chars, size);
	}

	/**
	 * Lexicographically comparing instance to a string 
	 * @param s string to compare an instance with
	 * @return   0 if they are lexicographically equal,
	 * 			 -1 if string s is lexicographically greater than instance, 
	 * 			 1 if string s is lexicographically smaller than instance,
	 */
	public int compare(String s) {
		int returnValue = -2;

		if (this.size > s.length()) {
			returnValue = 1;
		} else if (this.size < s.length()) {
			returnValue = -1;
		} else {

			for (int i = 0; i < s.length(); i++) {
				if (this.value[i] > s.charAt(i)) {
					returnValue = 1;
					break;
				} else if (this.value[i] == s.charAt(i)) {
					returnValue = 0;
				} else {
					returnValue = -1;
					break;
				}
			}
			
		}

		return returnValue;

	}
	
	/**
	 * Getting a substring of an instance from index begin to the end of an instance
	 * @param begin  starting index of a substring
	 * @return  new instance with the substring
	 */
	public MyString2 substring(int begin){
		char[] chars = new char[this.size - begin];
		for (int i = 0, j = begin; i < chars.length && j<this.size ; i++, j++) {
			chars[i] = this.value[j];
		}
		return new MyString2(chars);
	}
	
	/**
	 * Converting lowercase characters to uppercase
	 * 
	 * @return new string with uppercase characters
	 */
	public MyString2 toUpperCase() {
		char[] chars = new char[this.size];
		for (int i = 0; i < this.size; i++) {
			chars[i] = Character.toUpperCase(value[i]);
		}

		return new MyString2(chars);
	}
	
	/**
	 * getting array of characters from an instance
	 * @return  array of characters
	 */
	public char[] toChars(){
		char chars[] = Arrays.copyOf(value, size);
		return chars;
		
	}
	
	/**
	 * Converting a boolean value to an instance (string)
	 * @param b boolean value
	 * @return instance with the "true" or "false" value
	 */
	public static MyString2 valueOf(Boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
	}
	
	/** overriden toString method */
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.size; i++) {
			str += this.value[i];
		}

		return str;
	}

	/** testing the methods */
	public static void main(String[] args) {
		//testing compare
		MyString2 s1 = new MyString2("nikola");
		System.out.println("String 1: "+s1.toString());
		System.out.println("Comparing string 1 to a string \"nikoli\": "+s1.compare("nikoli"));
		
		//testing substring
		MyString2 s2 = s1.substring(2);
		System.out.println("Substring of the string 1, from index 2: "+s2.toString());
		
		//testing valueOf
		MyString2 s3 = valueOf(true);
		System.out.println("valueOf (true): "+s3);
		
		//testing toChars() on s1
		char[] chars = s1.toChars();
		System.out.println("Characters of string 1: ");
		for(char c: chars){
			System.out.print(c+" ");
		}
		
		//testing toUpperCase()
		MyString2 s4 = new MyString2("bla bla");
		MyString2 s4Upper = s4.toUpperCase();
		System.out.println("\nNew string: "+s4.toString());
		System.out.println("New string toUpperSase: "+s4Upper);
		
	}

}

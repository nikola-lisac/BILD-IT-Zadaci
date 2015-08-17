package zadaci_15_08_2015;

/**
 * (Implement the StringBuilder class) The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);
 * public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 * 
 * @author Nikola Lisicic
 *
 */
public class MyStringBuilder1 {
	
	String str;

	public MyStringBuilder1(String s) {
		this.str = s;
	}

	/**
	 * Appending the parameter instance to the calling instance
	 * @param s  instance to add to the calling instance
	 * @return  new instance consisted of both instances
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.str += s.str);
	}

	/**
	 * Apending the integer to the calling instance
	 * @param i  integer which needs to be added to the instance
	 * @return  instance with an added integer to the calling instance
	 */
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.str += i);
	}

	/**
	 * Length of the instance string
	 * @return length of the instance string
	 */
	public int length() {
		return this.str.length();
	}

	/**
	 * Character at the defined index
	 * @param index  desired position of the character
	 * @return  character on the defined index
	 */
	public char charAt(int index) {
		return this.str.charAt(index);
	}

	/**
	 * Converting all upper case characters of the instance to lower case
	 * @return  new instance with lower case characters
	 */
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(this.str.toLowerCase());
	}

	/**
	 * Find and return a substring in defined range
	 * @param begin  starting index of the substring
	 * @param end    ending index of the substring
	 * @return    new instance with the substring
	 */
	public MyStringBuilder1 substring(int begin, int end) {
		String s = "";
		for (int i = begin; i <= end; i++) {
			s += this.str.charAt(i);
		}
		return new MyStringBuilder1(s);
	}

	/** overriden toString() method */
	@Override
	public String toString() {
		return this.str;
	}

	/** testing the methods */
	public static void main(String[] args) {
		//first string
		MyStringBuilder1 str1 = new MyStringBuilder1("Nikola");
		System.out.println("First string: "+str1.toString());
		//second string
		MyStringBuilder1 str2 = new MyStringBuilder1("Lisicic");
		System.out.println("Second string: "+str2.toString());
		
		//testing append(MyStringBuilder1)
		System.out.println("append(second string): "+str1.append(str2).toString());
		
		//testing append(int i)
		System.out.println("append(90): "+str1.append(90).toString());
		
		//testing toUpperCase
		System.out.println("toLowerCase: "+str1.toLowerCase().toString());
		
		//testing substring
		System.out.println("substring(7,10): "+str1.substring(6, 9).toString());
		
		//testing length
		System.out.println("length: "+str1.length());
		
		//testing charAt
		System.out.println("charAt(5): "+str1.charAt(5));
		

	}

}

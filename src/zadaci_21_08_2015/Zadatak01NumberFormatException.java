package zadaci_21_08_2015;

import java.util.Scanner;

/**
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to
 * convert a binary string into a decimal number. Implement the bin2Dec method
 * to throw a NumberFormatException if the string is not a binary string.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak01NumberFormatException {
	
	/**
	 * Converting a binary number to a decimal number
	 * Binary is converted to a decimal by adding all decimal values of 1's based on their position
	 * Example: 101 = 1*2^0 + 0*2^1 + 1*2^2 = 1 + 0 + 4 = 5
	 * @param binaryString  string which contains binary number to be converted into decimal value
	 * @return  decimal value of binary number
	 */
	public static int bin2Dec(String binaryString) {
		//if binaryString contains anything but 0's and 1's throw exception
		if (!isBinaryString(binaryString)) {
			throw new NumberFormatException("Not a binary string.");
		} 
		//if the binaryString contains binary number, convert it to decimal
		else {
			int decimalNumber = 0;
			//loop through the binary number
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				//if the character is 1, decimal value is 1 * 2^indexOfOne
				if (binaryString.charAt(i) == '1') {
					//binaryString.length() - 1 - i is the exponent which is based on the postion of 1 in the binary number
					decimalNumber += Math.pow(2, binaryString.length() - 1 - i);
				}
			}
			//return decimal value
			return decimalNumber;
		}
	}

	/**
	 * Checking if the string contains binary number
	 * If all chars in the string are 1's and 0's then it contains binary number
	 * @param binaryString  string which we check if it contains a binary number
	 * @return  true, if it is a binary string, otherwise false
	 */
	public static boolean isBinaryString(String binaryString) {
		//go through the string and check if the characters are 0's and 1's
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a binary number: ");
		String binaryNumber = input.next(); //binary number
		input.close();
		
		int decNumber = bin2Dec(binaryNumber); //converting binary into a decimal value
		System.out.println("Decimal number: " + decNumber); //printing decimal value

	}

}

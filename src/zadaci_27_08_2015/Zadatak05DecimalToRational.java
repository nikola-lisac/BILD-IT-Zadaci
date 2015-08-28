package zadaci_27_08_2015;

import helpClasses.Methods;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * (Convert decimals to fractions) Write a program that prompts the user to
 * enter a decimal number and displays the number in a fraction. Hint: read the
 * decimal number as a string, extract the integer part and fractional part from
 * the string, and use the BigInteger implementation of the Rational class in
 * Programming Exercise 13.15 to obtain a rational number for the decimal
 * number.
 * 
 * @author Nikola
 *
 */
public class Zadatak05DecimalToRational {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		// splitting the entered number by decimal point into two strings, one with the integer
		// part and one with the decimal part
		String[] numberParts = input.nextLine().split("\\.");
		input.close();
		
		// if the entered number is negative, add "-" to the sign variable 
		String sign = "";
		if (numberParts[0].charAt(0) == '-') {
			sign = "-";
		}
		
		// creating a rational number out of the integer part of the number
		RationalBig integerPart = new RationalBig(
				new BigInteger(numberParts[0]), BigInteger.ONE);

		int numberOfDecimalSpaces = numberParts[1].length(); // number of decimal spaces
		
		// creating a rational number out of the decimal part of the entered number
		RationalBig decimalPart = new RationalBig(
				new BigInteger(numberParts[1]),
				BigInteger.TEN.pow(numberOfDecimalSpaces));
		
		// adding integer and decimal parts gives us the converted number to fraction
		RationalBig number = integerPart.add(decimalPart);
		
		// print the fraction number, along with the sign
		System.out.println("The fraction number: " + sign + number.toString());
	}

}

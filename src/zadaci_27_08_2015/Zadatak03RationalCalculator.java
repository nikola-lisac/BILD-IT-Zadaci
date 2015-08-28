package zadaci_27_08_2015;

/**
 *  (Create a rational-number calculator) Write a program similar to Listing 7.9, Calculator.java. 
 *  Instead of using integers, use rationals, as shown in Figure 13.10a.
 *  You will need to use the split method in the String class, introduced in Section 10.10.3, 
 *  Replacing and Splitting Strings, to retrieve the numerator string and denominator string, 
 *  and convert strings into integers using the Integer.parseInt method.
 *  @author Nikola
 *
 */
public class Zadatak03RationalCalculator {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Program accepts only one argument.");
			System.exit(0);
		} else {
			//splitting argument string by spaces to get opperands and operation
			String[] operandsAndOperation = args[0].split(" "); 
			String firstOperand = operandsAndOperation[0]; //string which contains first rational number
			String operation = operandsAndOperation[1]; // string which contains operation between two rational numbers
			String secondOperand = operandsAndOperation[2]; // string whivh contains second rational number

			// numerator of the first rational number is the number in front of the "/" sign in firstOperand string
			int numeratorFirst = Integer.parseInt(firstOperand.split("/")[0]);
			// denominator of the first rational number is the number after the "/" sign in firstOperand string
			int denominatorFirst = Integer.parseInt(firstOperand.split("/")[1]);
			// first rational number 
			Rational rationalOne = new Rational(numeratorFirst,
					denominatorFirst);

			// numerator of the second rational number is the number in front of the "/" sign in secondOperand string
			int numeratorSecond = Integer.parseInt(secondOperand.split("/")[0]);
			// denominator of the first rational number is the number after the "/" sign in secondOperand string
			int denominatorSecond = Integer.parseInt(secondOperand.split("/")[1]);
			// second rational number
			Rational rationalTwo = new Rational(numeratorSecond,
					denominatorSecond);

			Rational result = null; // rational number which represents the result of operation between two rational numbers

			// depanding on the operation in the passed argument, executing the defined operation between two rational numbers
			if (operation.equals("+")) {
				result = rationalOne.add(rationalTwo);
			} else if (operation.equals("-")) {
				result = rationalOne.subtract(rationalTwo);
			} else if (operation.equals("*")) {
				result = rationalOne.multiply(rationalTwo);
			} else if (operation.equals("/")) {
				result = rationalOne.divide(rationalTwo);
			} else {
				System.out.println("Undefined operation!");
				System.exit(0);
			}

			// printing result
			System.out.println(rationalOne.toString() + " " + operation + " "
					+ rationalTwo + " = " + result);
		}

	}

}

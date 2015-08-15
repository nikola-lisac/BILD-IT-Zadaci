package zadaci_14_08_2015;

import java.math.BigInteger;

/**
 * 10.17 (Square numbers) Find the first ten square numbers that are greater
 * than Long.MAX_VALUE. A square number is a number in the form of n2. For
 * example, 4, 9, and 16 are square numbers. Find an efficient approach to run
 * your program fast.
 * 
 * @author Nikola Lisicic
 *
 */
public class SquareNumbers {

	public static void main(String[] args) {
		// square root of Long.MAX_VALUE in the string format rounded to higher value
		String squareRootOfMaxLong =(long) Math.ceil(Math.sqrt(Long.MAX_VALUE)) + "";
		
		//numbber with the value of square root of Long.MaLong.MAX_VALUE
		BigInteger number = new BigInteger(squareRootOfMaxLong);
		int count = 0;

		System.out.println("Square numbers greater than " + Long.MAX_VALUE);
		while (count < 10) {

			// squared number
			BigInteger numberSquared = number.multiply(number);

			// print squared number
			System.out.println(count + ". " + numberSquared);
			count++;

			// increment the number
			number = number.add(BigInteger.ONE);
		}
	}

}

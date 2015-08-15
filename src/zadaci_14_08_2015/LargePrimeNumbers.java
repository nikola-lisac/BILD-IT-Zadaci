package zadaci_14_08_2015;

import java.math.BigInteger;
/**
 * Zadatak br. 10.18
 * Print 5 prime numbers after the maximum value of Long
 * @author Nikola Lisicic
 *
 */
public class LargePrimeNumbers {

	/**
	 * Checking if big integer is prime
	 * The method is veeeeeeery slow, so I didnt use it
	 * @param number  value of big integer number
	 * @return true if its prime, otherwise false
	 */
	public static boolean isPrime(BigInteger number) {
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		if (!number.isProbablePrime(2) || number.equals(BigInteger.ONE)
				|| number.equals(BigInteger.ZERO)) {
			return false;
		} else {
			BigInteger half = number.divide(two);
			for (BigInteger i = three; i.compareTo(half) <= 0; i = i.add(two)) {
				if (number.mod(i).equals(BigInteger.ZERO)) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		String start = Long.MAX_VALUE + "";//string with max value of Long
		BigInteger number = new BigInteger(start);//first big integer is  max value of Long
		
		int count = 0;
		System.out.println("Probable prime numbers: ");
		while (count < 5) {
			 if(number.isProbablePrime(1)){ //if it's probably a prime, print it
				System.out.println(number);
				count++;
			}
			number = number.add(BigInteger.ONE);
		}
	}

}

package zadaci_14_08_2015;

import java.math.BigInteger;
/**
 * 10.19
 * Print Marsenne primes with p <= 100
 * @author Nikola Lisicic
 *
 */
public class MarsennePrime {

	public static void main(String[] args) {
		BigInteger two = new BigInteger("2");//variable with the value 2
		//peint header
		System.out.println("p\tp^2-1");
		System.out.println("-------------------");
		
		//print Mersenne primes with p <= 100
		for (int i = 0; i <= 100; i++) {
			BigInteger number = two.pow(i);//variable with the value 2^i
			BigInteger marsennePrime=number.subtract(BigInteger.ONE);//potential mersenne prime (2^i - 1)
			//if the marsenne number is prime, print it
			if (marsennePrime.isProbablePrime(1)) {
				System.out.println(i+"\t"+marsennePrime);
			}
		}
	}
}

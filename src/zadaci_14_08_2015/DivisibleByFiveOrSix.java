package zadaci_14_08_2015;

import java.math.BigInteger;

/**
 * 10.21
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 * @author Nikola Lisicic
 *
 */
public class DivisibleByFiveOrSix {

	public static void main(String[] args) {
		BigInteger number = new BigInteger(""+Long.MAX_VALUE);//big integer with value of Long.MAX_VALUE
		BigInteger five = new BigInteger("5");//big integer with value of 5
		BigInteger six = new BigInteger("6");//big integer with value of 6
		int count = 0;//counter
		
		
		System.out.println("Numbers greater than "+Long.MAX_VALUE+" divisible by 5 or 6: ");
		while(count<10){
			//if the big integer is divisible by 5 or 6, print it
			if(number.mod(five).equals(BigInteger.ZERO) || number.mod(six).equals(BigInteger.ZERO)){
				System.out.println(number);
				count++;
			}
			//incrementing the number by one
			number = number.add(BigInteger.ONE);
		}
	}

}

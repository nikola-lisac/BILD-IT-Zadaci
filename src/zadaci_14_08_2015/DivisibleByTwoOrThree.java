package zadaci_14_08_2015;
import java.math.BigInteger;
/**
 * 10.16
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3
 * @author Nikola Lisicic
 *
 */

public class DivisibleByTwoOrThree {

	public static void main(String[] args) {
		//variable which will store first 50-digits number
		String first50DigNumber = "1";
		//adding 49 zeros to the first 50 digits number
		for(int i = 1;i<50;i++){
			first50DigNumber+="0";
		}
		
		//50 digits number
		BigInteger number = new BigInteger(first50DigNumber);
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		
		int count =1;
		while(count<=10){
			if(number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO) ) {
				System.out.println(count+". "+number);
				count++;
			}
			number = number.add(BigInteger.ONE);
			
		}
	}

}

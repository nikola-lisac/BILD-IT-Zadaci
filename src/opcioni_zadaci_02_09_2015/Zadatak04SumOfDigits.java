package opcioni_zadaci_02_09_2015;
/**
 * Sum the digits in an integer using recursion) Write a recursive method that
 * computes the sum of the digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
 * that prompts the user to enter an integer and displays its sum.
 * @author Nikola
 *
 */
public class Zadatak04SumOfDigits {
	
	/**
	 * Recursive method which sums up the digits of the long number
	 * @param n  long number to sum up the digits
	 * @return  sum of digits
	 */
	public static int sumDigits(long n){
		// if the number is less than 10, add the number to the sum
		if(n<10){
			return (int)n;
		}
		
		// if the number is greater than 10
		// add right-most digit to the sum and do recursion with number divided by 10 (last digit removed)
		else {
			return (int)(n%10)+sumDigits(n/10);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a long number: ");
		// user enters a long number
		long number = helpClasses.Methods.inputLong();
		
		// print result
		System.out.println("Sum of digits: "+sumDigits(number));
	}

}

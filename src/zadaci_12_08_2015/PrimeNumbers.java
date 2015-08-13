package zadaci_12_08_2015;
/**
 * 
 * @author Nikola Lisicic
 * Zadatak br. 5 
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) 
 * and retrieve and display them in reverse order.
 *
 */
public class PrimeNumbers {
	
	/**
	 * Checking if the number is prime
	 * @param number  integer number to check if it's prime number
	 * @return true, if its prime, false if it isn't
	 */
	static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime && number != 0 && number != 1) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {
		StackOfIntegers stack  = new StackOfIntegers();
		//entering prime numbers in the stack
		for(int i =0; i<120;i++){
			if(isPrime(i)){
				stack.push(i);
			}
		}
		
		System.out.println("Prime numbers are:");
		//printing primes from stack
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
		}
	}

}

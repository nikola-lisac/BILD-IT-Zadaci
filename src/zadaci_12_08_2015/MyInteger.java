package zadaci_12_08_2015;

/**
 * Zadatak br. 10.3
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * An int data field named value that stores the int value represented by this object
 * A constructor that creates a MyInteger object for the specified int value.
 * A getter method that returns the int value.
 * The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * A static method parseInt(String) that converts a string into an int value.
 * Write a client program that tests all methods in the class.
 */
public class MyInteger {

	private int value; //integer number

	/**
	 * Class constructor
	 * @param value   int number 
	 */
	MyInteger(int value) {
		this.value = value;
	}

	/**
	 * Checking is the value of an instance even
	 * @return  true if it is even
	 * 			false if it isnt
	 */
	boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checking is the value of an instance odd
	 * @return   true if its odd, false if it isnt
	 */
	boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Checking is the value of an instance a prime number
	 * @return  true if it is, false if it isn't
	 */
	boolean isPrime() {
		boolean isPrime = true;
		for (int j = 2; j < this.getValue(); j++) {
			if (this.getValue() % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime && this.getValue() != 0 && this.getValue() != 1) {
			return true;
		} else {
			return false;
		}

	}
	
	/**
	 * Checking is the value of an instance equal to a number
	 * @param number   int value to compare with the value of an instance
	 * @return		   true, if they are equal, false, if they arent
	 */
	boolean equals(int number) {
		if (this.getValue() == number) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking is the value of an instance equal to the value of another instance
	 * @param myNumber  instance whose value 
	 * @return
	 */
	boolean equals(MyInteger myNumber) {
		if (this.getValue() == myNumber.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Parsing a char array to an integer number
	 * @param nums  char array which contains digits for a number
	 * @return  integer consisted of digits from char array nums
	 */
	static int parseInt(char[] nums) {
		String num = "";
		for (int i = 0; i < nums.length; i++) {
			num += nums[i];
		}
		return Integer.valueOf(num);
	}
	
	/**
	 * Parsing a string to an integer number
	 * @param nums String which contains a number
	 * @return integer number from the string
	 */
	static int parseInt(String nums) {
		return Integer.valueOf(nums);
	}
	
	/**
	 * Checking is the number even
	 * @param number  the number we want to check if its even
	 * @return true if its even, false if it isn't
	 */
	static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking is the number odd
	 * @param number  the number we want to check if its odd
	 * @return true if its odd, false if it isn't
	 */
	static boolean isOdd(int number) {
		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Checking if the number is prime
	 * @param number  the number we want to check if its prime
	 * @return  true if its prime, false if it isn't
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
	
	/** Static method that checks if the myNumber instance is even */
	static boolean isEven(MyInteger myNumber) {
		return myNumber.isEven();
	}

	/** Static method that checks if the myNumber instance is odd */
	static boolean isOdd(MyInteger myNumber) {
		return myNumber.isOdd();
	}

	/** /** Static method that checks if the myNumber instance is prime */
	static boolean isPrime(MyInteger myNumber) {
		return myNumber.isPrime();

	}

	/**
	 * Getter for value data field
	 * @return  the value of data field value
	 */
	int getValue() {
		return value;
	}

}

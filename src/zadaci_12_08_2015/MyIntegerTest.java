package zadaci_12_08_2015;
public class MyIntegerTest {

	public static void main(String[] args) {
		
		//testing 
		MyInteger num = new MyInteger(17);
		System.out.println("Testing MyNumber instance: ");
		System.out.println("Value: "+num.getValue());
		System.out.println("Prime: " + num.isPrime());
		System.out.println("Odd: "+num.isOdd());
		System.out.println("Even: "+num.isEven());
		
		//testing static methods
		int number = 23;
		System.out.println("\nTesting static methods with primitive int:\nValue: "+number);
		System.out.println("Prime: " + MyInteger.isPrime(number));
		System.out.println("Odd: "+MyInteger.isEven(number));
		System.out.println("Even: "+MyInteger.isOdd(number));
		
		//testing char array parse method 
		char[] nums = {'1','2','3'};
		System.out.println("\nTesting parse method from char array: "+nums[0]+" "+nums[1]+" "+nums[2]);
		System.out.println("Number: "+MyInteger.parseInt(nums));
		
		//testing string parse method
		String someNumbers = "54321";
		System.out.println("\nTesting parse method from string: "+someNumbers);
		System.out.println("Number: "+MyInteger.parseInt(someNumbers));
		
		//testing static methods with instance argument
		MyInteger numTwo = new MyInteger(30);
		System.out.println("\nTesting another instance: "+numTwo.getValue());
		System.out.println("Prime: " +MyInteger.isPrime(numTwo));
		System.out.println("Odd: "+MyInteger.isOdd(numTwo));
		System.out.println("Even: "+MyInteger.isEven(numTwo));
		
		//testing equals methods
		System.out.println("\nTesting equals method for instances with values: " +num.getValue()+" & "+numTwo.getValue());
		System.out.println("Equal: "+num.equals(numTwo));
		System.out.println("\nTesting equals method for an instance and a primitive: " +num.getValue()+" & "+number);
		System.out.println("Equals: "+num.equals(number));
		
	}

}

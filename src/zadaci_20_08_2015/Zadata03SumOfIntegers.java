package zadaci_20_08_2015;

import helpClasses.Methods;
/**
 * InputMismatchException) Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect
 * @author Nikola Lisicic
 *
 */
public class Zadata03SumOfIntegers {

	public static void main(String[] args) {
		
		System.out.println("Enter the first integer: ");
		int num1 = Methods.inputInt(); //method for protected input from class Methods in helpClasses package
		
		System.out.println("Enter the second integer: ");
		int num2 = Methods.inputInt(); ////method for protected input from class Methods in helpClasses package
		
		//printing sum of two integers
		System.out.println("Sum: "+(num1+num2));
	}

}

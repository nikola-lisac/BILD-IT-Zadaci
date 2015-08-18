package helpClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {

	/**
	 * Getting an integer  from console
	 * @return entered integer
	 */
	public static int inputInt() {
		Scanner input = new Scanner(System.in);
		boolean isOk = false; //loop control variable
		int userInput = 0; // variable which will store user's input
		
		//loops until user enters an integer
		while (!isOk) {
			isOk = true;
			
			try {
				userInput = input.nextInt(); //users input
				
			} catch (InputMismatchException e) { //if user enters something other than integer
				System.out.println("Wrong input, try again: ");
				input.nextLine();
				isOk = false;
			}
		}
		
		//return entered integer
		return userInput;
	}
	
	/**
	 * Getting a double number  from console
	 * @return entered double number
	 */
	public static double inputDouble() {
		Scanner input = new Scanner(System.in);
		boolean isOk = false; //loop control variable
		double userInput = 0.0; // variable which will store user's input
		
		//loops until user enters a double number
		while (!isOk) {
			isOk = true;
			
			try {
				userInput = input.nextDouble(); //users input
				
			} catch (InputMismatchException e) { //if user enters something other than double
				System.out.println("Wrong input, try again: ");
				isOk = false;
			}
		}
		
		//return entered double number
		return userInput;
	}
	
}

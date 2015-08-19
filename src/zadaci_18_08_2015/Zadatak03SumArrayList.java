package zadaci_18_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;

/**
 * (Sum ArrayList) Write the following method that returns the sum of all
 * numbers in an ArrayList: public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in
 * an array list, and displays their sum.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak03SumArrayList {

	/**
	 * Calculate sum of numbers in the array list
	 * @param list list of numbers to find sum
	 * @return sum
	 */
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (Double num : list) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>();

		System.out.println("Enter 5 numbers: ");
		// adding numbers to the list using protected input method
		for (int i = 0; i < 5; i++) {
			list.add(Methods.inputDouble());
		}
		
		//calculating sum
		double sum = sum(list);
		//printing sum
		System.out.println("Sum of numbers: "+sum);
	}

}

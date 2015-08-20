package zadaci_20_08_2015;

import helpClasses.Methods;
/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers.
 * Prompts the user to enter the index of the array, then displays the corresponding element value.
 * . If the specified index is out of bounds, display the message Out of Bounds.
 * @author Nikola Lisicic
 *
 */
public class Zadatak04OutOfBounds {

	public static void main(String[] args) {
		int[] array = new int[100]; // new array with length of 100

		// entering random 2-digit integers in the array
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		System.out.println("Enter the index: ");
		// user enters the index of the element
		int index = Methods.inputInt();

		//printing the element on defined index if the index is in the bounds
		try {
			System.out.println("Element on index " + index + " is: "
					+ array[index]);
			//printing a message if the index is out of bounds
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of bounds.");
		}
	}

}

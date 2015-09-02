package opcioni_zadaci_02_09_2015;

/**
 * (Find the largest number in an array) Write a recursive method that returns
 * the largest integer in an array. Write a test program that prompts the user
 * to enter a list of eight integers and displays the largest element.
 * 
 * @author Nikola
 *
 */
public class Zadatak05LargestNumber {

	/**
	 * Recursive method for finding the largest element in the array of integers
	 * 
	 * @param array
	 *            array of integers
	 * @param index
	 *            index of the element (starts as 0)
	 * @return  the largest element of the array
	 */
	public static int findLargest(int[] array, int index) {
		// base case (returning the last element)
		if (array.length - 1 == index) {
			return array[index];

		} else {
			// finding the larger element between element on index and elements
			// on indices index+1
			return Math.max(array[index], findLargest(array, index + 1));
		}
	}

	public static void main(String[] args) {

		int[] a = new int[8];
		System.out.println("Enter an array of 8 integers: ");
		// user enters an array of integers
		for (int i = 0; i < 8; i++) {
			a[i] = helpClasses.Methods.inputInt();
		}

		// printing result
		System.out.println("The largest element: " + findLargest(a, 0));
	}

}

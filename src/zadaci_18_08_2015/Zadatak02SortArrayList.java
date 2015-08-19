package zadaci_18_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;

/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers: public static void sort(ArrayList<Integer> list) Write a test
 * program that prompts the user to enter 5 numbers, stores them in an array
 * list, and displays them in increasing order.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak02SortArrayList {

	/**
	 * Sorting ArrayList in increasing order
	 * 
	 * @param list
	 *            array list to be sorted
	 */
	public static void sort(ArrayList<Integer> list) {
		boolean swap = true;
		int temp = 0;

		while (swap) {
			swap = false;
			for (int i = 0; i < list.size() - 1; i++) {
				// if element on index i is greater than the next element, swap
				// them
				if (list.get(i) > list.get(i + 1)) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					swap = true;
				}
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter 5 numbers: ");
		// adding numbers to the list using protected input method
		for (int i = 0; i < 5; i++) {
			list.add(Methods.inputInt());
		}

		// sort list
		sort(list);
		System.out.println("Sorted numbers: ");
		// print list
		Methods.printArrayList(list);
	}

}

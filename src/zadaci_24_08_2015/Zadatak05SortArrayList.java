package zadaci_24_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;
/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 * @author Nikola Lisicic
 *
 */
public class Zadatak05SortArrayList {

	/**
	 * Sorting ArrayList in increasing order
	 * 
	 * @param list
	 *            array list to be sorted
	 */
	public static void sort(ArrayList<Number> list) {
		boolean swap = true;
		Number temp = 0;

		while (swap) {
			swap = false;
			for (int i = 0; i < list.size() - 1; i++) {
				// if element on index i is greater than the next element, swap them
				if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					swap = true;
				}
			}
		}

	}
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();

		// adding 5 random numbers to the list
		for (int i = 0; i < 5; i++) {
			list.add((int)(Math.random()*10));
		}
		// adding two doubles to the list
		list.add(2.3);
		list.add(7.93);
		
		// sorting array list
		sort(list);
		
		// print array list
		Methods.printArrayList(list);
		
	}

}

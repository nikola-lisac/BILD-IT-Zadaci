package zadaci_17_08_2015;

import java.util.ArrayList;

/**
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers. public static void shuffle(ArrayList<Integer> list)
 * 
 * @author Nikola Lisicic
 */
public class Zadatak5ShuffleArrayList {

	/**
	 * Shuffling the elements of the array list, by swithing values of element
	 * on the current index with element on the randomly generated index
	 * 
	 * @param list
	 *            array list to be shuffled
	 */
	public static void shuffle(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			// random index of the list
			int randomPosition = (int) (Math.random() * list.size());
			// value of the element on current index
			Integer temp = list.get(i);
			// setting the element on the current index to value of the element
			// on random index
			list.set(i, list.get(randomPosition));
			// setting the value of element on random index to the value of the
			// current element
			list.set(randomPosition, temp);
		}

	}

	/**
	 * Print all integer elements of the array list
	 * 
	 * @param list
	 *            array list to be printed
	 */
	public static void printList(ArrayList<Integer> list) {

		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// adding numbers from 1 to 10 to the list
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		System.out.println("List before shuffling: ");
		//printing the current list
		printList(list);

		//shuffling the list
		shuffle(list);
		
		System.out.println("\nList after shuffling: ");
		//printing the shuffled list
		printList(list);
	}

}

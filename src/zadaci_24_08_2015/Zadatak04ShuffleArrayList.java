package zadaci_24_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;

/**
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 * @author Nikola Lisicic
 *
 */
public class Zadatak04ShuffleArrayList {
	/**
	 * Shuffling the elements of the array list by swithing values of element
	 * on the current index with element on the randomly generated index
	 * 
	 * @param list
	 *            array list to be shuffled
	 */
	public static void shuffle(ArrayList<Number> list) {

		for (int i = 0; i < list.size(); i++) {
			// random index of the list
			int randomPosition = (int) (Math.random() * list.size());
			// value of the element on current index
			Number temp = list.get(i);
			// setting the element on the current index to value of the element
			// on random index
			list.set(i, list.get(randomPosition));
			// setting the value of element on random index to the value of the
			// current element
			list.set(randomPosition, temp);
		}

	}


	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();

		// adding numbers from 1 to 10 to the list
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		//adding two doubles to the list
		list.add(2.3);
		list.add(7.93);
		
		System.out.println("List before shuffling: ");
		//printing the current list
		Methods.printArrayList(list);

		//shuffling the list
		shuffle(list);
		
		System.out.println("\nList after shuffling: ");
		//printing the shuffled list
		Methods.printArrayList(list);
	}
}

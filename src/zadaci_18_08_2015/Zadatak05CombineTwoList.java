package zadaci_18_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;

/**
 * (Combine two lists) Write a method that returns the union of two array lists
 * of integers using the following header: public static ArrayList<Integer>
 * union(ArrayList<Integer> list1, ArrayList<Integer> list2) For example, the
 * union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}.
 * Write a test program that prompts the user to enter two lists, each with five
 * integers, and displays their union. The numbers are separated by exactly one
 * space in the output.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak05CombineTwoList {

	/** 
	 * Combining two array list into one
	 * @param list1  first array list of integers
	 * @param list2  second array list of integers
	 * @return  array list of all elements from both array lists
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {

		ArrayList<Integer> union = new ArrayList<>();
		//adding elements from first array list to the new array list
		for (int i = 0; i < list1.size(); i++) {
			union.add(list1.get(i));
		}
		
		//adding elements from the second array list to the new array list
		for (int j = 0; j < list2.size(); j++) {
			union.add(list2.get(j));
		}

		//returning combined list
		return union;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.println("Enter the first list of 5 numbers: ");
		// adding numbers to the list using protected input method
		for (int i = 0; i < 5; i++) {
			list1.add(Methods.inputInt());
		}
		
		System.out.println("Enter the second list of 5 numbers: ");
		// adding numbers to the list using protected input method
		for (int j = 0; j < 5; j++) {
			list2.add(Methods.inputInt());
		}
		
		//new list consisted of elements from both lists
		ArrayList<Integer> twoListsCombined = union(list1,list2);
		
		System.out.println("Combined list: ");
		//print combined list
		Methods.printArrayList(twoListsCombined);
		
	}

}

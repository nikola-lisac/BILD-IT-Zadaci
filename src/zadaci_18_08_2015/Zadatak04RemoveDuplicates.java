package zadaci_18_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;
/**
 * (Remove duplicates) Write a method that removes the duplicate elements from an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list 
 * and displays the distinct integers separated by exactly one space.
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak04RemoveDuplicates {

	/**
	 * Removing duplicate numbers from the array list
	 * @param list array list of numbers to remove duplicates from 
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				//if the number on index i equals to the number on index j and i differences from j,
				//remove number on the index j
				if (list.get(i).equals(list.get(j)) && i != j) {
					list.remove(j);
					j--;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter 10 numbers: ");
		// adding numbers to the list using protected input method
		for (int i = 0; i < 10; i++) {
			list.add(Methods.inputInt());
		}
		
		//removing duplicates from the list
		removeDuplicate(list);
		
		System.out.println("List without the duplicates: ");
		//printing list
		Methods.printArrayList(list);
		
		
	}

}

package zadaci_17_08_2015;

import helpClasses.Methods;

import java.util.ArrayList;
/**
 * (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * @author Nikola Lisicic
 *
 */
public class Zadatak3MaximumElement {
	/**
	 * Finding the greatest element in the list of integers
	 * and returning it
	 * @param list  list of integers to go through and find the greatest element
	 * @return  greatest element in the list
	 */
	public static Integer maxElement(ArrayList<Integer> list){
		
		//if the list is null, or if its empty, return null
		if(list == null || list.size() == 0){
			return null;
		}
		//setting max to the value of first element of the list
		Integer max = list.get(0);
		//compare every element to max, if its greater then set max to the value of element
		for(Integer number: list){
			if(number.compareTo(max) > 0){
				max = number;
			}
		}
		//return greatest element
		return max;
	}
	public static void main(String[] args) {
		//list to store integers
		ArrayList<Integer> list = new ArrayList<>();
		Integer input = null;//entered integer
		
		System.out.println("Enter a list of integers, input ends with 0: ");
		//loops until 0 is entered
		while(true) {
			input = Methods.inputInt(); //calling custom protected method for taking an integer from console
			
			if(input.equals(0)){
				break;
			}
			
			//adding an integer to the list
			list.add(input);
		}
		//printing max number in the list
		System.out.println("Max number in the list: "+maxElement(list));
	}

}

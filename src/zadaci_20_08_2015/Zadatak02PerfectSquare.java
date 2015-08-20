package zadaci_20_08_2015;
import helpClasses.Methods;

import java.util.ArrayList;
/**
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer m 
 * and find the smallest integer n such that m * n is a perfect square. 
 * (Hint: Store all smallest factors of m into an array list. 
 * n is the product of the factors that appear an odd number of times in the array list. 
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 
 * 2 and 5 appear an odd number of times in the array list. So, n is 10.)
 * 
 * @author Nikola Lisicic
 *
 */
public class Zadatak02PerfectSquare {

	/**
	 * Check if number is perfect square
	 * @param number  integer to check if it's a perfect square
	 * @return  true if it's a perfect square, otherwise false
	 */
	public static boolean isPerfectSquare(int number){
		int sqrt = (int) Math.sqrt(number); // square of the number
		
		//if square power of 2 is equal to the number, then the number is perfect square
		if(sqrt * sqrt == number ){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Finding smallest factors of the number and adding all factors which appear odd number of times to the list
	 * and return that list
	 * @param number  integer to find it's factors
	 * @return  list of factors that appear odd number of times
	 */
	public static ArrayList<Integer> findFactorsThatAppearOddNumberOfTimes(int number) {
		ArrayList<Integer> list = new ArrayList<>();// list to hold all factors
		int temp = number;
		int i = 2;// first potential factor
		
		while (temp != 1) {//finding factors until the number is 1
			
			if (temp % i != 0) {//if there is a remainder, I is not a factor of number
				i++;
			} else {
				//deviding to number to find the remaining factors
				temp /= i;
				list.add(i); //adding a factor to the list
			}
		}
		
		//list which will hold the values of factors repeating odd number of times
		ArrayList<Integer> listOfOddFactors = new ArrayList<Integer>();
		
		//loops through the list of factors
		for(int k=0; k <list.size();k++){
			int tempNumber = list.get(k);//curent factor
			int counter = 0;//number of appearings of the curent factor
			//loops throug the list of factors
			for(int j = 0; j<list.size();j++){
				//if current factor appears again in the list, increment the number of his appearings
				if(tempNumber == list.get(j)){
					counter++;
				}
			}
			//if factor's number of appearance is odd, add that factor the the list
			if(counter % 2 !=0  && !listOfOddFactors.contains(tempNumber)){
				listOfOddFactors.add(list.get(k));
			}
			
		}
		//returning the list of factors that appear odd number of times
		return listOfOddFactors;
	}

	public static void main(String[] args) {
		System.out.print("Enter an integer m: ");
		int number = Methods.inputInt(); //number m
		//list of factors of the number m, that appear odd numbers of times
		ArrayList<Integer> list= findFactorsThatAppearOddNumberOfTimes(number);
		
		int perfectSquare = 1;//value of the number of potencial perfect square
		int n = 1;
		//loop through the factors
		for(int i=0;i<list.size();i++){
			
			 n *=list.get(i); //number n is result of multyplication of factors that apear odd numbe of times
			perfectSquare = n * number; // potential perfect square is m * n
			
			if(isPerfectSquare(perfectSquare)){ //if the potential perfect square is real erfect square, print the message
				System.out.println("The smallest number n for m * n to be a perfect square is "+n);
				System.out.println("m * n = "+perfectSquare);
				break;
			}
		}
		
		
		
		
		
	}
}

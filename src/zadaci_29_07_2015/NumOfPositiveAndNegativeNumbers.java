package zadaci_29_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, 
 * odreðuje koliko je pozitivnih brojeva korisnik unio, koliko negativnih 
 * te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. 
 * (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše: 
 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */
public class NumOfPositiveAndNegativeNumbers {
	
	/*
	* method for finding and printing number of positive and negative numbers in the list of integers
	* @param list is the list of integers in which we want to find out how many negative and positive numbers are there
	*/
	public static void findNumOfPositiveAndNegativeNumbers(ArrayList<Integer>list){
		int negativesCounter=0;//the counter of negative numbers
		for(int i=0;i<list.size();i++){
			if(list.get(i)<0){//if the number is negative
				negativesCounter++;//increase the counter of negative numbers
			}
		}
		System.out.println("Number of negative numbers in the list: "+negativesCounter);//print num of negatives
		System.out.println("Number of positive numbers int the list: "+(list.size()-negativesCounter));//print num of positives
		
	}
	public static void calculateAndPrintSumAndAverage(ArrayList<Integer>list){
		double sum=0;//sum
		for(int i=0;i<list.size();i++){
			sum+=list.get(i);//adding all numbers in the list to sum
		}
		
		double average=(sum/list.size());//average
		
		//printing results
		System.out.println("The sum of numbers is: "+sum);
		System.out.println("The average of numbers is: "+average);
	}
	public static void main(String[] args) {
		Scanner input = null;
		ArrayList<Integer> list = new ArrayList<>();// list which will store the numbers
		int numInput = 0;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter an array of integers (input ends with a zero): ");
			// with the loop the number from console are entered in the list until the 0 is entered
			do {
				numInput = input.nextInt();// entered number
				if (numInput == 0) {// if entered number is 0, the loop breaks
					break;
				}
				list.add(numInput);// add numbers to the list
			} while (numInput != 0);
			
			findNumOfPositiveAndNegativeNumbers(list);//print number of negative and positive numbers
			calculateAndPrintSumAndAverage(list);//calculate sum and average and print them
			
		} catch (InputMismatchException e) {
			System.out.println("Input error.");
		} finally {
			input.close();
		}

	}

}

package zadaci_21_08_2015;

import java.io.File;
import java.util.Scanner;
/**
 * (Process scores in a text file) Suppose that a text file contains an unspecified number of scores separated by blanks. 
 * Write a program that prompts the user to enter the file, reads the scores from the file,
 * and displays their total and average.
 * @author Nikola Lisicic
 *
 */
public class Zadatak05Scores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the absolute file path (enter two slashes instead of one ): ");
		String filePath = input.nextLine();
		
		try {
			
			File file = new File(filePath);
			Scanner in = new Scanner(file);
			
			double sum = 0; //sum of scores in the file
			int count = 0; //number of scores in the file
			
			//sum all scores in the file and find number of scores
			while (in.hasNext()){
				sum +=in.nextDouble();
				count++;
			}
			in.close();
			input.close();
			
			//average of scores in the file
			double average = sum / count;
			
			//print results
			System.out.println("The total is: "+sum);
			System.out.println("The average is: "+average);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

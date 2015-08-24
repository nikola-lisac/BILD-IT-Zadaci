package zadaci_22_23_08_2015;

import java.net.URL;
import java.util.Scanner;
/**
 * (Process scores in a text file on the Web) Suppose that the text file on the Web 
 * http://cs.armstrong.edu/liang/data/Scores.txt 
 * contains an unspecified number 
 * of scores. Write a program that reads the scores from the file and displays their total and average. 
 * Scores are separated by blanks.
 * @author Nikola Lisicic
 *
 */
public class Zadatak04Scores {

	public static void main(String[] args) {
		try {
			//url of the file
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner in = new Scanner(url.openStream());
			
			double sum = 0; //sum of scores in the file
			int count = 0; //number of scores in the file
			
			//sum all scores in the file and find the number of scores
			while (in.hasNext()){
				sum +=in.nextDouble();
				count++;
			}
			in.close();
			
			//average of scores in the file
			double average = sum / count;
			
			//print results
			System.out.println("The total is: "+sum);
			System.out.printf("The average is: %.2f",average);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package zadaci_22_23_08_2015;

import java.net.URL;
import java.util.Scanner;

/**
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
 * @author Nikola Lisicic
 *
 */
public class Zadatak03CountWords {

	public static void main(String[] args) {
		
		try {
			//url of the file
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			//reader of the file
			Scanner input = new Scanner(url.openStream());
			//number of words in the file
			int wordCount = 0;
			
			// go through the file
			while(input.hasNextLine()){
				//add the line to the string
				String line = input.nextLine();
				//split the line to get array of words from the line
				String[] wordsInTheLine = line.split(" ");
				//add number of words in the line to the counter
				wordCount +=wordsInTheLine.length;
			}
			input.close();
			//print number of words
			System.out.println("Number of words: "+wordCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

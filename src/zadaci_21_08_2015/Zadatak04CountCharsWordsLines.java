package zadaci_21_08_2015;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * (Count characters, words, and lines in a file) Write a program that will count the number of characters, words, and lines in a file. 
 * Words are separated by whitespace characters. 
 * The file name should be passed as a command-line argument.
 * @author Nikola Lisicic
 *
 */
public class Zadatak04CountCharsWordsLines {

	public static void main(String[] args) {
		//if more than one argument is passed
		if(args.length !=1){
			System.out.println("Only one argument allowed, file path.");
			System.exit(0);
		}
		
		try {
			//name of the file is passed as argument
			File file = new File(args[0]);
			Scanner input = new Scanner(file);
			
			int countLines = 0;
			int countWords = 0;
			int countChars = 0;
			
			//loops through the file
			while(input.hasNextLine()){
				countLines++;//increment every line
				String str = input.nextLine();
				countChars+=str.length(); //number of chars in the line
				countWords += new StringTokenizer(str, " ,").countTokens(); //number of words in the line
			}
			
			input.close();
			
			//printing result
			System.out.println("Number of lines: "+countLines);
			System.out.println("Number of words: "+countWords);
			System.out.println("Number of characters: "+countChars);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

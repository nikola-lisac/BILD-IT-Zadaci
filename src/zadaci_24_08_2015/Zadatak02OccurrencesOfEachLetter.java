package zadaci_24_08_2015;

import java.io.File;
import java.util.Scanner;

/**
 * (Occurrences of each letter) Write a program that prompts the user to enter a file name 
 * and displays the occurrences of each letter in the file. 
 * Letters are case-insensitive.
 * @author Nikola Lisicic
 *
 */
public class Zadatak02OccurrencesOfEachLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
		// file name or file path
		String fileName = input.nextLine();
		
		try {
			
			File file = new File(fileName);
			Scanner in = new Scanner(file);
			
			// number of appearances of all letters of alphabet
			int[] letterCounter = new int[26];
			String line ="";
			// go through the whole file, line by line
			while(in.hasNextLine()){
				// convert letters from current line to upper case
				line = in.nextLine().toUpperCase();
				
				// loop through the current line
				for(int i =0;i<line.length();i++){
					// current character of the line
					char currentChar = line.charAt(i);
					
					/*
					 * if the current char is a letter between A and Z
					 * increase the number of its occurrences by one in the array of occurrences
					 * index is determent by current char - 65 because 65 is letter A in ASCII,
					 * so if the current char is 'A', his index is 65 - 65 = 0
					 */
					if(currentChar >='A' && currentChar <= 'Z'){
						letterCounter[currentChar - 65]++;
					}
				}
			}
			in.close();
			input.close();
			
			// printing number of occurrences of each letter that appears at least once
			for(int j = 0; j<letterCounter.length; j++){
				if(letterCounter[j]>0){
					System.out.println("Number of "+(char)(65 + j)+"'s: "+letterCounter[j]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

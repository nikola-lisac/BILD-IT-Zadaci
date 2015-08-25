package zadaci_24_08_2015;

import java.io.File;
import java.util.Scanner;

/**
 * (Baby name popularity ranking) The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames 
 * and stored in files named babynameranking2001.txt, babynameranking2002.txt, . . . , babynameranking2010.txt. 
 * Each file contains one thousand lines. 
 * Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name.
 * Write a program that prompts the user to enter the year, gender, and followed by a name, 
 * and displays the ranking of the name for the year.
 * @author Nikola
 *
 */
public class Zadatak03BabyNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		String year = input.next();
		// file of defined year
		File file = new File("babynameranking" + year + ".txt");
		// if there is a file with entered year
		if (file.exists()) {

			System.out.println("Enter the gender (M/F): ");
			Character gender = Character.toUpperCase(input.next().charAt(0));
			// gender can be only m or f
			if (gender.equals('M') || gender.equals('F')) {

				System.out.println("Enter the name (case sensitive): ");
				String name = input.next(); //baby name

				input.close();
				Scanner in = null;
				try {
					in = new Scanner(file);
					// variable which mark is the defined name found or not
					boolean isFound = false;
					// go through the file
					while (in.hasNextLine()) {
						// split current line by any number of spaces between number and words
						String[] line = in.nextLine().split("\\s+");
						// popularity rank of the current line
						String rank = line[0];
						//male name on the current line
						String maleName = line[1];
						//female name on the current line
						String femaleName = line[3];
						
						// if entered name is current male or female name, print popularity ranking
						if (name.equals(maleName) || name.equals(femaleName)) {
							isFound = true;
							System.out.println("\n"+name + " is ranked #" + rank
									+ " in the year " + year);
							break;
						}
					}
					
					//if the name doesn't exist in the file, print message
					if (!isFound) {
						System.out.println("\nThe name " + name
								+ " is not ranked in the year " + year);
					}

				} catch (Exception e) {
					System.out.println("Error.");
					e.printStackTrace();
				} finally {
					in.close();
				}
			}
		} else { // if there isn't a file for entered year, print message
			System.out.println("There is no file for that year!");

		}
	}
}

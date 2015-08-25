package zadaci_24_08_2015;

import java.net.URL;
import java.util.Scanner;
/**
 * (Process large dataset) A university posts its employees’ salaries at 
 * http://cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary 
 * Write a program to display the total salary for assistant professors, associate professors, full professors, and all faculty, respectively, 
 * and display the average salary for assistant professors, associate professors, full professors, and all faculty, respectively.
 * @author Nikola Lisicic
 *
 */
public class Zadatak01Salaries {

	public static void main(String[] args) {
		try {
			
			//url of the file
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());
			
			int countAssociates = 0; // number of faculty members with rank "associate"
			int countAssistants = 0; // number of faculty members with rank "assistant"
			int countFull = 0; // number of faculty members with rank "full"
			
			double associatesSalaries = 0.0; // total salaries of associates
			double assistantsSalaries = 0.0; // total salaries of assistants
			double fullSalaries = 0.0; // total salaries of full professors

			// go trough the whole file, line by line
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(" "); //splitting current line by space
				
				//rank of faculty on the current line
				String rank = line[2];
				//salary of faculty on the current line
				double salary = Double.parseDouble(line[3]);
				
				// depending on the rank of faculty member on the current line, 
				// add salary to the sum of salaries for defined ranks, 
				// and increase the number of faculty members with that rank
				if (rank.equals("associate")) {
					countAssociates++;
					associatesSalaries += salary;
				} else if (rank.equals("assistant")) {
					countAssistants++;
					assistantsSalaries += salary;
				} else {
					countFull++;
					fullSalaries += salary;
				}

			}
			input.close();
			
			//total of faculty salaries
			double totalSalaries = associatesSalaries + assistantsSalaries + fullSalaries;
			//total number of faculty
			int totalFaculty = countAssociates + countAssistants + countFull;
			
			//print results
			System.out
					.printf("\nTotal assistants salaries: %.2f\nAvarage assistant salary: %.2f\n",
							assistantsSalaries, assistantsSalaries
									/ countAssistants);
			System.out
					.printf("\nTotal associates salaries: %.2f\nAvarage associate salary: %.2f\n",
							associatesSalaries, associatesSalaries
									/ countAssociates);
			System.out
					.printf("\nTotal full professors salaries: %.2f\nAvarage full professor salary: %.2f\n",
							fullSalaries, fullSalaries / countFull);
			System.out
					.printf("\nTotal faculty salaries: %.2f\nAvarage faculty salary: %.2f",
							totalSalaries, totalSalaries / totalFaculty);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

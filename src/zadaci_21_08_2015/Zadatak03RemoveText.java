package zadaci_21_08_2015;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * (Remove text) Write a program that removes all the occurrences of a specified string from a text file.
 *  For example, invoking
 *  java Exercise12_11 John filename
 *  removes the string John from the specified file. 
 *  Your program should get the arguments from the command line.
 * @author Nikola Lisicic
 *
 */
public class Zadatak03RemoveText {

	public static void main(String[] args) {
		// if passed arguments length is more or less than 2, program exits
		if (args.length != 2) {
			System.out
					.println("Usage: java zadatak03RemoveText stringToRemove targetFile");
			System.exit(1);
		}

		try {
			// text to remove
			String removeText = args[0];
			// absolute path of the file
			String filePath = args[1];

			System.out.println("File path: " + filePath);
			System.out.println("Text to remove: " + removeText);
			File file = new File(filePath);
			Scanner input = new Scanner(file);

			// string which will store the strings of the files without removed
			// string
			String printString = "";
			// read each line from the file
			while (input.hasNextLine()) {
				String str = input.nextLine();
				// remove defined string from the line
				str = str.replaceAll(removeText, "");
				// add line without the defined string into string for printing
				printString += str + "\n";
			}

			PrintWriter print = new PrintWriter(file);
			// print file
			print.print(printString);

			input.close();
			print.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
		}
	}

}

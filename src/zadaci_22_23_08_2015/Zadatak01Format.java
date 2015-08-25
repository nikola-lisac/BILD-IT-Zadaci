package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style.
 * @author Nikola Lisicic
 *
 */
public class Zadatak01Format {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Enter a file name as the first argument!");
			System.exit(0);
		}
		else {
			try {
				//name of the source file
				String fileName = args[0];
				File file = new File(fileName);
				Scanner input = new Scanner(file);
				//variable which will contain all the the text from the file
				String sourceFileText = "";
				//go through the file and add all lines to the string
				while (input.hasNext()) {
					sourceFileText += input.nextLine() + "\n";

				}
				//correct the formating
				sourceFileText = sourceFileText.replaceAll("\\)\\s*\\{", ") {");
				sourceFileText = sourceFileText.replaceAll("\\s*\\{", " {");

				input.close();
				//overwrite the file with formated text
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));
				pw.append(sourceFileText);
				pw.close();
				System.out.println("Source code has been reformated.");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

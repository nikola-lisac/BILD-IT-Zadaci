package zadaci_22_23_08_2015;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak01Format {

	public static void main(String[] args) {
		if (args.length == 1) {
			try {
				String fileName = args[0];
				File file = new File(fileName);
				Scanner input = new Scanner(file);
				String string = "";
				while (input.hasNext()) {
					string += input.nextLine() + "\n";

				}
				string = string.replaceAll("\\)\\s*\\{", ") {");
				string = string.replaceAll("\\s*\\{", " {");

				input.close();
				PrintWriter pw = new PrintWriter(file);
				pw.append(string);
				pw.close();
				System.out.println("Source code has been reformated.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

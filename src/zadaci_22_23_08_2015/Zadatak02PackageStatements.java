package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Zadatak 2: (Add package statement) Suppose you have Java source files under the directories
 * chapter1, chapter2, . . . , chapter34. Write a program to insert the
 * statement package chapteri; as the first line for each Java source file under
 * the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 * are under the root directory srcRootDirectory. The root directory and
 * chapteri directory may contain other folders and files.
 * @author Nikola Lisicic
 */
public class Zadatak02PackageStatements {

	/**
	 * Loading the file and
	 * printing the package in the source code
	 * 
	 * @param file
	 *            file to load
	 * @param packageName
	 *            name of the package to print
	 */
	public static void addPackageName(File file, String packageName) {
		
		//if its a file
		if (file.isFile()) {
			Scanner input = null;
			
			try {
				input = new Scanner(file);

				// String variable with the name of the package
				String textWithPackage = "package " + packageName + ";\n\n";
				
				// reading text from the file
				while (input.hasNext()) {
					// adding lines one by one into the variable
					textWithPackage += input.nextLine() + "\n";
				}

				// writing the text in the same file
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));
				pw.append(textWithPackage);
				pw.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else { // if its directory
			// list of files in the directory
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				// calling the same method to print the package for all files
				// from the directory
				addPackageName(files[i], file.getName());
			}
		}
	}

	public static void main(String[] args) {
		
		// printing the message if there are no arguments
		if (args.length == 0) {
			System.out.println("Enter a workspace name in first argument!");
			System.exit(0);
		}
		// name of the workspace
		String workspaceName = args[0];
		// list of packages in the workspace
		File[] workspacePackages = new File(workspaceName).listFiles();
		
		// loop through all packages
		for (int i = 0; i < workspacePackages.length; i++) {
			//list of files inside the packages
			File[] files = workspacePackages[i].listFiles();
			// loop through all the files in the packages
			for (int j = 0; j < files.length; j++) {
				// adding package name to the file
				addPackageName(files[j], workspacePackages[i].getName());
			}
		}
		//print message
		System.out.println("Package names have been added.");
	}

}

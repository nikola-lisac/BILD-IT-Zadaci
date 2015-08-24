package zadaci_22_23_08_2015;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
/**
 * (Create large dataset) Create a data file with 1,000 lines. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary. 
 * The faculty member’s first name and last name for the ith line are FirstNamei and LastNamei. 
 * The rank is randomly generated as assistant, associate, and full. 
 * The salary is randomly generated as a number with two digits after the decimal point. 
 * The salary for an assistant professor should be in the range from 50,000 to 80,000, 
 * for associate professor from 60,000 to 110,000, 
 * and for full professor from 75,000 to 130,000. 
 * Save the file in Salary.txt.
 * @author Nikola Lisicic
 *
 */
public class Zadatak05LargeDataset {
	
	/**
	 * Geting the sallary range based on the rank of faculty
	 * @param rank  name of the rank
	 * @return  array containing the range of sallary for faculty rank, 
	 * 			index 0 is bottom of the range, 1 is top of the range
	 */
	public static double[] getSallaryRange(String rank){
		//asistant has a sallary in range 50 000 - 80 000
		if(rank == "assistant"){
			return new double[]{50000,80000};
		}
		//associate has a sallary in range 60 000 - 110 000
		else if(rank == "associate"){
			return new double[]{60000,110000};
		}
		//full has sallary in range of 75 000 - 130 000
		else if(rank == "full"){
			return new double[]{75000,130000};
		}
		//undefined rank
		else {
			System.out.println("Undefined rank.");
			return null;
		}
	}
	public static void main(String[] args) {
		try {
			//creating a file Salary.txt
			File database = new File("Sallary.txt");
			PrintWriter pw = new PrintWriter(database);
			Random random = new Random();
			//ranks of faculty
			String[] rank = {"assistant","associate","full"};
			
			//write 1000 lines in the file
			for(int i =1; i<=1000;i++){
				
				String printString = ""; // string which will contain a line for writing in the file
				
				printString += "FirstName"+i; //adding first name to the string for printing
				printString += " LastName"+i; // adding last name to the string for printing
				
				String rankString = rank[random.nextInt(3)]; //randomly generating rank of faculty
				printString += " "+rankString; //adding rank to the print string
				
				double[] range = getSallaryRange(rankString);//getting sallary range for randomly generated rank
				double sallary = range[0] + (range[1]-range[0]) * random.nextDouble(); //randomly generating sallary in defined range
				String sallaryStr = String.format("%.2f", sallary); // formating sallary to 2 decimal spaces
				printString += " " + sallaryStr +"\n"; //adding salary to the print string
				
				pw.write(printString);//writing the line in the file
			}
			pw.close();	
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}

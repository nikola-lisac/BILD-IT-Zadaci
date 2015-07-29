package zadaci_29_07_2015;
/*
 * Zadatak br. 4
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) 
 * te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinutesToYearsAndDays {
	/*
	 * method for calculating years and days from minutes
	 * @param minutes is number of minutes to convert from
	 */
	public static void convertMinutesToYearsAndDays(long minutes) {
		int minutesInAYear = 60 * 24 * 365;//num of minutes in a year
		int years = (int) (minutes / minutesInAYear);//number of years
		int days = (int) ((minutes % minutesInAYear) / (24 * 60));//number of days
		
		//printing results
		System.out.println("Number of years: " + years);
		System.out.println("Number of days: " + days);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter number of minutes: ");
			long minutes = input.nextLong();//number of minutes

			convertMinutesToYearsAndDays(minutes);//calculate years and days

		} catch (InputMismatchException e) {
			System.out.println("Input error.");
		} finally {
			input.close();
		}
	}

}

package zadaci_29_07_2015;

/*
 * Zadatak br. 1
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
 * program vraæa Atlanta, Chicago, Los Angeles.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CitiesInAlphabeticalOrder {
	/*
	 * Method for sorting list of cities in alphabetical order and printing it
	 * param cities: list of cities
	 */
	public static void printCitiesInAlphabeticalOrder(ArrayList<String> cities) {
		Collections.sort(cities);// sorting the list
		System.out.println("Cities in alphabetical order: ");
		System.out.println(cities);// printing the list
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three cities: ");
		String firstCity = input.nextLine();
		String secondCity = input.nextLine();
		String thirdCity = input.nextLine();
		input.close();
		
		ArrayList<String> cities = new ArrayList<>();// list in which cities are going to be stored
		cities.add(firstCity);
		cities.add(secondCity);
		cities.add(thirdCity);
		
		printCitiesInAlphabeticalOrder(cities);// sorting and printing the list of cities

	}

}

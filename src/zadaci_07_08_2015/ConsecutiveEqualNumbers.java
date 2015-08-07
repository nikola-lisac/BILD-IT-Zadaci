package zadaci_07_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 7.30
 *  Write the following method that tests whether the array
 *  has four consecutive numbers with the same value.
 *  public static boolean isConsecutiveFour(int[] values)
 *  Write a test program that prompts the user to enter a series of integers 
 *  and displays if the series contains four consecutive numbers with the same value. 
 *  Your program should first prompt the user to enter the input size—i.e.,
 *   the number of values in the series.
 */
public class ConsecutiveEqualNumbers {

	/*
	 * Metoda provjerava da li postoji 4 uzastopne iste vrijednosti i
	 * ako postoje vraca true, u suprotnom vraca false 
	 */
	public static boolean isConsecutiveFour(int[] values) {
		int counter = 0;//brojac
		for (int i = 0; i < values.length; i++) {
			int firstNumber = values[i];//vrijednost elementa niza
			counter = 0;
			/*
			 * petlja prolazi cetri sledece vrijednosti i ispituje da li su jednake toj vrijednosti
			 * ako su jednake povecava brojac za 1
			 */
			for (int j = i; j < i + 4 && j < values.length; j++) {
				if (firstNumber == values[j]) {
					counter++;
				}
			}
			//ako je brojac 4, znaci da postoje 4 jednake uzastopne vrijednosti i vraca true
			if (counter == 4) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of values:");
		int length = input.nextInt();//duzina niza
		int[] array = new int[length];

		//ubacivanje vrijednosti u niz
		System.out.print("Enter the values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		//ako postoje 4 uzastopna jednaka elementa niza ispisuje tu poruku korisniku
		if (isConsecutiveFour(array)) {
			System.out.println("The list has consecutive fours.");
		} else {//ako ne postoje ispisuje da ne postoje 
			System.out.println("The list has no consecutive fours.");
		}
	}

}

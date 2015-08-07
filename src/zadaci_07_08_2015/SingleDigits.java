package zadaci_07_08_2015;

/*
 * Zadatak br. 7.7
 * (Count single digits) Write a program that generates 100 random integers between 0 and 9 
 * and displays the count for each number. 
 * (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, ..., 9s.)
 */
public class SingleDigits {

	public static void main(String[] args) {
		int[] count = new int[10];//brojac cifara od 0 do 9
		int[] numbers = new int[100];//niz brojeva
		
		for (int i = 0; i < numbers.length; i++) {
			int number = (int) (Math.random() * 10);//random broj od 0 do 9
			numbers[i] = number;//dodavanje broja u listu
			count[number]++;//povecavanje broja pojavljivanja broja "number"
		}

		//stampanje rezultata
		for (int j = 0; j < count.length; j++) {
			System.out.println("Number of " + j + "s: " + count[j]);
		}
	}

}

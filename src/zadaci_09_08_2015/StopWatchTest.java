package zadaci_09_08_2015;
/*
 * Zadatak 9.6
 * Test klasa za StopWatch
 * Write a test program that measures the execution time 
 * of sorting 100,000 numbers using selection sort.
 */
public class StopWatchTest {

	/*
	 * Metoda koja sortira niz arr prema selection sort algoritmu i vraca
	 * sortiran niz
	 */
	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

	/*
	 * metoda generise i vraca niz nasumicnih cijelih brojeva cija je duzina proslijedjena
	 * kao parametar numberOfElements
	 */
	public static int[] generateArray(int numberOfElements) {
		int[] array = new int[numberOfElements];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}

		return array;
	}

	public static void main(String[] args) {
		
		StopWatch watch = new StopWatch();
		int[] arr = generateArray(10000);// generisemo niz od 10 000 brojeva

		watch.start();// stoperica pocinje

		// sortiramo originalni niz prema selection sort algoritmu
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		watch.stop();// stoperica se zaustavlja
		
		//vrijeme koje je trebalo za sortiranje
		System.out.println("Elapsed time for sorting array of 10 000 integers: " + watch.getElapsedTime()+" miliseconds");

	}
}

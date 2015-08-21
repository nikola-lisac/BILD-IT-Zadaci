package zadaci_21_08_2015;

/**
 * (OutOfMemoryError) Write a program that causes the JVM to throw 
 * an OutOfMemoryError and catches and handles this error.
 * @author Nikola Lisicic
 *
 */
public class Zadatak02OutOfMemory {

	public static void main(String[] args) {

		//try creating an int array in the loop with length increasing by multiple of 5 with every iteration
		try {
			int value = 20;
			for (int i = 1; i < 20; i++) {
				System.out.println("Iteration " + i);
				int[] newArrayInTheLopp = new int[value];
				System.out.println("New array with length: " + newArrayInTheLopp.length);
				value = value * 5;
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory error!");
		}

		System.out.println("\nError handled.");
	}
}

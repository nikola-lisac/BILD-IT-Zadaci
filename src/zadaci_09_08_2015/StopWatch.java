package zadaci_09_08_2015;
/*
 * Zadatak br 9.6
 * Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for th
 * stopwatch in milliseconds.
 *  Write a test program that measures the execution time 
 *  of sorting 100,000 numbers using selection sort.
 */
public class StopWatch {
	private long startTime;//pocetno vrijeme stoperice
	private long endTime;//krajnje vrijeme stoperice

	/*
	 * Konstruktor postavlja pocetno vrijeme na trenutno vrijeme u milisekundama
	 */
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	/*
	 * Metoda resetuje pocetno vrijeme na trenutno vrijeme u milisekundama
	 */
	void start() {
		startTime = System.currentTimeMillis();
	}

	/*
	 * Metoda setuje krajnje vrijeme stoperice na trenutno vrijeme
	 */
	void stop() {
		endTime = System.currentTimeMillis();
	}

	/*
	 * Metoda vraca koliko je milisekundi proslo od pocetnog do krajnjeg vremena
	 */
	long getElapsedTime() {
		return getStopTime() - getStartTime();
	}

	/*
	 * Geter pocetnog vremena
	 */
	long getStartTime() {
		return startTime;
	}

	/*
	 * Geter krajnjeg vremena
	 */
	long getStopTime() {
		return endTime;
	}


}

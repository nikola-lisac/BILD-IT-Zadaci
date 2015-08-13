package zadaci_12_08_2015;

/*
 * Zadatak br. 10.1
 * Write a test program that creates two Time objects
 * (using new Time() and new Time(555550000)) and 
 * displays their hour, minute, and second in the format hour:minute:second.
 */

public class TimeTest {

	public static void main(String[] args) {
		Time timeOne = new Time();//prva instanca klase Time
		Time timeTwo = new Time(555550000);//druga instanca klase Time
		
		System.out.println("Time is: " + timeOne.toString());//stampanje vremena prve instance
		System.out.println("Time is: " + timeTwo.toString());//stampanje vremena druge instance
		
	}

}

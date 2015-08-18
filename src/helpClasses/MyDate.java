package helpClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Zadatak br. 10.14
 * It represents junary as 1, instead of 0, so every month has a correct number
 * @author Nikola Lisicic
 *
 */
public class MyDate {

	private int day; 
	private int month;
	private int year;

	/** Default constructor which sets day, month and year to current date */
	public MyDate() {
		Calendar calendar = new GregorianCalendar();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH)+1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	/**
	 * Constructor which sets day, month and year based on number of milliseconds since 1.1.1970.
	 * @param elapsedTime number of milliseconds
	 */
	MyDate(long elapsedTime) {
		this.setDate(elapsedTime);
	}
	/**
	 * Setting day, month and year based on number of milliseconds since 1.1.1970.
	 * @param elapsedTime number of milliseconds
	 */
	void setDate(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH)+1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);

	}

	/**
	 * Overriden method which return properties of MyDate instance
	 */
	@Override
	public String toString() {
		return "Date: "+this.getDay() + "." + this.getMonth() + "." + this.getYear()
				+ ".";
	}

	/** Getters and setters */
	
	
	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}

	public static void main(String[] args) {
		//current MyDate instance
		MyDate date = new MyDate();
		System.out.println("Curent date: " + date.toString());
		
		//elapsed time MyDate instance
		MyDate date2 = new MyDate(561555550000l);
		System.out.println("Date from the elapsed time: " + date2.toString());
	}

}

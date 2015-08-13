package zadaci_12_08_2015;
/*
 * Zadatak br. 10.1
 * (The Time class) Design a class named Time. The class contains:
 * The data fields hour, minute, and second that represent a time.
 * A no-arg constructor that creates a Time object for the current time. 
 * (The values of the data fields will represent the current time.)
 * A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * A constructor that constructs a Time object with the specified hour, minute, and second.
 * Three getter methods for the data fields hour, minute, and second, respectively.
 * A method named setTime(long elapseTime) that sets a new time 
 * for the object using the elapsed time. For example, if the elapsed time is
 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10.
 */
public class Time {

	private long hour; // sati
	private long minute; //minute
	private long second; //sekunde

	/*
	 * Konstruktor bez argumenata koji kreira objekat za trenutno vrijeme
	 * pozivajuci set time metodu i presledjujuci joj trenutno vrijeme u milisekundama
	 */
	Time() {
		setTime(System.currentTimeMillis());
	}

	/*
	 * Konstruktor koji kreira objakat preko specificiranog broja milisekundi
	 * pozivajuci setTime metodu i prosledjujuci joj taj broj milisekundi
	 */
	Time (long elapsedTime) {
		setTime(elapsedTime);
	}
	
	/*
	 * Konstruktor koji kreira objekat sa spicificiranim brojem sati, minuta i sekundi
	 */
	Time(long hour,long minute,long second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	/*
	 * Metoda koja racuna broj sati, minuta i sekundi iz proslijedjenog broja milisekundi
	 * i postavlja data fields na te vrijednosti
	 */
	void setTime(long elapsedTime){
		
		//ukupan broj sekundi je broj milisekundi kroz 100
		long totalSeconds =  (elapsedTime / 1000);
		//trenutni broj sekundi
		long currentSecond = totalSeconds % 60;

		//ukupan broj minuta
		long totalMinutes = (totalSeconds / 60);
		//trenutan broj minuta
		long currentMinute = totalMinutes % 60;

		//ukupan broj sati
		long totalHours = totalMinutes / 60;
		//trenutan broj sati
		long currentHour = totalHours % 24;

		this.hour = currentHour;
		this.minute = currentMinute;
		this.second = currentSecond;
		
	}
	
	/*
	 * Override-ova to string metoda koja vraca broj sati, minuta i sekundi u formatu
	 * sati:minute:sekunde
	 */
	@Override
	public String toString(){
		return getHour()+":"+getMinute()+":"+getSecond();
	}
	
	
	/*
	 * Getter-i za sate, minute i sekunde
	 */
	
	long getHour() {
		return hour;
	}

	long getMinute() {
		return minute;
	}

	long getSecond() {
		return second;
	}



	
	
}

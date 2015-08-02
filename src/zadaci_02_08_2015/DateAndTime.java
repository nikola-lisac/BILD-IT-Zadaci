package zadaci_02_08_2015;
/*
 * Zadatak br. 4
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	/*
	 * Metoda za dobijanje i prosljedljivanje trenutnog datuma i vremena
	 */
	public static String currentDate(){
		
		//metoda vraca instancu Date klase cijem smo konstruktoru proslijedili broj milisekundi
		//koji je protekao od UNIX datuma
		Date date = new Date (System.currentTimeMillis());
		
		//definisanje formata u kome ce vrijeme biti prikazano
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		//dodjeljivanje formatiranog trenutnog datuma promjenljivoj dateAndTime
		String dateAndTime = sdf.format(date);
		
		return dateAndTime;
	}
	public static void main(String[] args) {
		
		//ispis trenutnog datuma i vremena
		System.out.println("Trenutni datum i vrijeme: " + currentDate());
	}

}

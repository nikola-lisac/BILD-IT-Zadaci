package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Zadatak br. 3
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */
public class CurrentDateAndTime {

	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());//date je instanca klase Date i sadrzi trenutni datum i vrijeme
		SimpleDateFormat sdf = new SimpleDateFormat("dd. MMM, yyyy HH:mm:ss");//definisemo format u kome zelimo ispisati trenutno vrijeme
		System.out.println("Trenutni datum i vrijeme: " + sdf.format(date));//ispis datuma i vremena
	}

}

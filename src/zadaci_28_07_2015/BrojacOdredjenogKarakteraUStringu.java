package zadaci_28_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu 
 * te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */
public class BrojacOdredjenogKarakteraUStringu {
	/*
	 * metoda racuna broj ponavljanja odredjenog karaktera u odredjenom stringu
	 * @param str je string u kome zelimo prebrojati pojavljivanje odredjenog karaktera
	 * @param a je karakter cije pojavljivanje zelimo prebrojati
	 * metoda vraca broj ponavljanja tog karaktera
	 */
	public static int count(String str, char a) {
		str = str.toLowerCase();//originalni string sa pretvorenim velikim slovima u mala
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String userString = input.nextLine();
		System.out.println("Unesite karakter za koji zelite znati koliko se puta ponavlja u stringu: ");
		String inputChar = input.next();//string u koji je smjesten karakter cije ponavljanje zelimo izracunati
		input.close();
		char userChar = ' ';//
		//ako je duzina stringa u kome se nalazi karakter 1, znaci da se u njemu nalazi samo taj karakter koji korisnik zeli izbrojati
		if (inputChar.length() == 1) {
			userChar = inputChar.charAt(0);//dodjeljujemo taj karakter promjenljivoj userChar
		} else {//ako je duzina stringa sa karakterom veca od 1, znaci da je korisnik idiot i da je unio vise karaktera
			System.out.println("Stoko, trebas unijeti jedan karakter!");
			System.exit(0);//izlaz iz programa
		}

		System.out.println("Karakter \"" + userChar + "\" se pojavljuje "
				+ count(userString, userChar) + " puta.");// ispis broja ponavljanja zeljenog karaktera u zadatom stringu

	}

}

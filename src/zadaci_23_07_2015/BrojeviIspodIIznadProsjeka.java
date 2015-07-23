package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Zadatak br. 5
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva,
 * a koliko je bilo brojeva ispod prosjeka. 
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
public class BrojeviIspodIIznadProsjeka {
	/*
	 * metoda za pronalazenje prosjeka elemenata u listi
	 * prosjek je kolicnik sume svih elemenata i broja elemenata u listi
	 */
	public static double calculateAverage(ArrayList<Integer> list) {
		double sum = 0;//suma
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);//pri svakoj iteraciji dodaje vrijednost elementa na indeksu "i" sumi 
		}
		double average = sum / list.size();//prosjek je suma/broj elemenata
		System.out.println("Prosjek iznosi: " + average);//ispis prosjeka
		return average;//vracanje prosjeka
	}
	
	/*
	 * metoda za racunanje i ispisivanje broja brojeva ispod prosjeka, na prosjeku i iznad prosjeka
	 * metoda prima argumente prosjek i listu koja sadrzi brojeve
	 */
	public static void calculateNumberOfElementsAboveOrBelowAverage(
			double average, ArrayList<Integer> list) {
		int counterAboveAverage = 0;//brojac brojeva iznad prosjeka
		int counterBelowAverage = 0;//brojac brojeva ispod prosjeka
		int counterAverage = 0;//brojac brojeva na prosjeku
		for (int i = 0; i < list.size(); i++) {//petlja prolazi cijelu listu brojeva
			if (list.get(i) < average) {//ako je broj na indeksu "i" ispod prosjeka, inkrementira odgovarajuci brojac za 1
				counterBelowAverage++;
			} else if (list.get(i) > average) {//ako je broj na indeksu "i" iznad prosjeka, inkrementira odgovarajuci brojac za 1
				counterAboveAverage++;
			} else {//ako nisu ispunjeni prethodni uslovi, broj je na prosjeku i inkrementira se brojac brojeva na prosjeku za 1
				counterAverage++;
			}
		}
		//ispisivanje rezultata
		System.out.println("Broj brojeva iznad prosjeka: "
				+ counterAboveAverage + "\nBroj brojeva na prosjeku: "
				+ counterAverage + "\nBroj brojeva ispod prosjeka: "
				+ counterBelowAverage);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();//lista u kojoj ce biti smjesteni bbrojevi koje korisnik unese
		int numInput = 0;//promjenljiva koju koristimo za unos brojeva u listu
		int counter = 0;//brojac unesenih brojeva (maksimalan broj elemenata koji korisnik moze unijeti je 100)
		
		System.out.println("Unesite cijele brojeve: (unos se prekida sa nulom, mozete unijeti najvise 100 brojeva)");
		do {
			numInput = input.nextInt();//korisnikov unos
			if (numInput == 0 || counter == 100) {// ako korisnik unese 0 ili ako je vec unio 100 elemenata, petlja se prekida
				break;
			} else {
				list.add(numInput);//smjestanje korisnickog unosa u listu
				counter++;//inkrementiranje brojaca
			}
		} while (true);
		input.close();//zatvaranje skenera
		double average = calculateAverage(list);//pozivanje metode za racunanje prosjeka i smjestanje njenog rezultata u prom. average
		calculateNumberOfElementsAboveOrBelowAverage(average,list);//pozivanje metode za racunanje i ispis broja brojeva ispod,iznad i na prosjeku

	}

}

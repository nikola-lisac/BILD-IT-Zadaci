package zadaci_20_07_2015;

import java.util.ArrayList;

/*	Zadatak br. 1
 *  Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera.
 *  Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
 *	public static Integer max(ArrayList<Integer> list)
 */
public class MaksimalnaVrijednost {
	public static Integer max(ArrayList<Integer> list) {
		Integer max = null;//postavljamo vrijednost promjenljive koja oznacava maksimalnu vriednost na null za slucaj da je arrayList prazan
		if (list.size() > 0) {
			max = list.get(0);//dodjeljujemo prom. max vrijednost nultog elementa niza
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > max) {//provjeravamo da li je element sa indeksom i veci od trenutne maksimalne vrijednosti
					max = list.get(i);//ako jeste, promjenljivoj max dodjeljujemo vrijednost tog elementa
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();//kreiramo novi ArrayList
		list.add(2);//ubacujemo vrijednosti u arraylist
		list.add(-4);
		list.add(7);
		list.add(9);
		list.add(-4);
		list.add(5);
		Integer result = max(list);//promjenljivoj result dodjeljujemo vrijednost najveceg elementa koju nam vrati metoda max
		System.out.println("Najveci element je: " + result);//ispisujemo najvecu vrijednost u arraylisti
	}

}

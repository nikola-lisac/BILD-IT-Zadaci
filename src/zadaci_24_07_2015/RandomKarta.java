package zadaci_24_07_2015;
/*
 * Zadatak br. 2
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */

public class RandomKarta {
	public static void main(String[] args) {
		String[] suits = { "Srce", "Kocka", "Pik", "Tref" };//znak karte
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };//vrijednost karte
		int randomSuit=(int)((Math.random()*4));//random broj za znak karte
		int randomRank=(int)((Math.random()*13));//random broj za vrijednost karte
		System.out.println("Vasa karta je: "+ranks[randomRank]+" "+suits[randomSuit]);//stampanje rezultata
		
	}

}

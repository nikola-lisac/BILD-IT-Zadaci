package zadaci_04_08_2015;
/*
 * Zadatak br. 5
 * Napisati program koji uèitava 10 brojeva 
 * te ispisuje koilko je jedinstvenih brojeva unijeto 
 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 */
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UniqueNumbers {
	/*
	 * metoda stampa kolekciju jedinstvenih cijelih brojeva
	 */
	public static void printUniqueNumbers(HashSet<Integer> uniqueNumbers){
		
		System.out.println("Broj jedinstvenih brojeva je: "+uniqueNumbers.size());
		
		System.out.println("Jedinstveni brojevi: ");
		for (Integer i: uniqueNumbers){
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Scanner input = null;
		
		try {
			
			input = new Scanner(System.in);
			
			//kolekcija u koju se smjestaju jedinstveni brojevi
			HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
			
			System.out.println("Unesite 10 cijelih brojeva: ");
			
			//unos 10 brojeva i njihovo smjestanje u kolekciju
			int i = 0;
			while(i<10){
				uniqueNumbers.add(input.nextInt());//unos jedinstvenih brojeva iz konzole u kolekciju
				i++;
			}
			
			//stampanje jedinstvenih brojeva
			printUniqueNumbers(uniqueNumbers);
			
		}catch (InputMismatchException e){
			System.out.println("Pogresan unos.");
		}
	}

}

package zadaci_26_07_2015;
/*
 * Zadatak br. 4
 * 
 */
public class SavrseniBrojevi {

	public static void main(String[] args) {
		int sum = 0;//suma djelilaca
		System.out.println("Savrseni brojevi su: ");
		for (int i = 1; i < 10000; i++) {//i predstavlja sve brojeve od 1 do 10 000
			for (int j = 1; j < i; j++) {//"j" predstavlja djelioce i krece se od nula do broja i
				if (i % j == 0) {//ako je broj j djelilac broja i
					sum += j;//dodaj djelilac na sumu
				}
			}
			if (sum == i) {//ako je nakon sabiranja svih djelilaca suma jednaka broju "i" taj broj je savrsen
				System.out.print(i + " ");//ispisujemo savrsen broj
			}
			sum = 0;//sumu postavljamo na nulu, kako bi provjerili i sledece brojeve
		}
	}

}

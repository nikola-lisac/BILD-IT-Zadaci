package zadaci_01_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 2
 * Napisati program koji igra sa protivnikom rock-paper-scissors. 
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
 * Program pita korisnika da unese 0, 1 ili 2 
 * te mu ispisuje poruku da li je korisnik pobijedio,
 *  da li je raèunar pobijedio ili je bilo neriješeno. 
 */
public class RockPaperScissors {
	
	/*
	 * Metoda provjerava ko je pobijedio i ispisuje pobjednika
	 * user predstavlja izbor korisnika
	 * computer predstavlja izbor racunara
	 */
	public static void whoWon(int user, int computer) {
		
		String[] choices = { "papir", " bunar", "makaze" };//moguci izbori
		
		System.out.println("Vas izbor: " + choices[user]);//korisnik je izabrao
		System.out.println("Izbor racunara: " + choices[computer]);//racunar je izabrao 
		
		//slucajevi kad pobjedjuje korisnik
		if ((user == 0 && computer == 1) || (user == 1 && computer == 2)
				|| (user == 2 && computer == 0)) {
			
			System.out.println("Vi ste pobijedili! ");
			
		}
		//slucaj kad je nerijeseno
		else if (user == computer) {
			
			System.out.println("Nerijeseno!");
			
		} 
		//u ostalim slucajevima pobjedjuje racunar
		else {
			
			System.out.println("Racunar je pobijedio!");
			
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj (0 - papir, 1 - bunar ili 2 - makaze): ");
		int userChoice = input.nextInt();//korisnikov izbor
		input.close();
		int computerChoice = (int) (Math.random() * 3); // izbor racunara

		/*
		 *  ako je korisnik unio vrijednost razlicitu od 0, 1 i 2
		 *  ispisujemo mu da je unio pogresnu vrijednost
		 */
		if (userChoice >= 0 && userChoice < 3) {
			whoWon(userChoice, computerChoice);// rezultat igre
		} 
		else {
			System.out.println("Unijeli ste pogresnu vrijednost.");
		}

	}

}

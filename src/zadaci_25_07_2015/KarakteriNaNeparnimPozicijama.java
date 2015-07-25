package zadaci_25_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 4
 * Napisati program koji pita korisnika da unese neki string 
 * te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
 * Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */
public class KarakteriNaNeparnimPozicijama {
	/*
	 * Metoda koja uzima string "str" i stampa karaktere na neparnim pozicijama
	 */
	public static void printUnevenCharacters(String str){
		System.out.print("Karakteri na neparnim pozicijama: ");
		/*
		 * petlja prolazi kroz string koji je prosljedjen kao argument i stampa karakter na indeksu "i"
		 * u svakoj iteraciji indeks se povecava za 2, sto znaci da stampa karaktere na indeksima 0,2,4... 
		 * tj. na neparnim pozicijama
		 */
		for(int i=0;i<str.length();i+=2){
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str=input.nextLine();//uneseni string
		input.close();
		printUnevenCharacters(str);//stampanje karaktera na neparnim pozicijama unesenog stringa
	}

}

package zadaci_01_08_2015;

import java.util.Random;

/*
 * Zadatak br. 1
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 
 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */
public class NumberOfMonth {

	public static void main(String[] args) {

		//svi mjeseci u godini
		String[] months = { " ", "Januar", "Februar", "Mart", "April", "Maj",
				"Jun", "Jul", "Avgust", "Septembar", "Novembar", "Decembar" };
		
		Random ran=new Random();
		
		//nasumicni broj mjeseca od 1 do 12
		int numOfMonth = (ran.nextInt(11)+1);
		
		//printanje mjeseca na indeksu nasumicnog broja
		System.out.print("Nasumicni mjesec: "+months[numOfMonth]);
		
	}

}

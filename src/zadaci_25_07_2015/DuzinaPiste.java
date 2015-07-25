package zadaci_25_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Zadatak br. 5
 * Ako imamo ubrzanje aviona "a" te brzinu pri kojoj avion uzlijeæe "v", 
 * možemo izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se sljedeæom formulom: 
 * dužina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s^2 
 * te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
 */
public class DuzinaPiste {
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite brzinu (u m/s) pri kojoj avion uzlece: ");
			double planeSpeed = input.nextDouble();//brzina pri kojoj avion uzlece
			System.out.print("Unesite ubrzanje aviona (u m/s^2): ");
			double planeAcceleration = input.nextDouble();//ubrzanje aviona
			
			double runwayLength = planeSpeed
					* (planeSpeed / (2 * planeAcceleration));//duzina piste po formuli iz zadatka
			//stampanje rezultata
			System.out.print("Duzina piste je: ");
			System.out.printf("%.3f", runwayLength);
			System.out.print(" metara.");
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		} finally {
			input.close();
		}
	}

}

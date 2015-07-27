package zadaci_27_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 2
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke. 
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese 
 * geografsku širinu i dužinu u stepenima dvije taèke na površini zemlje 
 * te mu ispisuje great circle distance. 
 * Prosjeèni radius zemlje je 6.371.01 km.
 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi se Math.toRadians metodom 
 * jer Java trigonometrijske metode koriste radianse. 
 * Širina i dužina u ovoj formuli se odnose na zapad i sjever. 
 * Koristimo negativne vrijednosti da oznaèimo istok i jug.
 */
public class UdaljenostDvijeTacke {
	/*
	 * metoda za racunanje rastojanja izmedju dvije tacke na Zemlji
	 */
	public static double calculateGreatCircleDistance(double firstX,
			double firstY, double secondX, double secondY) {
		double radius = 6371.01;// poluprecnik Zemlje u km
		
		//formula za racunanje rastojanja
		double distance = radius
				* Math.acos(((Math.sin(firstX) * Math.sin(secondX)) + (Math
						.cos(firstX) * Math.cos(secondX) * Math.cos(firstY
						- secondY))));
	
		return distance;//vracanje rastojanja
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite geografsku sirinu i duzinu (u stepenima) prve tacke: ");
		double xFirst = Math.toRadians(input.nextDouble());//geogr. sirina prve tacke pretvorena iz stepeni u radijane
		double yFirst = Math.toRadians(input.nextDouble());//geogr. duzina prve tacke pretvorena iz stepeni u radijane
		System.out.println("Unesite geografsku sirinu i duzinu (u stepenima) druge tacke: ");
		double xSecond = Math.toRadians(input.nextDouble());//geogr. sirina druge tacke pretvorena iz stepeni u radijane
		double ySecond = Math.toRadians(input.nextDouble());//geogr. duzina druge tacke pretvorena iz stepeni u radijane
		input.close();
		//rastojanje izmedju te dvije tacke
		double distance = calculateGreatCircleDistance(xFirst, yFirst, xSecond,ySecond);
		System.out.println("Udaljenost izmedju te dvije tacke je: " + distance+" km.");
	}

}

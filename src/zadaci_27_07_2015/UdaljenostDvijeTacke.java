package zadaci_27_07_2015;

import java.util.Scanner;

/*
 * Zadatak br. 2
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke. 
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese 
 * geografsku �irinu i du�inu u stepenima dvije ta�ke na povr�ini zemlje 
 * te mu ispisuje great circle distance. 
 * Prosje�ni radius zemlje je 6.371.01 km.
 * Stepene koje korisnik unese trebamo promijeniti u radianse koriste�i se Math.toRadians metodom 
 * jer Java trigonometrijske metode koriste radianse. 
 * �irina i du�ina u ovoj formuli se odnose na zapad i sjever. 
 * Koristimo negativne vrijednosti da ozna�imo istok i jug.
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

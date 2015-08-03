package zadaci_03_08_2015;

/*
 * Zadatak br. 5
 * Pretpostavimo da školarina za godinu dana na fakultetu košta 10.000 
 * i da se poveæava za 5% svake godine. 
 * Godinu dana od danas, školarina æe iznositi 10.500. 
 * Napisati program koji izraèunava koliko æe školarina za godinu dana iznositi kroz 10 godina.
 */
public class Tuition {

	public static void calculateTuition(double tuition, int years) {
		double rate = 0.05;//kamata
		
		for (int i = 0; i < years; i++) {
			tuition += tuition * rate;//racunanje skolarine 
		}

		//ispis rezultata
		System.out.printf("Skolarina za " + years + " godina ce iznositi: %.2f", tuition);
	}

	public static void main(String[] args) {
		
		//izracunaj skolarinu nakon 10 godina ako je skolarina za godinu dana 10 000
		calculateTuition(10000, 10);
	}

}

package zadaci_07_08_2015;

/*
 * Zadatak br. 7.13
 * (Random number chooser) Write a method that returns a random number between 1 and 54, 
 * excluding the numbers passed in the argument. 
 * The method header is specified as follows:
 * public static int getRandom(int... numbers)
 */
public class RandomNumberChooser {
	/*
	 * Metoda generise nasumican broj izmedju 1 i 54 
	 * koji nije jednak brojevima prosledjenim kao argumenti metode
	 * Metoda vraca random broj
	 */
	public static int getRandom(int... numbers) {
		
		boolean isOK = false;//promjenljiva za kontrolu petlje
		
		int randomNumber = 0;//random broj
		
		while (!isOK) {
			
			//generisanje random broja
			randomNumber = 1 + (int) (Math.random() * 54);
			
			//petlja prolazi sve brojeve prosledjene kao argumenti
			for (int i = 0; i < numbers.length; i++) {
				
				/*
				 * ako je broj jednak nekom od tih brojeva petlja se prekida,
				 *  random broj se ponovo generise i ponovo se ponavlja proces
				 */
				if (randomNumber == numbers[i]) {
					isOK = false;
					break;
				} 
				
				/*
				 * ako broj nije jednak kontrolna varijabla je true
				 * ako prodje cijelu petlju i kontrolna varijabla ostane true
				 * generisan je odgovarajuci random broj
				 */
				else {
					isOK = true;
				}
			}
		}
		
		//vracanje random broja
		return randomNumber;
	}

	public static void main(String[] args) {
		
		//generisanje random broja koji nije jedan od brojeva posledjenih kao argument
		int random = getRandom(1,2,3,4,5,6,7,8,9,10);
		//stampanje random broja
		System.out.println("Random number is: " + random);
	}

}

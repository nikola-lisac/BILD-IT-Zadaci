package opcioni_zadaci_06_08_2015;
/*
 * Zadatak 6.9
 * (Conversions between feet and meters) Write a class that contains the following
 * two methods:
 * public static double footToMeter(double foot)
 * public static double meterToFoot(double meter)
 * The formula for the conversion is:
 * meter = 0.305 * foot
 * foot = 3.279 * meter
 * Write a test program that invokes these methods to display the following tables:
 * Feet Meters | Meters Feet
 * 1.0  0.305  | 20.0   65.574
 * 2.0  0.610  | 25.0   81.967
 * ...
 * 9.0  2.745  | 60.0   196.721
 * 10.0 3.050  | 65.0   213.115
 */
public class FeetAndMetersConversion {
	
	/*
	 * metoda pretvara stope u metre
	 * param foot iznos u stopama
	 * vracanje iznosa u metrima
	 */
	 public static double footToMeter(double foot){
		 return 0.305 * foot;
	 }
	 
	 /*
	  * metoda pretvara metre u stope
	  * param meter je iznos u metrima
	  * metoda vraca iznos u stopama
	  */
	 public static double meterToFoot(double meter){
		 return 3.279 * meter;
	 }
	public static void main(String[] args) {
		//printanje zaglavlja
		System.out.println("Feet\t\tMeters |  Meters\tFeet");
		System.out.println("--------------------------------------------------");
		
		//printanje tabele
		int j=20;
		for(int i = 1;i<=10 && j<=65;i++,j+=5){
			
			//printanje prve dve kolone
			System.out.printf((double)i+"\t\t%.3f",footToMeter(i));
			
			//printanje razmaka izmedju 2. i 3. kolone
			System.out.print("  |  ");
			
			//printanje 3. i 4. kolone
			System.out.printf((double)j+"\t\t%.3f", meterToFoot(j));
			System.out.println();
		}
	}

}

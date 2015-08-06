package opcioni_zadaci_06_08_2015;
/*
 * Zadatak br. 6.13
 * Write a method to compute the following series: m(i) = 1/2 + 2/3 + ... i / i+1
 * Write a test program that displays the following table:
 * i	 m(i)
 * 1	 0.5000
 * 2	 1.1667
 * ...
 * 19	 16.4023
 * 20	 17.354
 */
public class SumSeries {
	/*
	 * Metoda pronalazi sumu po formuli m(i) = 1/2 + 2/3 + ... i / i+1
	 * gdje parametar number predstavlja vrijednost i
	 * metoda vraca sumu
	 */
	public static double sumSeries(int number){
		double  sum=0;
		
		for(int i=1;i<=number;i++){
			
			sum+=(double)i/(i+1);
		}
		return sum;
	}
	public static void main(String[] args) {
		//ispis zaglavlja
		System.out.println("i \tm(i)");
		System.out.println("--------------");
		
		//ispis tabele
		for(int i = 1;i<=20;i++){
			System.out.printf(i+"\t"+"%.4f",sumSeries(i));
			System.out.println();
		}
	}

}

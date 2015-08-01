package zadaci_01_08_2015;

/*
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */
public class Sum {
	
	/*
	 * rekurzivna metoda koja racuna sumu kolicnika brojeva (number-2) i number 
	 * dok ne dodje do 3 koji je posljednji djelilac
	 */
	public static double sum(int number){
		//ako je djelilac 3 vraca 0
		if(number<3){
			return 0;
		}
		else{
			//sabira kolicnik dva broja i ponovo poziva metodu prosledjujuci broj umanjen za 2
			return ((number-2)/(double)(number))+sum(number-=2);
		}
	}
	public static void main(String[] args) {
		
		double sum=sum(99);//suma
		System.out.println("Suma iznosi: "+sum);
	}

}

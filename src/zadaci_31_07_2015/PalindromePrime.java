package zadaci_31_07_2015;
/*
 * Zadatak br. 4
 * Palindrome prime je prosti broj koji je takoðer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
 */
public class PalindromePrime {
	
	/*
	 * Metoda obrce cijeli broj, prva cifra postaje zadnja, druga predzadnja itd.. 
	 * i vraca ga.
	 */
	public static int reverse(int number) {

		String str = Integer.toString(number);// smjestamo broj u string str
		String result = "";

		/*
		 * petlja ide od posljednjeg indeksa string u koji smo smjestili broj do
		 * prvog i smjesta cifre na indeksu u string result tako da dobijemo
		 * obrnut redoslijed cifara
		 */
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}

		// string sa obrnutim redoslijedom cifara pretvaramo u cijeli broj
		int reverseNumber = Integer.parseInt(result);

		return reverseNumber;
	}
	
	/*
	 * metoda provjerava da li je broj n prost ili ne i vraca true, ako jeste,
	 * odnosno false ako nije
	 */
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n == 0 || n == 1) {// brojevi 0 i 1 nisu prosti
			isPrime = false;
		}
		return isPrime;
	}
	
	/*
	 * Metoda ispituje da i je broj palindrom ili ne i u odnosu na to vraca vrijednost true ili false
	 * Broj je palindrom ako mu je ista vrijedost i kad se cita unaprijed i unazad.
	 */
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {//ako je broj jednak broju sa obrnutim ciframa onda je on palindrom
			return true;
		} else {//ako nije jednak onda nije palindrom
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int countNumbers = 0;//brojac palindrome prime brojeva
		int countPerLine = 0;//brojac ispisa po liniji
		int i = 0;//broj koji provjeravamo
		
		System.out.println("Prvih 100 palindromic prime brojeva: ");
		
		//petlja stampa prvih 100 palindrom prostih brojeva, 10 brojeva po liniji
		while(countNumbers<100){
			
			//provjera da li je broj palindromic prime
			if(isPrime(i) && isPalindrome(i)){
				
				countNumbers++;
				countPerLine++;
				System.out.print(i + " ");//stampanje palindromic prime-a
				
				//ako je brojac po liniji ispisao 10 brojeva, prelazi u novi red
				if(countPerLine % 10 == 0){
					
					System.out.println();
				}
			}
			
			i++;//povecavanje broja koji provjeravamo za jedan
		}
	}

}

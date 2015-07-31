package zadaci_31_07_2015;
/*
 * Zadatak br. 3
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako. '
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 */
public class EmirpNumbers {
	
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

	/*
	 * Emirp broj je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako.
	 * 
	 * Metoda provjerava da li je broj emirp i vraca true, ako jeste, odnosno false ako nije
	 */
	public static boolean isEmirp(int n){
		
		//ako je broj n prost, ako je njegov obrnut broj prost i ako n nije palindrom, onda je n emirp
		if(isPrime(n) && isPrime(reverse(n)) && !isPalindrome(n)){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		int countNumbers = 0;//brojac emirp brojeva
		int countPerLine = 0;//brojac ispisa po liniji
		int i = 0;//broj koji provjeravamo
		
		System.out.println("Prvih 100 emirp brojeva: ");
		
		//petlja stampa prvih 100 emirp brojeva, 10 brojeva po liniji
		while(countNumbers<100){
			
			//provjera da li je broj emirp
			if(isEmirp(i)){
				
				countNumbers++;
				countPerLine++;
				System.out.print(i + " ");//stampanje emirpa
				
				//ako je brojac po liniji ispisao 10 brojeva, prelazi u novi red
				if(countPerLine % 10 == 0){
					
					System.out.println();
				}
			}
			
			i++;//povecavanje broja koji provjeravamo za jedan
		}
	}

}

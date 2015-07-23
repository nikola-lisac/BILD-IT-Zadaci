package zadaci_23_07_2015;

import java.util.ArrayList;

/*
 * Zadatak br. 4
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji
 */
public class NasumicniKarakteriIBrojevi {
	/*
	 * Metoda koja printa sve elemente liste koju joj proslijedimo, 10 elemenata po liniji
	 */
	public static <E> void print10InLine(ArrayList<E>list){
		int count=0;//brojac
		for(int i=0;i<list.size();i++){//petlja se vrti do zadnjeg elementa liste
			count++;//inkrementiramo brojac
			if(count%10==0){//ako je brojac ispisao 10 elementa, ispisuje element na indeksu "i" u novom redu
				System.out.println(list.get(i)+" ");
			}else{//ako brojac nije ispisao 10 elemenata, ispisuje elemnt na indeksu "i" u istom redu
				System.out.print(list.get(i)+" ");
			}
		}
	}
	public static void main(String[] args) {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";//string sa svim karakterima alfabeta
		ArrayList<Character> listOfChars=new ArrayList<>();//lista u kojoj ce biti smjesteni karakteri
		ArrayList<Integer> listOfIntegers=new ArrayList<>();//lista u kojoj ce biti smjesteni cijeli brojevi
		for(int i=0;i<100;i++){//petlja se vrti dok ne generisemo 100 random vrijednosti(def. u zadatku)
			/*
			 * generisanje random uppercase karaktera je omoguceno sto preko math.random generise broj od 0 do 26
			 * a zatim iz stringa "str" uzmemo karakter na indeksu koji odgovara tom random broju
			 */
			char randomChar=str.charAt((int)(Math.random()*26));
			listOfChars.add(randomChar);//dodajemo random karakter u listu
		
			int randomNumber=(int)(Math.random()*10);//generisemo nasumican jednocifren broj
			listOfIntegers.add(randomNumber);//dodajemo random broj u listu
		}
		System.out.println("Nasumicni karakteri: ");
		print10InLine(listOfChars);//stampanje liste karaktera
		System.out.println("\nNasumicni brojevi: ");
		print10InLine(listOfIntegers);//stampanje liste brojeva
	}

}

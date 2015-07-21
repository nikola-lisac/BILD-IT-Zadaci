package zadaci_21_07_2015;
/*
 * Zadatak br. 3
 * Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu.
 * Rijeèi trebaju biti odvojene jednim spaceom.
 * Ime file proslijediti kao argument u vaš program.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrojZnakovaRijeciLinija {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(System.in);//skener za unos sa tastature
		System.out.println("Unesite ime fajla: ");
		String fileName = inputFile.next();//ime fajla
		inputFile.close();
		File file = new File(fileName);
		Scanner input = new Scanner(file);//skener za citanje iz fajla
	
		int charCount = 0;//brojac karaktera
		int wordCount = 0;//brojac rijeci
		int lineCount = 0;//brojac linija
		while(input.hasNextLine()){//petlja ide do zadnje linije u fajlu
			String line = input.nextLine();//unosim liniju u string
			lineCount++;//povecavam brojac linija za jedan jer svaki prolazak kroz petlju gleda sledecu liniju
	
			charCount+=line.length();//broj karaktera jednak je zbiru prethodnog broja karaktera i broja karaktera u trenutnoj liniji fajla
			
			String[] str = line.split(" ");//pravim string niz koji se sastoji od rijeci iz linije fajla; splituje po " " posto su rijeci odvojene space-om
			wordCount += str.length;//broj rijeci jednak je zbiru prethodnog broja rijeci i broja rijeci u nizu rijeci iz trenutne linije (str)
		}
		input.close();
		System.out.println("\nBroj linija: " + lineCount);//ispis broja linija
		System.out.println("Broj rijeci: " + wordCount);//ispis  broja rijeci
		System.out.println("Broj karaktera: " + charCount);//ispis broja karaktera
	}
}

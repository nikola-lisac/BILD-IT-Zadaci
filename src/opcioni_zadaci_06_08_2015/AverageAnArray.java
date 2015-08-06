package opcioni_zadaci_06_08_2015;

import java.util.Scanner;

/*
 * Zadatak br. 7.8
 * Write two overloaded methods that return the average of an array with the following headers:
 * public static int average(int[] array)
 * public static double average(double[] array)
 * Write a test program that prompts the user to enter ten double values, 
 * invokes this method, and displays the average value.
 */
public class AverageAnArray {
	
	/*
	 * Metoda racuna aritmeticku sredinu niza cjelobrojnih vrijednosti i vraca je
	 */
	public static int average(int[] array){
		int sum=0;//suma
		for(int a:array){
			sum+=a;
		}
		int average = sum / array.length;//aritmeticka sredina
		return average;
	}
	
	/*
	 * Metoda racuna aritmeticku sredinu niza decimalnih vrijednosti i vraca je
	 */
	public static double average(double[] array){
		double sum=0;//suma
		for(double a:array){
			sum+=a;
		}
		
		double average = sum / array.length;//aritmeticka sredina
		return average;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] array = new double[10];
		
		System.out.println("Enter 10 double values:");
		//unos vrijednosti u niz
		for(int i =0;i<array.length;i++){
			array[i] = input.nextDouble();
		}
		input.close();
		//printanje rezultata
		System.out.println("Average is: "+average(array));
	}

}

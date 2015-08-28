package zadaci_27_08_2015;

import helpClasses.Methods;

/**
 * Design a class named Complex for representing complex numbers and the
 * methods add, subtract, multiply, divide, and abs for performing complex number operations, 
 * and override toString method for returning a string representation for a complex number. 
 * The toString method returns (a + bi) as a string. If b is 0, it simply returns a. 
 * Your Complex class should also implement the Cloneable interface.
 * Provide three constructors Complex(a, b), Complex(a), and Complex().
 * Complex() creates a Complex object for number 0 and Complex(a) creates a Complex object with 0 for b. 
 * Also provide the getRealPart() and getImaginaryPart() methods for returning 
 * the real and imaginary part of the complex number, respectively.
 * Write a test program that prompts the user to enter two complex numbers and
 * displays the result of their addition, subtraction, multiplication, division, and absolute value.
 * @author Nikola
 *
 */
public class Zadatak04ComplexClass {

	public static void main(String[] args) {
		
		// user is entering real and imaginary part of the first complex number
		System.out.println("Enter the real part of the first complex number: ");
		double realOne = Methods.inputDouble();
		System.out.println("Enter the imaginary part of the first complex number: ");
		double imaginaryOne = Methods.inputDouble();
		// creating first complex number
		Complex c1 = new Complex(realOne,imaginaryOne);
		
		// user is entering real and imaginary part of the second complex number
		System.out.println("Enter the real part of the second complex number: ");
		double realTwo = Methods.inputDouble();
		System.out.println("Enter the imaginary part of the second complex number: ");
		double imaginaryTwo = Methods.inputDouble();
		// creating second complex number
		Complex c2 = new Complex(realTwo,imaginaryTwo);
		
		// printing results of all operations on complex numbers
		System.out.println(c1.toString()+" + "+c2.toString()+" = "+c1.add(c2));
		System.out.println(c1.toString()+" - "+c2.toString()+" = "+c1.subtract(c2));
		System.out.println(c1.toString()+" * "+c2.toString()+" = "+c1.multiply(c2));
		System.out.println(c1.toString()+" / "+c2.toString()+" = "+c1.divide(c2));
		System.out.println("|"+c1.toString()+"| = "+c1.abs());

		
	}

}

class Complex implements Cloneable {

	private double a; // real part of the complex number
	private double b; // imaginary part of the complex number

	/** default constructor with 0,0 values */
	Complex() {
		this(0, 0);
	}

	/** constructor which creates new instance with the value of the real part only */
	Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	/** Constructor which creates new instance with the defined values of the real and imaginary parts */
	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	/** method returns new instance as the result of the addition between two instances */
	public Complex add(Complex c1) {
		return new Complex(this.a + c1.a, this.b + c1.b);
	}

	/** method returns new instance as the result of the subtraction between two instances */
	public Complex subtract(Complex c1) {
		return new Complex(this.a - c1.a, this.b - c1.b);
	}

	/** method returns new instance as the result of the mutiplication between two instances */
	public Complex multiply(Complex c1) {
		return new Complex(this.a * c1.a - this.b * c1.b, this.b * c1.a
				+ this.a * c1.b);
	}
	
	/** method returns new instance as the result of the division between two instances */
	public Complex divide(Complex c1) {
		double divisor = c1.a * c1.a + c1.b * c1.b;
		return new Complex((this.a * c1.a + this.b * c1.b) / divisor, (this.b
				* c1.a - this.a * c1.b)
				/ divisor);
	}
	
	/** method returns absolute value of the instance */
	public double abs() {
		return Math.sqrt(this.a * this.a + this.b * this.b);
	}

	/** method returns the real part of the instance */
	public double getRealPart(){
		return this.a;
	}
	
	/** method returns the imaginary part of the instance */
	public double getImaginaryPart(){
		return this.b;
	}
	
	/** overriden toString method which returns formated complex number */
	@Override
	public String toString(){
		if(b == 0){
			return a + "";
		}
		else {
			return "("+a+" + "+b+"i)";
		}
	}
	
	/** overriden clone method which return new instance with the same data field values as calling instance */
	@Override
	public Complex clone(){
		return new Complex(this.a,this.b);
	}
}

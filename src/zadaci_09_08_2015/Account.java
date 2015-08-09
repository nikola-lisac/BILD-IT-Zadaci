package zadaci_09_08_2015;
/*
 * Zadatak br. 9.7
 * (The Account class) Design a class named Account that contains:
 * A private int data field named id for the account (default 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestRate that stores the current interest rate (default 0).
 * Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated.
 * A method named getMonthlyInterestRate() that returns the monthly interest rate
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. 
 * (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 */
import java.util.Date;

public class Account {
	private int id = 0; //identifikacioni broj
	private double balance = 0; //stanje racuna
	private static double anualInterestRate = 0; //godisnja kamatna stopa
	private Date dateCreated; //datum kreiranja racuna

	/*
	 * Default konstruktor
	 */
	Account() {
		dateCreated=new Date();
	}

	/*
	 *Konstruktor
	 */
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated=new Date();
	}

	/*
	 * Setteri i getteri
	 */
	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	Date getDateCreated() {
		return this.dateCreated;
	}

	
	/*
	 * Metoda vraca iznos mjesecne kamatne stope
	 */
	double getMonthlyInterestRate() {
		return (anualInterestRate / (12 * 100));
	}
	
	/*
	 * Metoda vraca iznos mjesecne kamate
	 */
	double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	/*
	 * Setter godin=snje kamatne stope
	 */
	static void  setAnualInterestRate(double newAnualInterestRate) {
		anualInterestRate = newAnualInterestRate;
	}

	/*
	 * Metoda koja podize sumu proslijedjenu kao parametar sa racuna
	 */
	void withdraw(double sum) {
		this.balance = balance - sum;
	}

	/*
	 * Metoda koja dodaje proslijedjeni iznos na racun
	 */
	void deposit(double deposit) {
		this.balance = balance + deposit;
	}
}

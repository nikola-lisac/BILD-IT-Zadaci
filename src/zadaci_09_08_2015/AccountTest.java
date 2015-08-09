package zadaci_09_08_2015;
/*
 * Zadatak br. 9.6
 * Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, 
 * use the deposit method to deposit $3,000, 
 * and print the balance, the monthly interest, and the date when this account was created
 */

public class AccountTest {

	public static void main(String[] args) {
		//kreiramo novu instancu klase account sa id-om 1122 i stanjem racuna 20 000
		Account acc=new Account(1122,20000);
		
		//postavljamo godisnju kamatnu stopu na 4.5 %
		Account.setAnualInterestRate(4.5);
		
		//podizemo 2500 sa racuna
		acc.withdraw(2500);
		
		//uplacujemo 3000 na racun
		acc.deposit(3000);
		
		//printanje stanja racuna, mjesecne kamate i datuma kreiranja racuna
		System.out.println("Balance: "+acc.getBalance());
		System.out.println("Monthly interest: "+acc.getMonthlyInterest());
		System.out.println("Account was created: "+acc.getDateCreated());
	}

}

package zadaci_20_08_2015;
/**
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or number of years is less than or equal to zero.
 * @author Nikola Lisicic
 *
 */
public class Zadatak05Loan {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Zadatak05Loan() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, number of years,
	 * and loan amount
	 */
	public Zadatak05Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
			throw new IllegalArgumentException(
					"annualInterestRate, numberOfYears and loanAmount must be greater than 0!");
		} else {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
		}
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException(
					"AnnualInterestRate must be greater than 0!");
		} else {
			this.annualInterestRate = annualInterestRate;
		}
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException(
					"numberOfYears must be greater than 0!");
		} else {
			this.numberOfYears = numberOfYears;
		}
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException(
					"loanAmount must be greater than 0!");
		} else {
			this.loanAmount = loanAmount;
		}
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	@Override
	public String toString() {
		return "Loan amount: " + loanAmount + "\nAnual interest rate: "
				+ annualInterestRate + "\nNumber of years: " + numberOfYears;
	}

	public static void main(String[] args) {

		Zadatak05Loan loan = new Zadatak05Loan(0.5, 5, 0);
		System.out.println(loan);
		

	}
}

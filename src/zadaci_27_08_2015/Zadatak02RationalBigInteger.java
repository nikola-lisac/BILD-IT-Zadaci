package zadaci_27_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * (Use BigInteger for the Rational class) Redesign and implement the
 * Rational class in Listing 13.13 using BigInteger for the numerator and denominator.
 * @author Nikola
 *
 */
public class Zadatak02RationalBigInteger {

	public static void main(String[] args) {
		RationalBig r1 = new RationalBig(new BigInteger("3"), new BigInteger("9")); // 3/9
		RationalBig r2 = new RationalBig(new BigInteger("1"), new BigInteger("3")); // 1/3
		
		// print result of eqaul
		System.out.println(r1.toString()+" equal "+r2.toString()+"? "+r1.equals(r2));
		
		RationalBig r3 = new RationalBig(new BigInteger("1"), new BigInteger("4")); // 1/4
		// print result of double value
		System.out.println("Double value of "+r3.toString()+": "+r3.doubleValue());
		
		
	}

}

class RationalBig extends Number implements Comparable<RationalBig> {
	// Data fields for numerator and denominator
	private BigInteger numerator;
	private BigInteger denominator;

	/** Construct a rational with default properties */
	public RationalBig() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public RationalBig(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public RationalBig add(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	/** Subtract a rational number from this rational */
	public RationalBig subtract(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	/** Multiply a rational number by this rational */
	public RationalBig multiply(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	/** Divide a rational number by this rational */
	public RationalBig divide(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new RationalBig(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalBig) other)).getNumerator().compareTo(
				BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implement the doubleValue method in Number
	public double doubleValue() {
		BigDecimal numer = new BigDecimal(numerator);
		BigDecimal denum = new BigDecimal(denominator);
		return numer.divide(denum).doubleValue();
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implement the compareTo method in Comparable
	public int compareTo(RationalBig o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}
}
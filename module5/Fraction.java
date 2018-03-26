package module5;

public class Fraction {
	private double numerator;
	private double denominator;
	
/*	
	public Fraction(double n, double d) {
		numerator = n;
		denominator = d;
	}
*/	
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public double getDrop() {
		double drop = numerator / denominator;
		return drop;
	}

}

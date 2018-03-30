package module5;

public class Runner {
	public static void main(String[] args) {
		
		Fraction fraction1 = new Fraction(10.0, 2.0);
		Fraction fraction2 = new Fraction(4.0, 2.0);
		Fraction fraction3 = new Fraction(1200, 2);
		FractionArray fractions = new FractionArray(3);
		fractions.addFractions(fraction1, fraction2, fraction3);
		fractions.printFractions();
		
	}
}

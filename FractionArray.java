package module5;

public class FractionArray {

	private Fraction[] fractionArray;

	public FractionArray(int x) {
		fractionArray = new Fraction[x];
	}

	public void addFractions(Fraction fraction1, Fraction fraction2, Fraction fraction3) {
		fractionArray[0] = fraction1;
		fractionArray[1] = fraction2;
		fractionArray[2] = fraction3;
	}

	public void printFractions() {
		for (Fraction fraction : fractionArray) {
			System.out.println(fraction.getNumerator() / fraction.getDenominator());
		}
	}
}

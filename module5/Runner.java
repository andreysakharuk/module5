package module5;

public class Runner {

	public static void main(String[] args) {
		Fraction fraction = new Fraction();
		double[] k = new double[10];

		for (double drop : k) {
			double n = Math.random();
			double d = Math.random();
			if (d == 0) {
				d = d++;
			}
			fraction.setNumerator(n);
			fraction.setDenominator(d);
			drop = fraction.getDrop();
			System.out.println(drop);
		}
	}
}

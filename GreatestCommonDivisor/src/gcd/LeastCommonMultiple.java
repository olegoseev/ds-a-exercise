package gcd;

public class LeastCommonMultiple {

	public static double lcm(double a, double b) {
		
		double c = EuclidAlgorithm.gcd(a, b);
		double z = a / c;
		return z * b;
	}
}

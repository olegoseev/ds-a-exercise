package gcd;

public class EuclidAlgorithm {

	public static double gcd(double a, double b) {
		
		double x = Math.max(a, b);
		double y = Math.min(a, b);
		double z = 0;
		
		while (y != 0) {
			z = x % y;
			x = y;
			y = z;
		}
		return x;
	}
}

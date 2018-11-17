package numericalintegration;

public class Curve {

	public static double curveHeight(double x) {
		return 1 + x + Math.sin(x * 2);
	}
}

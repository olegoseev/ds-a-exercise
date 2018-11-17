package numericalintegration;

public class TrapezoidRule {

	/**
	 * 
	 * @param x1
	 * 			x Axis start point
	 * @param x2
	 * 			x Axis end point
	 * @param n
	 * 			number of slices
	 * @return
	 * 		  calculated area
	 */
	public static double integrate(double x1, double x2, int n) {
		double dx = (x2 - x1) / n;
		double area = 0;
		
		for(double x = x1; x <= x2; x += dx) {
			area += Curve.curveHeight(x);
		}
		
		area = area * 2 - Curve.curveHeight(x1) - Curve.curveHeight(x2);
		area *= (dx / 2);
		
		return area;
	}

}

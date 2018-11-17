package numericalintegration;

public class RectangleRule {

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
		
		for(double x = x1; x <= x2 - dx; x += dx) {
			area += Curve.curveHeight(x);
		}
		
		area *= dx;
		
		return area;
	}
}

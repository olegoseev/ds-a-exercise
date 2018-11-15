package primefactor;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
	
	private static List<Double> factors = new LinkedList<>();
	public static List<Double> primeFactor(double a) {

		factors.clear();
		
		double x = a;
		
		while(x % 2 == 0) {
			factors.add((double) 2);
			x = x / 2;
		}
		
		double factor = 3;
		
		double stopAt = Math.sqrt(x);
		
		while(factor <= stopAt) {
			
			while(x % factor == 0) {
				factors.add(factor);
				x = x / factor;
				stopAt = Math.sqrt(x);
			}
			
			factor += 2;
		}
		
		if (x > 1) {
			factors.add(x);
		}
		
		return factors;
	}
}

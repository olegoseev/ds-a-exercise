package primefactor;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
	
	private static List<Long> factors = new LinkedList<>();
	
	public static List<Long> primeFactor(long a) {

		factors.clear();
		
		long x = a;
		while(x % 2 == 0) {
			factors.add(2L);
			x /= 2;
		}
		
		long factor = 3;
		
		long stopAt = (long) Math.sqrt(x);
		
		while(factor <= stopAt) {
			
			while(x % factor == 0) {
				factors.add(factor);
				x /= factor;
				
				// new stop value
				stopAt = (long) Math.sqrt(x);
			}
			
			factor += 2;
		}
		
		if (x > 1) {
			factors.add(x);
		}
		
		return factors;
	}
}

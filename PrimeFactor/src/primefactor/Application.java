package primefactor;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		long a = 123456789012345678L;
		
		List<Long> factors = PrimeFactor.primeFactor(a);

		StringBuilder s = new StringBuilder();
		for(Long l : factors) {
			s.append(l.toString() + "x");
		}
		
		System.out.print(s.substring(0, s.length() -1));
	}
}

package primefactor;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Double a = 123456789012345678.0;
		//Double a = 204.0;
		
		List<Double> factors = PrimeFactor.primeFactor(a);

		for(Double d : factors) {
			System.out.print(d.intValue() + "x");
		}
	}

}

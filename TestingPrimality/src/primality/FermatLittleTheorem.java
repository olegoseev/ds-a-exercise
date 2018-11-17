package primality;

import java.math.BigInteger;

public class FermatLittleTheorem {
	
	public static boolean isPrime(long p, int tests) {
		if(p < 2) {
			return false;
		}
		if(p == 2 || p == 3) {
			return true;
		}
		
		BigInteger bigp = new BigInteger(Long.toString(p));
		
		boolean prime = true;
		for(int i = 0; i < tests; i++) {
			Integer random = (int) (Math.random()*(bigp.intValue() -1) + 1);
			BigInteger n = new BigInteger(random.toString());
			BigInteger result = n.pow((int) (bigp.intValue() - 1));
			int mod = result.mod(bigp).intValue();
			
			if(mod != 1) {
				prime = false;
			}
		}
		return prime;
	}
}

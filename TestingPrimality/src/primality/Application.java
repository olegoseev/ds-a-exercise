package primality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter testing number");
			String in = br.readLine();
			long p = Long.parseLong(in);
			
		
			System.out.println("How many tests?");
			in = br.readLine();
			int tests = Integer.parseInt(in);
			
			if (tests == 0) {
				tests = 1;
			}
			
			boolean isPrime = FermatLittleTheorem.isPrime(p, tests);
			
			System.out.println("The number is " + (isPrime ? "prime" : "not prime"));
			
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}

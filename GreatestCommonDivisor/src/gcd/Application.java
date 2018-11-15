package gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter two numbers separated by comma (,)");
		
		String s = br.readLine();
		
		String[] parts = s.split(",");
		
		
		double a = Double.parseDouble(parts[0].trim());
		double b = Double.parseDouble(parts[1].trim());

		double result = EuclidAlgorithm.gcd(a, b);
		
		System.out.println("Greatest common divisor is " + result);
		
		
		result = LeastCommonMultiple.lcm(a, b);
		
		System.out.println("Least common multiple is " + result);
	}

}

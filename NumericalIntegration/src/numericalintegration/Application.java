package numericalintegration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Numerical Integration:
 * calculate the area below given curve. two methods are being used to calculate
 * the area:
 * Rectangle rule
 * Trapezoid rule
 * 
 * @author Oleg
 *
 */

public class Application {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			System.out.println("X from:");
			String s = br.readLine();
			int x1 = Integer.parseInt(s);
			
			System.out.println("X to:");
			s = br.readLine();
			int x2 = Integer.parseInt(s);
			
			
			System.out.println("Enter number of slices");
			s = br.readLine();
			
			int n = Integer.parseInt(s.trim());
			
			double rArea = RectangleRule.integrate(x1, x2, n);
			double tArea = TrapezoidRule.integrate(x1, x2, n);
			
			System.out.println("Rectangle Rule result: " + rArea);
			System.out.println("Trapozoid Rule result: " + tArea);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}

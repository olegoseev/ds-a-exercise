package randomization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	
	private static void printResults(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (i%10 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", arr[i]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		RandomArray ra =  new RandomArray();
		
		System.out.println("Randomizing array of 100 elements");
		
		int[] result = ra.simpleRandom();

		printResults(result);
		
		System.out.println();
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements to pick from the array");
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		System.out.println("Picking " + n + " random numbers from array of 100 elements");
		result = ra.pickNRandomElementsFromArray(n);
	 	printResults(result);
	 	System.out.println();
		System.out.println("Random " + n + " first numbers in array of 100 elements");
		result = ra.randomAndPickNElementsFromArray(n);
	 	printResults(result);

	}

}

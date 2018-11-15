package primenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	private static void printResults(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (i%10 == 0) {
				System.out.println();
			}
			System.out.printf("%6d", arr[i]);
		}
	}
	
	private static int[] initArray(int size) {
		
		if (size < 2) {
			return null;
		}
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	private static void printMessage(String message) {
		System.out.println();
		System.out.println();
		System.out.println(message);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size:");
		String s = br.readLine();
		
		if (!s.isEmpty()) {
			
			try {
				int size = Integer.parseInt(s.trim());

				int[] arr = initArray(size);
				
				if (arr != null) {

					printMessage("Original list");
					printResults(arr);
					
					int[] primes = SieveOfEratosthenes.findPrimes(arr, arr.length);
					

					printMessage("Prime numbers");
					printResults(primes);
					
				}
					
			} catch (NumberFormatException ne) {
				ne.printStackTrace();
			}
		}
	}
}

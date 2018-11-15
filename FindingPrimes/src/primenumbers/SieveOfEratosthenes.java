package primenumbers;

public class SieveOfEratosthenes {

	public static int[] findPrimes(int[] arr, int size) {
		
		arr[0] = 0;
		arr[1] = 0;
		
		// Zeroes all numbers that multiplies by 2
		for(int i = 3; i < size; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = 0;
			}
		}
		
		int stopAt = (int) Math.sqrt(size);
		
		for(int i = 3; i < stopAt; i += 2) {
			if(arr[i] != 0) {
				// Zeroes all numbers multiplies by i
				for(int j = i * i; j < size; j += 2 * i) {
					arr[j] = 0;
				}
			}
		}
		
		return arr;
	}

}

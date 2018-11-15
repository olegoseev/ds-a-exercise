package randomization;

public class RandomArray {

	private int[] intArr = null;
	
	public RandomArray() {
		intArr = new int[100];
	}
	
	private void init() {
		
		if (intArr != null) {
			for (int i = 0; i < intArr.length; i++) {
				intArr[i]=i;
			}
		}
	}
	
	public int[] simpleRandom() {
		init();
		
		for(int i = 0; i < intArr.length; i++) {
			int random = (int )(Math.random() * (intArr.length -1) + 1);
			int temp = intArr[i];
			intArr[i] = intArr[random];
			intArr[random] = temp;
		}
		
		return intArr;
	}
	
	public int[] pickNRandomElementsFromArray(int n) {
		init();
		int[] ba = new int[n];
		int picked = 0;
		
		while(picked < n) {
			int random = (int )(Math.random() * intArr.length-1);
			
			if(intArr[random] != -1) {
				intArr[random] = -1;
				ba[picked] = random;
				picked++;
			}
		}
		
		return ba;
	}
	
	public int[] randomAndPickNElementsFromArray(int n) {
		init();
		int[] ba = new int[n];
		
		for(int i= 0; i < n; i++) {
			int random = (int )(Math.random() * intArr.length-1);
			int temp = intArr[i];
			intArr[i] = intArr[random];
			intArr[random] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			ba[i] = intArr[i];
		}
		
		return ba;
	}
	
}

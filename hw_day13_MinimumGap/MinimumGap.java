package hw_day13_MinimumGap;

public class MinimumGap {

	public static int findMinimumGap(int[] arr) {
	    int minGap = Integer.MAX_VALUE;
	    boolean foundPair = false;
	    
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                minGap = Math.min(minGap, Math.abs(i - j));
	                foundPair = true;
	            }
	        }
	    }
	    
	    if (foundPair) {
	        return minGap;
	    } else {
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		
		int[] arr = {7, 1, 3, 4, 1, 7};
	    int minGap = findMinimumGap(arr);
	    System.out.println(minGap);

	}

}

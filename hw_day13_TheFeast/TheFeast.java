package hw_day13_TheFeast;

import java.util.Scanner;
public class TheFeast {

	public static void main(String[] args) {
		 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial amount of money (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the cost of a chocolate bar (c): ");
        int c = scanner.nextInt();
        System.out.print("Enter the number of wrappers needed for a free bar (m): ");
        int m = scanner.nextInt();

        int totalBars = chocolateFeast(n, c, m);
        System.out.println("Total number of chocolate bars that can be eaten: " + totalBars);

	}
	
	 public static int chocolateFeast(int n, int c, int m) {
	      
	        int initialBars = n / c;
	        int wrappers = initialBars;
	        int additionalBars = 0;

	        while (wrappers >= m) {
			
	            int exchangedBars = wrappers / m;
			
	            additionalBars += exchangedBars;

	            int remainingWrappers = wrappers % m;

	            wrappers = exchangedBars + remainingWrappers;
	        }

	        int totalBars = initialBars + additionalBars;

	        return totalBars;
	    }

}

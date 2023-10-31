package hw_day13_TheFeast;

import java.util.Scanner;
public class TheFeast {

	public static void main(String[] args) {
		 // Ask the user to input n, c, and m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial amount of money (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the cost of a chocolate bar (c): ");
        int c = scanner.nextInt();
        System.out.print("Enter the number of wrappers needed for a free bar (m): ");
        int m = scanner.nextInt();

        // Call the chocolateFeast function and print the result
        int totalBars = chocolateFeast(n, c, m);
        System.out.println("Total number of chocolate bars that can be eaten: " + totalBars);

	}
	
	 public static int chocolateFeast(int n, int c, int m) {
	        // Calculate the initial number of chocolate bars that can be bought
	        int initialBars = n / c;

	        // Initialize variables for tracking the number of wrappers and additional bars obtained
	        int wrappers = initialBars;
	        int additionalBars = 0;

	        // Continue exchanging wrappers for additional bars as long as there are enough wrappers
	        while (wrappers >= m) {
	            // Calculate the number of additional bars obtained from exchanging wrappers
	            int exchangedBars = wrappers / m;
	            additionalBars += exchangedBars;

	            // Calculate the remaining wrappers after exchanging
	            int remainingWrappers = wrappers % m;

	            // Update the total number of wrappers
	            wrappers = exchangedBars + remainingWrappers;
	        }

	        // Calculate the total number of chocolate bars that can be eaten
	        int totalBars = initialBars + additionalBars;

	        return totalBars;
	    }

}

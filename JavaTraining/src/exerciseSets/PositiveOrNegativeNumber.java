package exerciseSets;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// Declare and define variables
		Scanner in = new Scanner(System.in);
		int input;
		
		// Prompt user for input
		System.out.print("Please enter an integer: ");
		input = in.nextInt();
		
		// Test if input is positive or negative
		if (input < 0) {
			System.out.print("Negative");
		}
		else {
			System.out.println("Positive");
		}
		
		// Print result to console
		//System.out.print(input);

	}

}
